package cn.tiangong.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tiangong.dao.ActivityMapper;
import cn.tiangong.dao.ActivityMembersMapper;
import cn.tiangong.dao.ActivityPictureMapper;
import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.IdentifyartistMapper;
import cn.tiangong.dao.IdentifymaterialMapper;
import cn.tiangong.dao.TbCommentsMapper;
import cn.tiangong.dao.TbUserMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Activity;
import cn.tiangong.entity.ActivityExample;
import cn.tiangong.entity.ActivityMembersExample;
import cn.tiangong.entity.ActivityPicture;
import cn.tiangong.entity.ActivityPictureExample;
import cn.tiangong.entity.Article;
import cn.tiangong.entity.ArticleExample;
import cn.tiangong.entity.Course;
import cn.tiangong.entity.CourseExample;
import cn.tiangong.entity.Identifyartist;
import cn.tiangong.entity.IdentifymaterialExample;
import cn.tiangong.entity.TbComments;
import cn.tiangong.entity.TbCommentsExample;
import cn.tiangong.entity.TbUser;
import cn.tiangong.entity.TbUserExample;
import cn.tiangong.entity.Video;
import cn.tiangong.entity.VideoExample;
import cn.tiangong.service.CheckService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.IdentifyVo;
import cn.tiangong.vo.activityVo;

@Service
public class CheckServiceImpl implements CheckService{
	
	@Autowired
	private VideoMapper videos;
	
	@Autowired
	private CourseMapper courses;
	
	@Autowired
	private ArticleMapper articles;
	
	@Autowired
	private TbCommentsMapper comments;
	
	@Autowired
	private TbUserMapper users;
	
	@Autowired
	private ActivityMapper activity;
	
	@Autowired
	private ActivityPictureMapper picture;
	
	@Autowired
	private ActivityMembersMapper members;
	
	@Autowired
	private IdentifyartistMapper identify;
	
	@Autowired
	private IdentifymaterialMapper material;
	
	@Autowired
	private TbUserMapper userMapper;
	
	@Override
	public Msg videoAudit(boolean result,int id) {
		Video video=new Video();
		video.setId(id);
		video.setIscheck(true);
		video.setIsPass(result);
		videos.updateByPrimaryKeySelective(video);
		return Msg.success();
	}

