package cn.tiangong.entity;

import java.io.Serializable;

public class Focus implements Serializable {
    private Integer user_id;

    private Integer focus_id;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public Focus withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getFocus_id() {
        return focus_id;
    }

    public Focus withFocus_id(Integer focus_id) {
        this.setFocus_id(focus_id);
        return this;
    }

    public void setFocus_id(Integer focus_id) {
        this.focus_id = focus_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", focus_id=").append(focus_id);
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
        Focus other = (Focus) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getFocus_id() == null ? other.getFocus_id() == null : this.getFocus_id().equals(other.getFocus_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getFocus_id() == null) ? 0 : getFocus_id().hashCode());
        return result;
    }

	public Focus(Integer user_id, Integer focus_id) {
		super();
		this.user_id = user_id;
		this.focus_id = focus_id;
	}
    
    
}