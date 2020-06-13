package cn.tiangong.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import cn.tiangong.entity.Activity;
import cn.tiangong.entity.ActivityMembers;
import cn.tiangong.tool.Msg;

public interface ActivityService {
	public Msg getActivities(Integer page);
	public Msg newActivity(Activity activity,MultipartFile[] files,HttpServletRequest request);
	public Msg joinActivity(ActivityMembers activityMembers);
	public Msg getMembers(int id);
	public Msg getActById(int id);
	public void updateTime();
}
