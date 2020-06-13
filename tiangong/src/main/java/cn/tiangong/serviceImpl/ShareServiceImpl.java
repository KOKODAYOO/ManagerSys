package cn.tiangong.serviceImpl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sun.net.httpserver.Authenticator.Success;

import cn.tiangong.dao.ArticleMapper;
import cn.tiangong.dao.CourseMapper;
import cn.tiangong.dao.VideoMapper;
import cn.tiangong.entity.Article;
import cn.tiangong.entity.Course;
import cn.tiangong.entity.Video;
import cn.tiangong.service.shareService;
import cn.tiangong.tool.FileUploadUtils;
import cn.tiangong.tool.Msg;

@Service
public class ShareServiceImpl implements shareService {
	
	@Autowired
	private ArticleMapper articleMapper;
	
	@Autowired 
	private VideoMapper videoMapper;
	
	@Autowired
	private CourseMapper courseMapper;



	@Override
	public Msg uploadVideo(String cover,String name,int user_id,String des,MultipartFile file,Integer craft_id,int type_id,HttpServletRequest request) {
		String contenPath=FileUploadUtils.fileUpload(file, request, "video");
		if(contenPath!=null) {
			Video video = new Video();
			video.setName(name);
			video.setCover_url(cover);
			video.setRelease_time(new Date());
			video.setVideo_url(contenPath);
			video.setDes(des);
			video.setType_id(type_id);
			video.setUser_id(user_id);
			video.setCraft_id(craft_id);
			videoMapper.insertSelective(video);
			return Msg.success();
		}
		return Msg.fail();
	}

	@Override
	public Msg uploadArticle(String cover,int user_id,String title,String text,Integer craft_id,int type_id,HttpServletRequest request) {
			Article article = new Article();
			article.setContent_url(text);
			article.setUser_id(user_id);
			article.setCover_url(cover);
			article.setCraft_id(craft_id);
			article.setType_id(type_id);
			article.setTitle(title);
			article.setPost_time(new Date());
			articleMapper.insertSelective(article);
			return Msg.success();
	}

	@Override
	public Msg uploadPicture( MultipartFile file,
			HttpServletRequest request) {
		String pathString=FileUploadUtils.fileUpload(file, request, "picture");
		return Msg.success().add("path", pathString);
	}

	@Override
	public Msg uploadCover(MultipartFile file, HttpServletRequest request) {
		String pathString=FileUploadUtils.fileUpload(file, request, "cover");
		return Msg.success().add("path", pathString);
	}

	@Override
	public Msg uploadCourse(String name, Integer user_id, String cover, MultipartFile file, String des, Integer type_id,
			Boolean tag, Integer series_id, Boolean is_paid, HttpServletRequest request) {
		String contenPath=FileUploadUtils.fileUpload(file, request, "course");
		if(contenPath!=null) {
			Course course = new Course();
			course.setCourse_url(contenPath);
			course.setDes(des);
			course.setCover_url(cover);
			course.setIs_paid(is_paid);
			course.setTag(tag);
			course.setUser_id(user_id);
			course.setType_id(type_id);
			course.setSeries_id(series_id);
			course.setRelease_time(new Date());
			course.setName(name);
			courseMapper.insertSelective(course);
			return Msg.success();
		}
		
	
		return Msg.fail();
	}

	@Override
	public Msg uploadmodel(MultipartFile file, HttpServletRequest request) {
		String pathString=FileUploadUtils.fileUpload(file, request, "model");
		return Msg.success().add("path", pathString);
	}





}
