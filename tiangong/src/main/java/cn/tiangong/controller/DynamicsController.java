package cn.tiangong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Dynamics;
import cn.tiangong.service.DynamicsService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/communicate")
@ResponseBody
public class DynamicsController {
	@Autowired
	private DynamicsService dynamicsService;
	
	@GetMapping("/myDynamics")
	public Msg myDynamics(int id) {
		return dynamicsService.getMyDynamics(id);
	}
	
	@PostMapping("/postDynamics")
	public Msg postDynamics(@RequestParam(value="id",required=true) int id,
			@RequestParam(value="content",required=true)String content,
		@RequestParam(value="files",required=false)	MultipartFile[] files,
		HttpServletRequest request) {
		return dynamicsService.postDynamics(id,content,files,request);
	}
	
	@GetMapping("/allMyDynamics")
	public Msg allMyDynamics(int id) {
		return dynamicsService.getAllDynamics(id);
	}
	
	@GetMapping("/deleteDynamics")
	public Msg deleteDynamics(int id) {
		return dynamicsService.deleteDynamics(id);
	}
}
