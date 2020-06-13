package cn.tiangong.vo;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import cn.tiangong.entity.ActivityPicture;

public class activityVo {
    private Integer id;

    private String name;

    private String cover_url;

    private String content;

    private Boolean is_finish;

    private Date time;

    private Integer user_id;
    
    private List<ActivityPicture> pictures;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCover_url() {
		return cover_url;
	}

	public void setCover_url(String cover_url) {
		this.cover_url = cover_url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getIs_finish() {
		return is_finish;
	}

	public void setIs_finish(Boolean is_finish) {
		this.is_finish = is_finish;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public List<ActivityPicture> getPictures() {
		return pictures;
	}

	public void setPictures(List<ActivityPicture> list) {
		this.pictures = list;
	}
    
    
}
