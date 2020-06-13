package cn.tiangong.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Types implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    private String name;

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column types.id
     *
     * @return the value of types.id
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public Types withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column types.id
     *
     * @param id the value for types.id
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column types.name
     *
     * @return the value of types.name
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public Types withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column types.name
     *
     * @param name the value for types.name
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
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
        Types other = (Types) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:51 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}