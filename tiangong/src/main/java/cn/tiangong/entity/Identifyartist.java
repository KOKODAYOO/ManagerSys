package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Identifyartist implements Serializable {
    private Integer id;

    private Integer user_id;

    private Date post_time;

    private String video_url;

    private Integer isPass;

    private String notes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Identifyartist withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Identifyartist withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getPost_time() {
        return post_time;
    }

    public Identifyartist withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public String getVideo_url() {
        return video_url;
    }

    public Identifyartist withVideo_url(String video_url) {
        this.setVideo_url(video_url);
        return this;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public Identifyartist withIsPass(Integer isPass) {
        this.setIsPass(isPass);
        return this;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public String getNotes() {
        return notes;
    }

    public Identifyartist withNotes(String notes) {
        this.setNotes(notes);
        return this;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", post_time=").append(post_time);
        sb.append(", video_url=").append(video_url);
        sb.append(", isPass=").append(isPass);
        sb.append(", notes=").append(notes);
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
        Identifyartist other = (Identifyartist) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getVideo_url() == null ? other.getVideo_url() == null : this.getVideo_url().equals(other.getVideo_url()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getVideo_url() == null) ? 0 : getVideo_url().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        return result;
    }
}