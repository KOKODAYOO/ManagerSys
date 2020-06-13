package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class TbComments implements Serializable {
    private Integer id;

    private Integer user_id;

    private Integer item_id;

    private Boolean is_reply;

    private Integer parent_id;

    private Integer like_count;

    private Date post_time;

    private Boolean isdelete;

    private String content;

    private Integer type;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbComments withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public TbComments withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public TbComments withItem_id(Integer item_id) {
        this.setItem_id(item_id);
        return this;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Boolean getIs_reply() {
        return is_reply;
    }

    public TbComments withIs_reply(Boolean is_reply) {
        this.setIs_reply(is_reply);
        return this;
    }

    public void setIs_reply(Boolean is_reply) {
        this.is_reply = is_reply;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public TbComments withParent_id(Integer parent_id) {
        this.setParent_id(parent_id);
        return this;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public TbComments withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public Date getPost_time() {
        return post_time;
    }

    public TbComments withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public TbComments withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public String getContent() {
        return content;
    }

    public TbComments withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public TbComments withType(Integer type) {
        this.setType(type);
        return this;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public TbComments withStatus(Boolean status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", item_id=").append(item_id);
        sb.append(", is_reply=").append(is_reply);
        sb.append(", parent_id=").append(parent_id);
        sb.append(", like_count=").append(like_count);
        sb.append(", post_time=").append(post_time);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", content=").append(content);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
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
        TbComments other = (TbComments) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getIs_reply() == null ? other.getIs_reply() == null : this.getIs_reply().equals(other.getIs_reply()))
            && (this.getParent_id() == null ? other.getParent_id() == null : this.getParent_id().equals(other.getParent_id()))
            && (this.getLike_count() == null ? other.getLike_count() == null : this.getLike_count().equals(other.getLike_count()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getIs_reply() == null) ? 0 : getIs_reply().hashCode());
        result = prime * result + ((getParent_id() == null) ? 0 : getParent_id().hashCode());
        result = prime * result + ((getLike_count() == null) ? 0 : getLike_count().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}