	@Override
	public Msg videoList(Integer page) {
		VideoExample videoExample = new VideoExample();
		videoExample.setOrderByClause("release_time desc");
		videoExample.or().andIscheckEqualTo(false);
		PageHelper.startPage(page, 8);
		List<Video> list = videos.selectByExample(videoExample);
		PageInfo<Video> pages = new PageInfo<Video>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg articleAudit(boolean result,int id) {
		Article article = new Article();
		article.setId(id);
		article.setIscheck(true);
		article.setIsPass(result);
		articles.updateByPrimaryKeySelective(article);
		return Msg.success();
	}

	@Override
	public Msg articleList(Integer page) {
		ArticleExample articleExample = new ArticleExample();
		articleExample.setOrderByClause("id asc");
		articleExample.or().andIscheckEqualTo(false);
		PageHelper.startPage(page, 8);
		List<Article> list = articles.selectByExampleWithBLOBs(articleExample);
		//System.out.println(list.get(0).getContent_url());
		PageInfo<Article> pages = new PageInfo<Article>(list, 8);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg courseAudit(boolean result,int id) {
		Course course = new Course();
		course.setId(id);
		course.setIscheck(true);
		course.setIsPass(result);
		courses.updateByPrimaryKeySelective(course);
		return Msg.success();
	}

	@Override
	public Msg courseList(Integer page) {
		CourseExample courseExample = new CourseExample();
		courseExample.setOrderByClause("release_time desc");
		courseExample.or().andIscheckEqualTo(false);
		PageHelper.startPage(page, 8);
		List<Course> list = courses.selectByExample(courseExample);
		PageInfo<Course> pages = new PageInfo<Course>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg commentsAudit(boolean result,int id) {
		TbComments comment = new TbComments();
		comment.setId(id);
		comment.setIsdelete(result);
		comment.setStatus(false);
		comments.updateByPrimaryKeySelective(comment);
		return Msg.success();
	}

	@Override
	public Msg commentsList(Integer page) {
		TbCommentsExample commentsExample = new TbCommentsExample();
		commentsExample.setOrderByClause("post_time desc");
		commentsExample.or().andStatusEqualTo(true).andIsdeleteEqualTo(false);
		PageHelper.startPage(page, 8);
		List<TbComments> list = comments.selectByExample(commentsExample);
		PageInfo<TbComments> pages = new PageInfo<TbComments>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg freezeUser(int id) {
		TbUser user=new TbUser();
		user.setId(id);
		user.setStatus(false);
		users.updateByPrimaryKeySelective(user);
		return Msg.success();
	}

	@Override
	public Msg FreeUser(int id) {
		TbUser user=new TbUser();
		user.setId(id);
		user.setStatus(true);
		users.updateByPrimaryKeySelective(user);
		return Msg.success();
	}

	@Override
	public Msg getUserList(Integer page) {
		TbUserExample userExample = new TbUserExample();
		userExample.or().andLevelEqualTo(9);
		List<TbUser> list = users.selectByExample(userExample);
		return Msg.success().add("list", list);
	}

	@Override
	public Msg getActivities(Integer page) {
		
		ActivityExample activityExample = new ActivityExample();
		activityExample.setOrderByClause("time desc");;
		PageHelper.startPage(page, 8);
		List<Activity> activities=activity.selectByExample(activityExample);
		List<activityVo> list= new ArrayList<activityVo>();
		for (Activity a : activities) {
			activityVo vo=new activityVo();
			vo.setContent(a.getContent());
			vo.setCover_url(a.getCover_url());
			vo.setId(a.getId());
			vo.setIs_finish(a.getIs_finish());
			vo.setName(a.getName());
			vo.setTime(a.getTime());
			vo.setUser_id(a.getUser_id());
			ActivityPictureExample example= new ActivityPictureExample();
			example.or().andActivity_idEqualTo(a.getId());
			List<ActivityPicture> li = picture.selectByExample(example);
			vo.setPictures(li);
			list.add(vo);
		}
		
		PageInfo<activityVo> pages = new PageInfo<activityVo>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg deleteActivity(int id) {
		ActivityMembersExample activityMembersExample = new ActivityMembersExample();
		activityMembersExample.or().andIdEqualTo(id);
		members.deleteByExample(activityMembersExample);
		ActivityPictureExample activityPictureExample = new ActivityPictureExample();
		activityPictureExample.or().andActivity_idEqualTo(id);
		picture.deleteByExample(activityPictureExample);
		activity.deleteByPrimaryKey(id);
		return Msg.success();
	}

	@Override
	public void updateTime() {
		activity.updateTime();
		
	}

	@Override
	public Msg artistList(Integer page) {
		PageHelper.startPage(page, 8);
		List<Map<String, Object>> lis = identify.getArtists();
		List<IdentifyVo> list= new ArrayList<IdentifyVo>();
		for (Map<String, Object> li : lis) {
			IdentifyVo vo=new IdentifyVo();
			vo.setId((int)li.get("id"));
			vo.setIs_pass((Integer)li.get("isPass"));
			vo.setNotes((String)li.get("notes"));
			vo.setTime((Date)li.get("post_time"));
			vo.setUser_id((Integer)li.get("user_id"));
			vo.setGender((Boolean)li.get("gender"));
			vo.setVideo_url((String)li.get("video_url"));;
			vo.setUsername((String)li.get("username"));
			IdentifymaterialExample identifymaterialExample = new IdentifymaterialExample();
			identifymaterialExample.or().andIdEqualTo(vo.getId());
			vo.setPictures(material.selectByExample(identifymaterialExample));
			list.add(vo);
		}
		PageInfo<IdentifyVo> pages = new PageInfo<IdentifyVo>(list, 8);
		if(pages.getList().isEmpty()) return Msg.fail().add("pageInfo", pages);
		return Msg.success().add("pageInfo", pages);
	}

	@Override
	public Msg artistAudit(Integer result, int id,Integer user_id) {
		Identifyartist iiIdentifyartist = new Identifyartist();
		iiIdentifyartist.setIsPass(result);
		iiIdentifyartist.setId(id);
		if(result==1) {
			TbUser user = new TbUser();
			user.setId(id);
			user.setLevel(1);
			userMapper.updateByPrimaryKeySelective(user);
		}
		identify.updateByPrimaryKeySelective(iiIdentifyartist);
		return Msg.success();
	}

	@Override
	public Msg getMaterialById(Integer id) {
		IdentifymaterialExample example = new IdentifymaterialExample();
		example.or().andIdEqualTo(id);
		return Msg.success().add("list", material.selectByExample(example));
	}

}
