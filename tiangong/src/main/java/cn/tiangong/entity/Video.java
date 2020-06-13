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
public class Video implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private String name;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private String cover_url;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private String video_url;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Date release_time;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Boolean status;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer like_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer favor_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer comments_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer click_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer share_count;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Boolean isdelete;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private String des;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private String type;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer type_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Integer craft_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Boolean isPass;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private Boolean ischeck;

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column video.id
     *
     * @return the value of video.id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column video.id
     *
     * @param id the value for video.id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column video.name
     *
     * @return the value of video.name
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column video.name
     *
     * @param name the value for video.name
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column video.user_id
     *
     * @return the value of video.user_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column video.user_id
     *
     * @param user_id the value for video.user_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column video.cover_url
     *
     * @return the value of video.cover_url
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public String getCover_url() {
        return cover_url;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withCover_url(String cover_url) {
        this.setCover_url(cover_url);
        return this;
    }

    /**
     * This method sets the value of the database column video.cover_url
     *
     * @param cover_url the value for video.cover_url
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    /**
     * This method returns the value of the database column video.video_url
     *
     * @return the value of video.video_url
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public String getVideo_url() {
        return video_url;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withVideo_url(String video_url) {
        this.setVideo_url(video_url);
        return this;
    }

    /**
     * This method sets the value of the database column video.video_url
     *
     * @param video_url the value for video.video_url
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    /**
     * This method returns the value of the database column video.release_time
     *
     * @return the value of video.release_time
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Date getRelease_time() {
        return release_time;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withRelease_time(Date release_time) {
        this.setRelease_time(release_time);
        return this;
    }

    /**
     * This method sets the value of the database column video.release_time
     *
     * @param release_time the value for video.release_time
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setRelease_time(Date release_time) {
        this.release_time = release_time;
    }

    /**
     * This method returns the value of the database column video.status
     *
     * @return the value of video.status
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withStatus(Boolean status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column video.status
     *
     * @param status the value for video.status
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column video.like_count
     *
     * @return the value of video.like_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getLike_count() {
        return like_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    /**
     * This method sets the value of the database column video.like_count
     *
     * @param like_count the value for video.like_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    /**
     * This method returns the value of the database column video.favor_count
     *
     * @return the value of video.favor_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getFavor_count() {
        return favor_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withFavor_count(Integer favor_count) {
        this.setFavor_count(favor_count);
        return this;
    }

    /**
     * This method sets the value of the database column video.favor_count
     *
     * @param favor_count the value for video.favor_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setFavor_count(Integer favor_count) {
        this.favor_count = favor_count;
    }

    /**
     * This method returns the value of the database column video.comments_count
     *
     * @return the value of video.comments_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getComments_count() {
        return comments_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withComments_count(Integer comments_count) {
        this.setComments_count(comments_count);
        return this;
    }

    /**
     * This method sets the value of the database column video.comments_count
     *
     * @param comments_count the value for video.comments_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    /**
     * This method returns the value of the database column video.click_count
     *
     * @return the value of video.click_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getClick_count() {
        return click_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withClick_count(Integer click_count) {
        this.setClick_count(click_count);
        return this;
    }

    /**
     * This method sets the value of the database column video.click_count
     *
     * @param click_count the value for video.click_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    /**
     * This method returns the value of the database column video.share_count
     *
     * @return the value of video.share_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getShare_count() {
        return share_count;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withShare_count(Integer share_count) {
        this.setShare_count(share_count);
        return this;
    }

    /**
     * This method sets the value of the database column video.share_count
     *
     * @param share_count the value for video.share_count
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    /**
     * This method returns the value of the database column video.isdelete
     *
     * @return the value of video.isdelete
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    /**
     * This method sets the value of the database column video.isdelete
     *
     * @param isdelete the value for video.isdelete
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method returns the value of the database column video.des
     *
     * @return the value of video.des
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public String getDes() {
        return des;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withDes(String des) {
        this.setDes(des);
        return this;
    }

    /**
     * This method sets the value of the database column video.des
     *
     * @param des the value for video.des
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * This method returns the value of the database column video.type
     *
     * @return the value of video.type
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method sets the value of the database column video.type
     *
     * @param type the value for video.type
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method returns the value of the database column video.type_id
     *
     * @return the value of video.type_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    /**
     * This method sets the value of the database column video.type_id
     *
     * @param type_id the value for video.type_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method returns the value of the database column video.craft_id
     *
     * @return the value of video.craft_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Integer getCraft_id() {
        return craft_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withCraft_id(Integer craft_id) {
        this.setCraft_id(craft_id);
        return this;
    }

    /**
     * This method sets the value of the database column video.craft_id
     *
     * @param craft_id the value for video.craft_id
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setCraft_id(Integer craft_id) {
        this.craft_id = craft_id;
    }

    /**
     * This method returns the value of the database column video.isPass
     *
     * @return the value of video.isPass
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Boolean getIsPass() {
        return isPass;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withIsPass(Boolean isPass) {
        this.setIsPass(isPass);
        return this;
    }

    /**
     * This method sets the value of the database column video.isPass
     *
     * @param isPass the value for video.isPass
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    /**
     * This method returns the value of the database column video.ischeck
     *
     * @return the value of video.ischeck
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Boolean getIscheck() {
        return ischeck;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public Video withIscheck(Boolean ischeck) {
        this.setIscheck(ischeck);
        return this;
    }

    /**
     * This method sets the value of the database column video.ischeck
     *
     * @param ischeck the value for video.ischeck
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
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
        sb.append(", video_url=").append(video_url);
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
        sb.append(", craft_id=").append(craft_id);
        sb.append(", isPass=").append(isPass);
        sb.append(", ischeck=").append(ischeck);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
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
        Video other = (Video) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getCover_url() == null ? other.getCover_url() == null : this.getCover_url().equals(other.getCover_url()))
            && (this.getVideo_url() == null ? other.getVideo_url() == null : this.getVideo_url().equals(other.getVideo_url()))
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
            && (this.getCraft_id() == null ? other.getCraft_id() == null : this.getCraft_id().equals(other.getCraft_id()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getIscheck() == null ? other.getIscheck() == null : this.getIscheck().equals(other.getIscheck()));
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:24:34 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getCover_url() == null) ? 0 : getCover_url().hashCode());
        result = prime * result + ((getVideo_url() == null) ? 0 : getVideo_url().hashCode());
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
        result = prime * result + ((getCraft_id() == null) ? 0 : getCraft_id().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getIscheck() == null) ? 0 : getIscheck().hashCode());
        return result;
    }
}