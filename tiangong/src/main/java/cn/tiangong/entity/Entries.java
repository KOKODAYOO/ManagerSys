package cn.tiangong.entity;

import java.io.Serializable;

public class Entries implements Serializable {
    private Integer id;

    private String name;

    private String type;

    private Integer type_id;

    private Integer click;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Entries withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Entries withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public Entries withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getType_id() {
        return type_id;
    }

    public Entries withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getClick() {
        return click;
    }

    public Entries withClick(Integer click) {
        this.setClick(click);
        return this;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", type_id=").append(type_id);
        sb.append(", click=").append(click);
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
        Entries other = (Entries) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getClick() == null ? other.getClick() == null : this.getClick().equals(other.getClick()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getClick() == null) ? 0 : getClick().hashCode());
        return result;
    }
}