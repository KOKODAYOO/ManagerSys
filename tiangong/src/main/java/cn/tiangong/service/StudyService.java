package cn.tiangong.service;

import cn.tiangong.tool.Msg;

public interface StudyService {
	public Msg videoList(int page);
	public Msg courseList(int page);
	public Msg articleList(int page);
	public Msg viewVideoById(int id,int user_id);
	public Msg viewArticleById(int id,int user_id);
	public Msg viewCourseById(int id,int user_id);
}
