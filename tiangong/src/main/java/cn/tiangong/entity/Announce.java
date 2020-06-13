package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class Announce implements Serializable {
    private Integer id;

    private Integer sender_id;

    private String content;

    private Date post_time;

    private Boolean isdelete;

    private Integer click_count;

    private String title;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Announce withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender_id() {
        return sender_id;
    }

    public Announce withSender_id(Integer sender_id) {
        this.setSender_id(sender_id);
        return this;
    }

    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    public String getContent() {
        return content;
    }

    public Announce withContent(String content) {
        this.setContent(content);
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPost_time() {
        return post_time;
    }

    public Announce withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public Announce withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getClick_count() {
        return click_count;
    }

    public Announce withClick_count(Integer click_count) {
        this.setClick_count(click_count);
        return this;
    }

    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    public String getTitle() {
        return title;
    }

    public Announce withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sender_id=").append(sender_id);
        sb.append(", content=").append(content);
        sb.append(", post_time=").append(post_time);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", click_count=").append(click_count);
        sb.append(", title=").append(title);
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
        Announce other = (Announce) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSender_id() == null ? other.getSender_id() == null : this.getSender_id().equals(other.getSender_id()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getClick_count() == null ? other.getClick_count() == null : this.getClick_count().equals(other.getClick_count()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSender_id() == null) ? 0 : getSender_id().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getClick_count() == null) ? 0 : getClick_count().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return result;
    }
}