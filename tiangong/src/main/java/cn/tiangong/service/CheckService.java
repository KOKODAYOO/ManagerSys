package cn.tiangong.service;

import cn.tiangong.tool.Msg;

public interface CheckService {
	public Msg videoAudit(boolean result,int id);
	public Msg videoList(Integer page);
	public Msg articleAudit(boolean result,int id);
	public Msg articleList(Integer page);
	public Msg courseAudit(boolean result,int id);
	public Msg courseList(Integer page);
	public Msg commentsAudit(boolean result,int id);
	public Msg commentsList(Integer page);
	public Msg freezeUser(int id);
	public Msg FreeUser(int id);
	public Msg getUserList(Integer page);
	public Msg getActivities(Integer page);
	public Msg deleteActivity(int id);
	public Msg artistList(Integer page);
	public Msg artistAudit(Integer result,int id,Integer user_id);
	public Msg getMaterialById(Integer id);
	public void updateTime();
}
