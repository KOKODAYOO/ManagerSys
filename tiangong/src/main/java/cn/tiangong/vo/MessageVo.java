package cn.tiangong.vo;


import java.util.Vector;

import cn.tiangong.entity.Messages;   	

public class MessageVo {

	private int talker_id;
	private String talker_name;
	private String url;
	Vector<Object> list=null;
	public int getTalker_id() {
		return talker_id;
	}
	public void setTalker_id(int recipient_id) {
		this.talker_id = recipient_id;
	}
	public String getTalker_name() {
		return talker_name;
	}
	public void setTalker_name(String recipient_name) {
		this.talker_name = recipient_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Vector<Object> getList() {
		return list;
	}
	public void setList(Vector<Object> list) {
		this.list = list;
	}
	
	
}
