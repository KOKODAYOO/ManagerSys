package cn.tiangong.service;

import cn.tiangong.tool.Msg;

public interface LikeService {
	public Msg videoLike(boolean islike,int id,int user_id);
	public Msg articleLike(boolean islike,int id,int user_id);
	public Msg courseLike(boolean islike,int id,int user_id);
	public Msg dynamicLike(boolean islike,int id,int user_id);
}
