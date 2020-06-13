package cn.tiangong.entity;

import java.io.Serializable;

public class ActivityMembers implements Serializable {
    private Integer id;

    private Integer member_id;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public ActivityMembers withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public ActivityMembers withMember_id(Integer member_id) {
        this.setMember_id(member_id);
        return this;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", member_id=").append(member_id);
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
        ActivityMembers other = (ActivityMembers) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMember_id() == null ? other.getMember_id() == null : this.getMember_id().equals(other.getMember_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMember_id() == null) ? 0 : getMember_id().hashCode());
        return result;
    }
}