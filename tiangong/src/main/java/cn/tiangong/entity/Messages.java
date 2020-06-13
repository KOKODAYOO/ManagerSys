package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Messages implements Serializable {
    private Integer id;

    private Integer sender_id;

    private Integer recipient_id;

    private String content;

    private Date post_time;

    private Boolean isdelete;

    private Boolean isread;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Messages withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender_id() {
        return sender_id;
    }

    public Messages withSender_id(Integer sender_id) {
        this.setSender_id(sender_id);
        return this;
    }

    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    public Integer getRecipient_id() {
        return recipient_id;
    }

    public Messages withRecipient_id(Integer recipient_id) {
        this.setRecipient_id(recipient_id);
        return this;
    }

    public void setRecipient_id(Integer recipient_id) {
        this.recipient_id = recipient_id;
    }

    public String getContent() {
        return content;
    }

    public Messages withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPost_time() {
        return post_time;
    }

    public Messages withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public Messages withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Boolean getIsread() {
        return isread;
    }

    public Messages withIsread(Boolean isread) {
        this.setIsread(isread);
        return this;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sender_id=").append(sender_id);
        sb.append(", recipient_id=").append(recipient_id);
        sb.append(", content=").append(content);
        sb.append(", post_time=").append(post_time);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", isread=").append(isread);
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
        Messages other = (Messages) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSender_id() == null ? other.getSender_id() == null : this.getSender_id().equals(other.getSender_id()))
            && (this.getRecipient_id() == null ? other.getRecipient_id() == null : this.getRecipient_id().equals(other.getRecipient_id()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getIsread() == null ? other.getIsread() == null : this.getIsread().equals(other.getIsread()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSender_id() == null) ? 0 : getSender_id().hashCode());
        result = prime * result + ((getRecipient_id() == null) ? 0 : getRecipient_id().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getIsread() == null) ? 0 : getIsread().hashCode());
        return result;
    }
}