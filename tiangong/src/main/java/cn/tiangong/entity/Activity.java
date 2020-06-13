package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    private Integer id;

    private String name;

    private String cover_url;

    private String content;

    private Boolean is_finish;

    private Date time;

    private Integer user_id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Activity withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Activity withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover_url() {
        return cover_url;
    }

    public Activity withCover_url(String cover_url) {
        this.setCover_url(cover_url);
        return this;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getContent() {
        return content;
    }

    public Activity withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIs_finish() {
        return is_finish;
    }

    public Activity withIs_finish(Boolean is_finish) {
        this.setIs_finish(is_finish);
        return this;
    }

    public void setIs_finish(Boolean is_finish) {
        this.is_finish = is_finish;
    }

    public Date getTime() {
        return time;
    }

    public Activity withTime(Date time) {
        this.setTime(time);
        return this;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Activity withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", cover_url=").append(cover_url);
        sb.append(", content=").append(content);
        sb.append(", is_finish=").append(is_finish);
        sb.append(", time=").append(time);
        sb.append(", user_id=").append(user_id);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Activity other = (Activity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCover_url() == null ? other.getCover_url() == null : this.getCover_url().equals(other.getCover_url()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getIs_finish() == null ? other.getIs_finish() == null : this.getIs_finish().equals(other.getIs_finish()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCover_url() == null) ? 0 : getCover_url().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getIs_finish() == null) ? 0 : getIs_finish().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        return result;
    }

	public Activity(String name, String cover_url, String content, Date time, Integer user_id) {
		super();
		this.name = name;
		this.cover_url = cover_url;
		this.content = content;
		this.time = time;
		this.user_id = user_id;
	}

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
    
}