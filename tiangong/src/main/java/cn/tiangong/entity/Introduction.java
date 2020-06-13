package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Introduction implements Serializable {
    private Integer id;

    private Integer entries_id;

    private Integer version;

    private Integer user_id;

    private Date time;

    private String reason;

    private Boolean is_used;

    private String cover_url;

    private Integer ischeck;

    private String des;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Introduction withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntries_id() {
        return entries_id;
    }

    public Introduction withEntries_id(Integer entries_id) {
        this.setEntries_id(entries_id);
        return this;
    }

    public void setEntries_id(Integer entries_id) {
        this.entries_id = entries_id;
    }

    public Integer getVersion() {
        return version;
    }

    public Introduction withVersion(Integer version) {
        this.setVersion(version);
        return this;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Introduction withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getTime() {
        return time;
    }

    public Introduction withTime(Date time) {
        this.setTime(time);
        return this;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public Introduction withReason(String reason) {
        this.setReason(reason);
        return this;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getIs_used() {
        return is_used;
    }

    public Introduction withIs_used(Boolean is_used) {
        this.setIs_used(is_used);
        return this;
    }

    public void setIs_used(Boolean is_used) {
        this.is_used = is_used;
    }

    public String getCover_url() {
        return cover_url;
    }

    public Introduction withCover_url(String cover_url) {
        this.setCover_url(cover_url);
        return this;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public Introduction withIscheck(Integer ischeck) {
        this.setIscheck(ischeck);
        return this;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public String getDes() {
        return des;
    }

    public Introduction withDes(String des) {
        this.setDes(des);
        return this;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getContent() {
        return content;
    }

    public Introduction withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", entries_id=").append(entries_id);
        sb.append(", version=").append(version);
        sb.append(", user_id=").append(user_id);
        sb.append(", time=").append(time);
        sb.append(", reason=").append(reason);
        sb.append(", is_used=").append(is_used);
        sb.append(", cover_url=").append(cover_url);
        sb.append(", ischeck=").append(ischeck);
        sb.append(", des=").append(des);
        sb.append(", content=").append(content);
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
        Introduction other = (Introduction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEntries_id() == null ? other.getEntries_id() == null : this.getEntries_id().equals(other.getEntries_id()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getIs_used() == null ? other.getIs_used() == null : this.getIs_used().equals(other.getIs_used()))
            && (this.getCover_url() == null ? other.getCover_url() == null : this.getCover_url().equals(other.getCover_url()))
            && (this.getIscheck() == null ? other.getIscheck() == null : this.getIscheck().equals(other.getIscheck()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEntries_id() == null) ? 0 : getEntries_id().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getIs_used() == null) ? 0 : getIs_used().hashCode());
        result = prime * result + ((getCover_url() == null) ? 0 : getCover_url().hashCode());
        result = prime * result + ((getIscheck() == null) ? 0 : getIscheck().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}