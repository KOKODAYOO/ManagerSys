package cn.tiangong.vo;

import java.util.Date;
import java.util.Vector;

public class CommentVo {
	private int user_id;
	private int parent_id;
	private int id;
	private int like_count;
	private Date post_time;
	String username;
	String avatat_url;
	String content;
	private Vector<Object> list=null;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}
	public Date getPost_time() {
		return post_time;
	}
	public void setPost_time(Date post_time) {
		this.post_time = post_time;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAvatat_url() {
		return avatat_url;
	}
	public void setAvatat_url(String avatat_url) {
		this.avatat_url = avatat_url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Vector<Object> getList() {
		return list;
	}
	public void setList(Vector<Object> list) {
		this.list = list;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	
	
}
