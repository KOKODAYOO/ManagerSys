package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.service.SearchService;
import cn.tiangong.tool.Msg;

@Controller
@ResponseBody
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	@GetMapping("/search")
	public Msg search(String text) {
		return searchService.search(text);
	}
}
