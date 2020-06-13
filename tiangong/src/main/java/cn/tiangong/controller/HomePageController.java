package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.service.HomePageService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/homePage")
@ResponseBody
public class HomePageController {
	@Autowired
	private HomePageService homePageService;
	
	@GetMapping("/recommendArticles")
	public Msg recommendArticles() {
		return homePageService.recommendArticles();
	}
	
	@GetMapping("/latestVideo")
	public Msg latestVideo(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return homePageService.latestVideo(page);
	}
}
