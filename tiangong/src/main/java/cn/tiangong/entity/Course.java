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
public class Course implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String cover_url;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String article_url;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String course_url;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Date release_time;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean status;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer like_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer favor_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer comments_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer click_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer share_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean isdelete;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String des;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private String type;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer type_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean isPass;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean ischeck;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean tag;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Integer series_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private Boolean is_paid;

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column course.user_id
     *
     * @return the value of course.user_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column course.user_id
     *
     * @param user_id the value for course.user_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column course.cover_url
     *
     * @return the value of course.cover_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getCover_url() {
        return cover_url;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withCover_url(String cover_url) {
        this.setCover_url(cover_url);
        return this;
    }

    /**
     * This method sets the value of the database column course.cover_url
     *
     * @param cover_url the value for course.cover_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    /**
     * This method returns the value of the database column course.article_url
     *
     * @return the value of course.article_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getArticle_url() {
        return article_url;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withArticle_url(String article_url) {
        this.setArticle_url(article_url);
        return this;
    }

    /**
     * This method sets the value of the database column course.article_url
     *
     * @param article_url the value for course.article_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setArticle_url(String article_url) {
        this.article_url = article_url;
    }

    /**
     * This method returns the value of the database column course.course_url
     *
     * @return the value of course.course_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getCourse_url() {
        return course_url;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withCourse_url(String course_url) {
        this.setCourse_url(course_url);
        return this;
    }

    /**
     * This method sets the value of the database column course.course_url
     *
     * @param course_url the value for course.course_url
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setCourse_url(String course_url) {
        this.course_url = course_url;
    }

    /**
     * This method returns the value of the database column course.release_time
     *
     * @return the value of course.release_time
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Date getRelease_time() {
        return release_time;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withRelease_time(Date release_time) {
        this.setRelease_time(release_time);
        return this;
    }

    /**
     * This method sets the value of the database column course.release_time
     *
     * @param release_time the value for course.release_time
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }

    /**
     * This method returns the value of the database column course.status
     *
     * @return the value of course.status
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withStatus(Boolean status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column course.status
     *
     * @param status the value for course.status
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column course.like_count
     *
     * @return the value of course.like_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getLike_count() {
        return like_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    /**
     * This method sets the value of the database column course.like_count
     *
     * @param like_count the value for course.like_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    /**
     * This method returns the value of the database column course.favor_count
     *
     * @return the value of course.favor_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getFavor_count() {
        return favor_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withFavor_count(Integer favor_count) {
        this.setFavor_count(favor_count);
        return this;
    }

    /**
     * This method sets the value of the database column course.favor_count
     *
     * @param favor_count the value for course.favor_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setFavor_count(Integer favor_count) {
        this.favor_count = favor_count;
    }

    /**
     * This method returns the value of the database column course.comments_count
     *
     * @return the value of course.comments_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getComments_count() {
        return comments_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withComments_count(Integer comments_count) {
        this.setComments_count(comments_count);
        return this;
    }

    /**
     * This method sets the value of the database column course.comments_count
     *
     * @param comments_count the value for course.comments_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    /**
     * This method returns the value of the database column course.click_count
     *
     * @return the value of course.click_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getClick_count() {
        return click_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withClick_count(Integer click_count) {
        this.setClick_count(click_count);
        return this;
    }

    /**
     * This method sets the value of the database column course.click_count
     *
     * @param click_count the value for course.click_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    /**
     * This method returns the value of the database column course.share_count
     *
     * @return the value of course.share_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getShare_count() {
        return share_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withShare_count(Integer share_count) {
        this.setShare_count(share_count);
        return this;
    }

    /**
     * This method sets the value of the database column course.share_count
     *
     * @param share_count the value for course.share_count
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    /**
     * This method returns the value of the database column course.isdelete
     *
     * @return the value of course.isdelete
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    /**
     * This method sets the value of the database column course.isdelete
     *
     * @param isdelete the value for course.isdelete
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method returns the value of the database column course.des
     *
     * @return the value of course.des
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getDes() {
        return des;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withDes(String des) {
        this.setDes(des);
        return this;
    }

    /**
     * This method sets the value of the database column course.des
     *
     * @param des the value for course.des
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * This method returns the value of the database column course.type
     *
     * @return the value of course.type
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column course.type
     *
     * @param type the value for course.type
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column course.type_id
     *
     * @return the value of course.type_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    /**
     * This method sets the value of the database column course.type_id
     *
     * @param type_id the value for course.type_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method returns the value of the database column course.isPass
     *
     * @return the value of course.isPass
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getIsPass() {
        return isPass;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withIsPass(Boolean isPass) {
        this.setIsPass(isPass);
        return this;
    }

    /**
     * This method sets the value of the database column course.isPass
     *
     * @param isPass the value for course.isPass
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    /**
     * This method returns the value of the database column course.ischeck
     *
     * @return the value of course.ischeck
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getIscheck() {
        return ischeck;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withIscheck(Boolean ischeck) {
        this.setIscheck(ischeck);
        return this;
    }

    /**
     * This method sets the value of the database column course.ischeck
     *
     * @param ischeck the value for course.ischeck
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    /**
     * This method returns the value of the database column course.tag
     *
     * @return the value of course.tag
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getTag() {
        return tag;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withTag(Boolean tag) {
        this.setTag(tag);
        return this;
    }

    /**
     * This method sets the value of the database column course.tag
     *
     * @param tag the value for course.tag
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setTag(Boolean tag) {
        this.tag = tag;
    }

    /**
     * This method returns the value of the database column course.series_id
     *
     * @return the value of course.series_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Integer getSeries_id() {
        return series_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withSeries_id(Integer series_id) {
        this.setSeries_id(series_id);
        return this;
    }

    /**
     * This method sets the value of the database column course.series_id
     *
     * @param series_id the value for course.series_id
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setSeries_id(Integer series_id) {
        this.series_id = series_id;
    }

    /**
     * This method returns the value of the database column course.is_paid
     *
     * @return the value of course.is_paid
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Boolean getIs_paid() {
        return is_paid;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public Course withIs_paid(Boolean is_paid) {
        this.setIs_paid(is_paid);
        return this;
    }

    /**
     * This method sets the value of the database column course.is_paid
     *
     * @param is_paid the value for course.is_paid
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    public void setIs_paid(Boolean is_paid) {
        this.is_paid = is_paid;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
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
        sb.append(", cover_url=").append(cover_url);
        sb.append(", article_url=").append(article_url);
        sb.append(", course_url=").append(course_url);
        sb.append(", release_time=").append(release_time);
        sb.append(", status=").append(status);
        sb.append(", like_count=").append(like_count);
        sb.append(", favor_count=").append(favor_count);
        sb.append(", comments_count=").append(comments_count);
        sb.append(", click_count=").append(click_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", des=").append(des);
        sb.append(", type=").append(type);
        sb.append(", type_id=").append(type_id);
        sb.append(", isPass=").append(isPass);
        sb.append(", ischeck=").append(ischeck);
        sb.append(", tag=").append(tag);
        sb.append(", series_id=").append(series_id);
        sb.append(", is_paid=").append(is_paid);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
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
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getCover_url() == null ? other.getCover_url() == null : this.getCover_url().equals(other.getCover_url()))
            && (this.getArticle_url() == null ? other.getArticle_url() == null : this.getArticle_url().equals(other.getArticle_url()))
            && (this.getCourse_url() == null ? other.getCourse_url() == null : this.getCourse_url().equals(other.getCourse_url()))
            && (this.getRelease_time() == null ? other.getRelease_time() == null : this.getRelease_time().equals(other.getRelease_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLike_count() == null ? other.getLike_count() == null : this.getLike_count().equals(other.getLike_count()))
            && (this.getFavor_count() == null ? other.getFavor_count() == null : this.getFavor_count().equals(other.getFavor_count()))
            && (this.getComments_count() == null ? other.getComments_count() == null : this.getComments_count().equals(other.getComments_count()))
            && (this.getClick_count() == null ? other.getClick_count() == null : this.getClick_count().equals(other.getClick_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getDes() == null ? other.getDes() == null : this.getDes().equals(other.getDes()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getIscheck() == null ? other.getIscheck() == null : this.getIscheck().equals(other.getIscheck()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getSeries_id() == null ? other.getSeries_id() == null : this.getSeries_id().equals(other.getSeries_id()))
            && (this.getIs_paid() == null ? other.getIs_paid() == null : this.getIs_paid().equals(other.getIs_paid()));
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:24 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getCover_url() == null) ? 0 : getCover_url().hashCode());
        result = prime * result + ((getArticle_url() == null) ? 0 : getArticle_url().hashCode());
        result = prime * result + ((getCourse_url() == null) ? 0 : getCourse_url().hashCode());
        result = prime * result + ((getRelease_time() == null) ? 0 : getRelease_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLike_count() == null) ? 0 : getLike_count().hashCode());
        result = prime * result + ((getFavor_count() == null) ? 0 : getFavor_count().hashCode());
        result = prime * result + ((getComments_count() == null) ? 0 : getComments_count().hashCode());
        result = prime * result + ((getClick_count() == null) ? 0 : getClick_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getDes() == null) ? 0 : getDes().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getIscheck() == null) ? 0 : getIscheck().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getSeries_id() == null) ? 0 : getSeries_id().hashCode());
        result = prime * result + ((getIs_paid() == null) ? 0 : getIs_paid().hashCode());
        return result;
    }
}