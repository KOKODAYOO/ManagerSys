package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.service.FocusService;
import cn.tiangong.tool.Msg;

/**
 * 关注功能
 * @author Administrator
 *
 */


@Controller
@RequestMapping("/communicate")
@ResponseBody
public class FocusController{
	
	@Autowired
	private FocusService focusService;
	
	@RequestMapping(value="/focus",method=RequestMethod.POST)
	public Msg focus(int user_id,int focus_id){
		return focusService.focusUser(user_id, focus_id);
	}
	
	@GetMapping("/getFocusList")
	public Msg getFocusList(int user_id) {
		return focusService.getFocusList(user_id);
	}
	
	@GetMapping("/getFocusedList")
	public Msg getFocusedList(int user_id) {
		return focusService.getFocusedList(user_id);
	}
	
	@DeleteMapping("/deleteFocus")
	public Msg delete(int user_id,int focus_id) {
		return focusService.deleteFocus(user_id, focus_id);
	}
}
