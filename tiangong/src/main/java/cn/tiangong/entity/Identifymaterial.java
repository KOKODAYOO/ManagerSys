package cn.tiangong.entity;

import java.io.Serializable;

public class Identifymaterial implements Serializable {
    private Integer id;

    private String content_url;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Identifymaterial withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent_url() {
        return content_url;
    }

    public Identifymaterial withContent_url(String content_url) {
        this.setContent_url(content_url);
        return this;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content_url=").append(content_url);
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
        Identifymaterial other = (Identifymaterial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContent_url() == null ? other.getContent_url() == null : this.getContent_url().equals(other.getContent_url()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContent_url() == null) ? 0 : getContent_url().hashCode());
        return result;
    }
}