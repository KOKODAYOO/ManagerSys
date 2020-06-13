package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private Integer user_id;

    private Integer item_id;

    private Date browse_time;

    private Boolean isdelete;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public History withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public History withItem_id(Integer item_id) {
        this.setItem_id(item_id);
        return this;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Date getBrowse_time() {
        return browse_time;
    }

    public History withBrowse_time(Date browse_time) {
        this.setBrowse_time(browse_time);
        return this;
    }

    public void setBrowse_time(Date browse_time) {
        this.browse_time = browse_time;
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public History withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getType() {
        return type;
    }

    public History withType(Integer type) {
        this.setType(type);
        return this;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", user_id=").append(user_id);
        sb.append(", item_id=").append(item_id);
        sb.append(", browse_time=").append(browse_time);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", type=").append(type);
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
        History other = (History) that;
        return (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getItem_id() == null ? other.getItem_id() == null : this.getItem_id().equals(other.getItem_id()))
            && (this.getBrowse_time() == null ? other.getBrowse_time() == null : this.getBrowse_time().equals(other.getBrowse_time()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getItem_id() == null) ? 0 : getItem_id().hashCode());
        result = prime * result + ((getBrowse_time() == null) ? 0 : getBrowse_time().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}