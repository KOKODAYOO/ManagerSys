package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Dynamics implements Serializable {
    private Integer id;

    private Integer user_id;

    private String content;

    private Integer like_count;

    private Integer comments_count;

    private Integer share_count;

    private Date post_time;

    private Boolean isdelete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Dynamics withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public Dynamics withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getContent() {
        return content;
    }

    public Dynamics withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public Dynamics withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public Integer getComments_count() {
        return comments_count;
    }

    public Dynamics withComments_count(Integer comments_count) {
        this.setComments_count(comments_count);
        return this;
    }

    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    public Integer getShare_count() {
        return share_count;
    }

    public Dynamics withShare_count(Integer share_count) {
        this.setShare_count(share_count);
        return this;
    }

    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    public Date getPost_time() {
        return post_time;
    }

    public Dynamics withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public Dynamics withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", content=").append(content);
        sb.append(", like_count=").append(like_count);
        sb.append(", comments_count=").append(comments_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", post_time=").append(post_time);
        sb.append(", isdelete=").append(isdelete);
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
        Dynamics other = (Dynamics) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getLike_count() == null ? other.getLike_count() == null : this.getLike_count().equals(other.getLike_count()))
            && (this.getComments_count() == null ? other.getComments_count() == null : this.getComments_count().equals(other.getComments_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getLike_count() == null) ? 0 : getLike_count().hashCode());
        result = prime * result + ((getComments_count() == null) ? 0 : getComments_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }
}