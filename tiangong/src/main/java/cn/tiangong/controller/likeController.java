package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.aop.UserLog;
import cn.tiangong.entity.Like;
import cn.tiangong.service.LikeService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/like")
@ResponseBody
public class likeController {
	@Autowired
	private LikeService likeService;
	
	@PostMapping("/video")
	@UserLog
	public Msg likeVideo(boolean islike,int id,int user_id) {
		return likeService.videoLike(islike, id,user_id);
	}
	
	@PostMapping("/course")
	@UserLog
	public Msg likeCourse(boolean islike,int id,int user_id) {
		return likeService.courseLike(islike, id,user_id);
	}
	
	@PostMapping("/article")
	@UserLog
	public Msg likeArticle(boolean islike,int id,int user_id) {
		return likeService.articleLike(islike,id,user_id);
	}
	
	@PostMapping("/dynamics")
	@UserLog
	public Msg likedynamics(boolean islike,int id,int user_id) {
		return likeService.articleLike(islike, id,user_id);
	}
}
