package cn.tiangong.service;

import cn.tiangong.entity.Messages;
import cn.tiangong.tool.Msg;


public interface MessageService {
	public Msg getMessagesList(int user_id);
	public Msg call(Messages message);
	public Msg deleteMeaasge(int id);
}
