package cn.tiangong.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Craft implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    private Integer id;


    private String name;


    private Integer user_id;


    private String picture_url;

 
    private String d_url;


    private String type;


    private Integer type_id;


    private Date release_time;


    private Integer like_count;


    private Integer favor_count;


    private Integer comments_count;


    private Integer click_count;


    private Integer share_count;


    private Boolean isdelete;


    private Integer entries_id;


    private static final long serialVersionUID = 1L;


    public Integer getId() {
        return id;
    }


    public Craft withId(Integer id) {
        this.setId(id);
        return this;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public Craft withName(String name) {
        this.setName(name);
        return this;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getUser_id() {
        return user_id;
    }


    public Craft withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }


    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    public String getPicture_url() {
        return picture_url;
    }


    public Craft withPicture_url(String picture_url) {
        this.setPicture_url(picture_url);
        return this;
    }


    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }


    public String getd_url() {
        return d_url;
    }


    public Craft with3d_url(String d_url) {
        this.set3d_url(d_url);
        return this;
    }


    public void set3d_url(String d_url) {
        this.d_url = d_url;
    }


    public String getType() {
        return type;
    }


    public Craft withType(String type) {
        this.setType(type);
        return this;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Integer getType_id() {
        return type_id;
    }


    public Craft withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }


    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }


    public Date getRelease_time() {
        return release_time;
    }


    public Craft withRelease_time(Date release_time) {
        this.setRelease_time(release_time);
        return this;
    }


    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }


    public Integer getLike_count() {
        return like_count;
    }


    public Craft withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    /**
     * This method sets the value of the database column craft.like_count
     *
     * @param like_count the value for craft.like_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    /**
     * This method returns the value of the database column craft.favor_count
     *
     * @return the value of craft.favor_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Integer getFavor_count() {
        return favor_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withFavor_count(Integer favor_count) {
        this.setFavor_count(favor_count);
        return this;
    }

    /**
     * This method sets the value of the database column craft.favor_count
     *
     * @param favor_count the value for craft.favor_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setFavor_count(Integer favor_count) {
        this.favor_count = favor_count;
    }

    /**
     * This method returns the value of the database column craft.comments_count
     *
     * @return the value of craft.comments_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Integer getComments_count() {
        return comments_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withComments_count(Integer comments_count) {
        this.setComments_count(comments_count);
        return this;
    }

    /**
     * This method sets the value of the database column craft.comments_count
     *
     * @param comments_count the value for craft.comments_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    /**
     * This method returns the value of the database column craft.click_count
     *
     * @return the value of craft.click_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Integer getClick_count() {
        return click_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withClick_count(Integer click_count) {
        this.setClick_count(click_count);
        return this;
    }

    /**
     * This method sets the value of the database column craft.click_count
     *
     * @param click_count the value for craft.click_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    /**
     * This method returns the value of the database column craft.share_count
     *
     * @return the value of craft.share_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Integer getShare_count() {
        return share_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withShare_count(Integer share_count) {
        this.setShare_count(share_count);
        return this;
    }

    /**
     * This method sets the value of the database column craft.share_count
     *
     * @param share_count the value for craft.share_count
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    /**
     * This method returns the value of the database column craft.isdelete
     *
     * @return the value of craft.isdelete
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    /**
     * This method sets the value of the database column craft.isdelete
     *
     * @param isdelete the value for craft.isdelete
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method returns the value of the database column craft.entries_id
     *
     * @return the value of craft.entries_id
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Integer getEntries_id() {
        return entries_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Craft withEntries_id(Integer entries_id) {
        this.setEntries_id(entries_id);
        return this;
    }

    /**
     * This method sets the value of the database column craft.entries_id
     *
     * @param entries_id the value for craft.entries_id
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setEntries_id(Integer entries_id) {
        this.entries_id = entries_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", user_id=").append(user_id);
        sb.append(", picture_url=").append(picture_url);
        sb.append(", 3d_url=").append(d_url);
        sb.append(", type=").append(type);
        sb.append(", type_id=").append(type_id);
        sb.append(", release_time=").append(release_time);
        sb.append(", like_count=").append(like_count);
        sb.append(", favor_count=").append(favor_count);
        sb.append(", comments_count=").append(comments_count);
        sb.append(", click_count=").append(click_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", entries_id=").append(entries_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
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
        Craft other = (Craft) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getPicture_url() == null ? other.getPicture_url() == null : this.getPicture_url().equals(other.getPicture_url()))
            && (this.getd_url() == null ? other.getd_url() == null : this.getd_url().equals(other.getd_url()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getRelease_time() == null ? other.getRelease_time() == null : this.getRelease_time().equals(other.getRelease_time()))
            && (this.getLike_count() == null ? other.getLike_count() == null : this.getLike_count().equals(other.getLike_count()))
            && (this.getFavor_count() == null ? other.getFavor_count() == null : this.getFavor_count().equals(other.getFavor_count()))
            && (this.getComments_count() == null ? other.getComments_count() == null : this.getComments_count().equals(other.getComments_count()))
            && (this.getClick_count() == null ? other.getClick_count() == null : this.getClick_count().equals(other.getClick_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getEntries_id() == null ? other.getEntries_id() == null : this.getEntries_id().equals(other.getEntries_id()));
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getPicture_url() == null) ? 0 : getPicture_url().hashCode());
        result = prime * result + ((getd_url() == null) ? 0 : getd_url().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getRelease_time() == null) ? 0 : getRelease_time().hashCode());
        result = prime * result + ((getLike_count() == null) ? 0 : getLike_count().hashCode());
        result = prime * result + ((getFavor_count() == null) ? 0 : getFavor_count().hashCode());
        result = prime * result + ((getComments_count() == null) ? 0 : getComments_count().hashCode());
        result = prime * result + ((getClick_count() == null) ? 0 : getClick_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getEntries_id() == null) ? 0 : getEntries_id().hashCode());
        return result;
    }
}