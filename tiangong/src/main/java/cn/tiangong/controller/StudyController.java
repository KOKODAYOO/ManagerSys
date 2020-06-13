package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.dao.HistoryMapper;
import cn.tiangong.service.StudyService;
import cn.tiangong.tool.Msg;
import cn.tiangong.vo.introductionVo;

@Controller
@RequestMapping("/study")
@ResponseBody
public class StudyController {
	@Autowired
	private StudyService service;
	
	
	@GetMapping("/videoList")
	public Msg videoList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return service.videoList(page);
	}
	
	@GetMapping("/courseList")
	public Msg courseList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return service.courseList(page);
	}
	
	@GetMapping("/articleList")
	public Msg article(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return service.articleList(page);
	}
	
	@GetMapping("/viewVideoById")
	public Msg viewVideoById(int id,int user_id) {
		return service.viewVideoById(id,user_id);
	}
	
	@GetMapping("/viewArticleById")
	public Msg viewArticleById(int id,int user_id) {
		return service.viewArticleById(id,user_id);
	}
	
	@GetMapping("/viewCourseById")
	public Msg viewCourseById(int id,int user_id) {
		return service.viewCourseById(id,user_id);
	}
	
	
}
