package cn.tiangong.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tiangong.dao.ActivityMapper;
import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.EntriesMapper;
import cn.tiangong.dao.IntroductionMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Activity;
import cn.tiangong.entity.ActivityExample;
import cn.tiangong.entity.Article;
import cn.tiangong.entity.ArticleExample;
import cn.tiangong.entity.Course;
import cn.tiangong.entity.CourseExample;
import cn.tiangong.entity.Entries;
import cn.tiangong.entity.EntriesExample;
import cn.tiangong.entity.Introduction;
import cn.tiangong.entity.IntroductionExample;
import cn.tiangong.entity.Video;
import cn.tiangong.entity.VideoExample;
import cn.tiangong.service.SearchService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.introductionVo;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private VideoMapper video;
	
	@Autowired
	private CourseMapper course;
	
	@Autowired
	private ArticleMapper article;
	
	@Autowired
	private ActivityMapper activity;
	
	@Autowired
	private EntriesMapper entries;
	
	@Autowired
	private IntroductionMapper introduction;
	
	@Override
	public Msg search(String string) {
		Msg msg = Msg.success();
		String orderByClause = "click_count desc,post_time desc";
		ArticleExample articleExample = new ArticleExample();
		articleExample.setOrderByClause(orderByClause);
		ArticleExample.Criteria criteria = articleExample.createCriteria();
		criteria.andTitleLike('%'+string+'%');
		articleExample.or(criteria);
		List<Article> articles=article.selectByExample(articleExample);
		msg.add("article", articles);
		
		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause(orderByClause);
		VideoExample.Criteria criteria2 = videoExample.createCriteria();
		criteria2.andNameLike('%'+string+'%');
		videoExample.or(criteria2);
		List<Video> videos = video.selectByExample(videoExample);
		msg.add("video", videos);
		
		CourseExample courseExample = new CourseExample();
		courseExample.setOrderByClause(orderByClause);
		CourseExample.Criteria criteria3 = courseExample.createCriteria();
		criteria3.andNameLike('%'+string+'%');
		courseExample.or(criteria3);
		List<Course> courses = course.selectByExample(courseExample);
		msg.add("course", courses);
		
		ActivityExample activityExample = new ActivityExample();
		articleExample.setOrderByClause(orderByClause);
		ActivityExample.Criteria criteria4=activityExample.createCriteria();
		criteria4.andNameLike('%'+string+'%');
		activityExample.or(criteria4);
		List<Activity> activities = activity.selectByExample(activityExample);
		msg.add("activities", activities);
		
		
		EntriesExample entriesExample = new EntriesExample();
		IntroductionExample introductionExample =new IntroductionExample();
		introductionExample.or().andIs_usedEqualTo(true);
		EntriesExample.Criteria criteria5 = entriesExample.createCriteria();
		criteria5.andNameLike('%'+string+'%');
		List<Entries> eList = entries.selectByExample(entriesExample);
		List<Introduction> introductions = introduction.selectByExample(introductionExample);
		Map<Integer, Object> result= new HashMap<Integer, Object>();
		for (Entries e : eList) {
			for (Introduction i : introductions) {
				if(i.getEntries_id()==e.getId()) {
					introductionVo intro = new introductionVo();
					intro.setContent(i.getContent());
					intro.setCover_url(i.getCover_url());
					intro.setEntries_id(i.getEntries_id());
					intro.setName(e.getName());
					intro.setId(i.getId());
					intro.setIs_used(i.getIs_used());
					intro.setIscheck(i.getIscheck());
					intro.setTime(i.getTime());
					intro.setReason(i.getReason());
					intro.setVersion(i.getVersion());
					intro.setUser_id(i.getUser_id());
					result.put(e.getId(), intro);
				}
			}
		}
		msg.add("introduction", result.values());
		
		return msg;
	}

}
