package cn.tiangong.service;

import cn.tiangong.entity.TbComments;
import cn.tiangong.tool.Msg;

public interface CommentsService {
	public Msg comment(TbComments comments);
	public Msg getCommentsById(int type,int id);
	public Msg reportComment(int id,int type);
}
