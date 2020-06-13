package cn.tiangong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.service.shareService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/share")
@ResponseBody
public class ShareController {
	@Autowired
	private shareService share;
	
	@PostMapping("/video")
	public Msg uploadVideo(@RequestParam(value = "user_id",required=true) Integer user_id,
			@RequestParam(value = "name",required=true) String name,
			@RequestParam(value = "cover",required=true) String cover,
			@RequestParam(value = "des",required=false) String des,
			@RequestParam(value = "type_id",required=true) Integer type_id,
			@RequestParam(value = "craft_id",required=false) Integer craft_id,
			@RequestParam(value = "file",required=true) MultipartFile file,
			HttpServletRequest request) {
		return share.uploadVideo(cover,name,user_id,des,file,craft_id,type_id,request);
	}
	
	@PostMapping("/picture")
	public Msg uploadPicture(@RequestParam(value = "file",required=true) MultipartFile file,
			HttpServletRequest request) {
		return share.uploadPicture(file,request);
		
	}
	
	@PostMapping("/cover")
	public Msg uploadCover(@RequestParam(value = "file",required=true) MultipartFile file,
			HttpServletRequest request) {
		return share.uploadCover(file, request);
		
	}
	
	@PostMapping("/article")
	public Msg uploadArticle(@RequestParam(value = "user_id",required=true) Integer user_id,
			@RequestParam(value = "title",required=true) String title,
			@RequestParam(value = "type_id",required=true) Integer type_id,
			@RequestParam(value = "craft_id",required=false) Integer craft_id,
			@RequestParam(value = "text",required=true) String file,
			@RequestParam(value = "cover",required=true) String cover,
			HttpServletRequest request) {
		return share.uploadArticle(cover, user_id, title, file, craft_id, type_id, request);
	}
	
	@PostMapping("/course")
	public Msg uploadCourse(@RequestParam(value = "user_id",required=true) Integer user_id,
			@RequestParam(value = "name",required=true) String name,
			@RequestParam(value = "cover",required=false) String cover,
			@RequestParam(value = "des",required=false) String des,
			@RequestParam(value = "type_id",required=true) Integer type_id,
			@RequestParam(value = "file",required=true) MultipartFile file,
			@RequestParam(value = "tag",required=true) Boolean tag,
			@RequestParam(value = "series_id",required=false) Integer series_id,
			@RequestParam(value = "is_paid",required=true) Boolean is_paid,
			HttpServletRequest request) {
		return share.uploadCourse(name, user_id, cover, file, des, type_id, tag, series_id, is_paid, request);
	}
	
	@PostMapping("/model")
	public Msg uploadmodel(@RequestParam(value = "file",required=true) MultipartFile file,
			HttpServletRequest request) {
		return share.uploadmodel(file, request);
	}
}
