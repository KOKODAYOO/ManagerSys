package cn.tiangong.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Article;
import cn.tiangong.entity.Course;
import cn.tiangong.entity.Video;
import cn.tiangong.tool.Msg;

public interface shareService {
	public Msg uploadCourse(String name,Integer user_id,String cover,MultipartFile file,String des,Integer type_id,Boolean tag,Integer series_id,Boolean is_paid,HttpServletRequest request);
	public Msg uploadVideo(String cover,String name,int user_id,String des,MultipartFile file,Integer craft_id,int type_id,HttpServletRequest request);
	public Msg uploadArticle(String cover,int user_id,String title,String text,Integer craft_id,int type_id,HttpServletRequest request);
	public Msg uploadPicture(MultipartFile file,HttpServletRequest request);
	public Msg uploadCover(MultipartFile file,HttpServletRequest request);
	public Msg uploadmodel(MultipartFile file,HttpServletRequest request);
}
