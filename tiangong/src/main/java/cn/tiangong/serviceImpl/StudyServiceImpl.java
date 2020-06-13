package cn.tiangong.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.HistoryMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Article;
import cn.tiangong.entity.ArticleExample;
import cn.tiangong.entity.Course;
import cn.tiangong.entity.CourseExample;
import cn.tiangong.entity.History;
import cn.tiangong.entity.Video;
import cn.tiangong.entity.VideoExample;
import cn.tiangong.service.StudyService;
import cn.tiangong.tool.Msg;

@Service
public class StudyServiceImpl implements StudyService{

	@Autowired
	private VideoMapper videos;
	
	@Autowired
	private CourseMapper courses;
	
	@Autowired
	private ArticleMapper articles;
	
	@Autowired
	private HistoryMapper history;
		
	@Override
	public Msg videoList(int page) {
		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause("release_time desc");
		videoExample.or().andIsPassEqualTo(true);
		PageHelper.startPage(page, 10);
		List<Video> list=videos.selectByExample(videoExample);
		PageInfo<Video> pages= new PageInfo<Video>(list, page);
		return Msg.success().add("list", pages);
	}

	@Override
	public Msg courseList(int page) {
		CourseExample courseExample = new CourseExample();
		courseExample.setOrderByClause("release_time desc");
		courseExample.or().andIsPassEqualTo(true);
		PageHelper.startPage(page, 10);
		List<Course> list=courses.selectByExample(courseExample);
		PageInfo<Course> pages= new PageInfo<Course>(list, page);
		return Msg.success().add("list", pages);
	}

	@Override
	public Msg articleList(int page) {
		ArticleExample articleExample = new ArticleExample(); 
		articleExample.setOrderByClause("post_time desc");
		articleExample.or().andIsPassEqualTo(true);
		PageHelper.startPage(page, 10);
		List<Article> list=articles.selectByExample(articleExample);
		PageInfo<Article> pages= new PageInfo<Article>(list, page);
		return Msg.success().add("list", pages);
	}

	@Override
	public Msg viewVideoById(int id,int user_id) {
		History h = new History();
		h.setItem_id(id);
		h.setUser_id(user_id);
		h.setType(2);
		history.insertSelective(h);
		return Msg.success().add("video", videos.selectByPrimaryKey(id));
	}

	@Override
	public Msg viewArticleById(int id, int user_id) {
		History h = new History();
		h.setItem_id(id);
		h.setUser_id(user_id);
		h.setType(1);
		history.insertSelective(h);
		return Msg.success().add("video", articles.selectByPrimaryKey(id));
	}

	@Override
	public Msg viewCourseById(int id, int user_id) {
		History h = new History();
		h.setItem_id(id);
		h.setUser_id(user_id);
		h.setType(3);
		history.insertSelective(h);
		return Msg.success().add("video", courses.selectByPrimaryKey(id));
	}
	
	

}
