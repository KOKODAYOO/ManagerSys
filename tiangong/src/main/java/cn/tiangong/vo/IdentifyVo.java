package cn.tiangong.vo;

import java.util.Date;
import java.util.List;

import cn.tiangong.entity.Identifymaterial;

public class IdentifyVo {
    private Integer id;
    
    private Integer user_id;

    private String username;

    private String video_url;

    private String notes;

    private Integer is_pass;

    private Date time;
    
    private Boolean gender;
    
    private List<Identifymaterial> pictures;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getIs_pass() {
		return is_pass;
	}

	public void setIs_pass(Integer is_pass) {
		this.is_pass = is_pass;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<Identifymaterial> getPictures() {
		return pictures;
	}

	public void setPictures(List<Identifymaterial> pictures) {
		this.pictures = pictures;
	}

	public Boolean isGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}
    
    
}
