package cn.tiangong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tiangong.service.CheckService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/check")
@ResponseBody
public class CheckController {
	@Autowired
	private CheckService checkService;
	
	@PutMapping("/videoAudit")
	public Msg videoAudit(boolean result,int id) {
		return checkService.videoAudit(result,id);
	}
	
	@GetMapping("/videoList")
	public Msg videoList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return checkService.videoList(page);
	}
	
	@PutMapping("/articleAudit")
	public Msg articleAudit(boolean result,int id) {
		return checkService.articleAudit(result, id);
	}
	
	@GetMapping("/articleList")
	public Msg articleList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return checkService.articleList(page);
	}
	
	@PutMapping("/courseAudit")
	public Msg courseAudit(boolean result,int id) {
		return checkService.courseAudit(result, id);
	}
	
	@GetMapping("/courseList")
	public Msg courseList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return checkService.courseList(page);
	}
	
	@PutMapping("/commentsAudit")
	public Msg commentsAudit(boolean result,int id) {
		return checkService.commentsAudit(result, id);
	}
	
	@GetMapping("/commentsList")
	public Msg commentsList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return checkService.commentsList(page);
	}
	
	@PutMapping("/freezeUser")
	public Msg freezeUser(int id) {
		return checkService.freezeUser(id);
	}
	
	@PutMapping("/freeUser")
	public Msg freeUser(int id) {
		return checkService.FreeUser(id);
	}
	
	@DeleteMapping("/deleteAct")
	public Msg deleteAct(int id) {
		return checkService.deleteActivity(id);
	}

	
	@GetMapping("/activityList")
	public Msg activityList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		checkService.updateTime();
		return checkService.getActivities(page);
	}
	
	@GetMapping("/artistList")
	public Msg artistList(@RequestParam(value = "page", defaultValue = "1") Integer page) {
		return checkService.artistList(page);
	}
	@GetMapping("/getMaterialById")
	public Msg getMaterialById(Integer id) {
		return checkService.getMaterialById(id);
	}
	
	@PutMapping("/artistAudit")
	public Msg artistAudit(Integer result, int id,Integer user_id) {
		return checkService.artistAudit(result, id, user_id);
	}
}
