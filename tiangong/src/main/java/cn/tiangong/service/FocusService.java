package cn.tiangong.service;

import cn.tiangong.tool.Msg;

public interface FocusService {
	public Msg focusUser(int user_id,int focus_id);
	public Msg getFocusList(int user_id);
	public Msg getFocusedList(int user_id);
	public Msg deleteFocus(int user_id,int focus_id);
}
