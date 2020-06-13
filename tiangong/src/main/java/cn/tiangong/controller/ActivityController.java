package cn.tiangong.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Activity;
import cn.tiangong.entity.ActivityMembers;
import cn.tiangong.service.ActivityService;
import cn.tiangong.tool.Msg;

@Controller
@RequestMapping("/communicate")
@ResponseBody
public class ActivityController {
	
	@Autowired
	private ActivityService activityService;
	
	@GetMapping("/getActivities")
	public Msg getActivities(@RequestParam(value = "page", defaultValue = "1") Integer page){
		activityService.updateTime();
		return activityService.getActivities(page);
	}
	
	@PostMapping("/newActivity")
	public Msg newActivity(@RequestParam(value="user_id") int id,
			@RequestParam(value="content") String content,
			@RequestParam(value="time",required=false) Long time,
			@RequestParam(value="cover_url") String cover_url,
			@RequestParam(value="name") String name,
			@RequestParam(value="files") MultipartFile[] files,
			HttpServletRequest request) {
		//System.out.println(time);
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String d = format.format(time);
	    Date date=null;;
		try {
			date = format.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    Activity activity = new Activity(name,cover_url,content, date, id);

		return activityService.newActivity(activity,files,request);
	}
	
	@PostMapping("/joinActivity")
	public Msg joinActivity(ActivityMembers activityMembers) {
		return activityService.joinActivity(activityMembers);
	}
	
	@GetMapping("/getMembers")
	public Msg getMembers(int id) {
		return activityService.getMembers(id);
	}
	
	@GetMapping("getActivityById")
	public Msg getActById(int id) {
		return activityService.getActById(id);
	}
}
