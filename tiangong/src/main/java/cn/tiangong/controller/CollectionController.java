package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.aop.UserLog;
import cn.tiangong.entity.Collections;
import cn.tiangong.service.CollectionService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/favor")
@ResponseBody
public class CollectionController {
	@Autowired
	private CollectionService collectionService;
	
	@GetMapping("/myFavor")
	public Msg getMyfavorById(int id) {
		return collectionService.myFavor(id);
	}
	
	@PostMapping("/favorById")
	@UserLog
	public Msg favorById(Collections collection) {
		return collectionService.favorById(collection);
	}
	
	@DeleteMapping("/deleteById")
	public Msg delete(Collections collection) {
		return collectionService.deleteById(collection);
	}
}
