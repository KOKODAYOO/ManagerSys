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
public class Article implements Serializable {
    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private String title;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private String cover_url;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer type_id;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Boolean status;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Date post_time;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer like_count;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer favor_count;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer comments_count;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer click_count;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer share_count;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Boolean isdelete;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Integer craft_id;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Boolean isPass;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private Boolean ischeck;

    /**
     *
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private String content_url;

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tiangong..article.id
     *
     * @return the value of tiangong..article.id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.id
     *
     * @param id the value for tiangong..article.id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tiangong..article.user_id
     *
     * @return the value of tiangong..article.user_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.user_id
     *
     * @param user_id the value for tiangong..article.user_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column tiangong..article.title
     *
     * @return the value of tiangong..article.title
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.title
     *
     * @param title the value for tiangong..article.title
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column tiangong..article.cover_url
     *
     * @return the value of tiangong..article.cover_url
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public String getCover_url() {
        return cover_url;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withCover_url(String cover_url) {
        this.setCover_url(cover_url);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.cover_url
     *
     * @param cover_url the value for tiangong..article.cover_url
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    /**
     * This method returns the value of the database column tiangong..article.type_id
     *
     * @return the value of tiangong..article.type_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.type_id
     *
     * @param type_id the value for tiangong..article.type_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method returns the value of the database column tiangong..article.status
     *
     * @return the value of tiangong..article.status
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withStatus(Boolean status) {
        this.setStatus(status);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.status
     *
     * @param status the value for tiangong..article.status
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method returns the value of the database column tiangong..article.post_time
     *
     * @return the value of tiangong..article.post_time
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Date getPost_time() {
        return post_time;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withPost_time(Date post_time) {
        this.setPost_time(post_time);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.post_time
     *
     * @param post_time the value for tiangong..article.post_time
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setPost_time(Date post_time) {
        this.post_time = post_time;
    }

    /**
     * This method returns the value of the database column tiangong..article.like_count
     *
     * @return the value of tiangong..article.like_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getLike_count() {
        return like_count;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withLike_count(Integer like_count) {
        this.setLike_count(like_count);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.like_count
     *
     * @param like_count the value for tiangong..article.like_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    /**
     * This method returns the value of the database column tiangong..article.favor_count
     *
     * @return the value of tiangong..article.favor_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getFavor_count() {
        return favor_count;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withFavor_count(Integer favor_count) {
        this.setFavor_count(favor_count);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.favor_count
     *
     * @param favor_count the value for tiangong..article.favor_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setFavor_count(Integer favor_count) {
        this.favor_count = favor_count;
    }

    /**
     * This method returns the value of the database column tiangong..article.comments_count
     *
     * @return the value of tiangong..article.comments_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getComments_count() {
        return comments_count;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withComments_count(Integer comments_count) {
        this.setComments_count(comments_count);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.comments_count
     *
     * @param comments_count the value for tiangong..article.comments_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    /**
     * This method returns the value of the database column tiangong..article.click_count
     *
     * @return the value of tiangong..article.click_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getClick_count() {
        return click_count;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withClick_count(Integer click_count) {
        this.setClick_count(click_count);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.click_count
     *
     * @param click_count the value for tiangong..article.click_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    /**
     * This method returns the value of the database column tiangong..article.share_count
     *
     * @return the value of tiangong..article.share_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getShare_count() {
        return share_count;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withShare_count(Integer share_count) {
        this.setShare_count(share_count);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.share_count
     *
     * @param share_count the value for tiangong..article.share_count
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    /**
     * This method returns the value of the database column tiangong..article.isdelete
     *
     * @return the value of tiangong..article.isdelete
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withIsdelete(Boolean isdelete) {
        this.setIsdelete(isdelete);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.isdelete
     *
     * @param isdelete the value for tiangong..article.isdelete
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * This method returns the value of the database column tiangong..article.craft_id
     *
     * @return the value of tiangong..article.craft_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Integer getCraft_id() {
        return craft_id;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withCraft_id(Integer craft_id) {
        this.setCraft_id(craft_id);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.craft_id
     *
     * @param craft_id the value for tiangong..article.craft_id
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setCraft_id(Integer craft_id) {
        this.craft_id = craft_id;
    }

    /**
     * This method returns the value of the database column tiangong..article.isPass
     *
     * @return the value of tiangong..article.isPass
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Boolean getIsPass() {
        return isPass;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withIsPass(Boolean isPass) {
        this.setIsPass(isPass);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.isPass
     *
     * @param isPass the value for tiangong..article.isPass
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setIsPass(Boolean isPass) {
        this.isPass = isPass;
    }

    /**
     * This method returns the value of the database column tiangong..article.ischeck
     *
     * @return the value of tiangong..article.ischeck
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Boolean getIscheck() {
        return ischeck;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withIscheck(Boolean ischeck) {
        this.setIscheck(ischeck);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.ischeck
     *
     * @param ischeck the value for tiangong..article.ischeck
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }

    /**
     * This method returns the value of the database column tiangong..article.content_url
     *
     * @return the value of tiangong..article.content_url
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public String getContent_url() {
        return content_url;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Article withContent_url(String content_url) {
        this.setContent_url(content_url);
        return this;
    }

    /**
     * This method sets the value of the database column tiangong..article.content_url
     *
     * @param content_url the value for tiangong..article.content_url
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", title=").append(title);
        sb.append(", cover_url=").append(cover_url);
        sb.append(", type_id=").append(type_id);
        sb.append(", status=").append(status);
        sb.append(", post_time=").append(post_time);
        sb.append(", like_count=").append(like_count);
        sb.append(", favor_count=").append(favor_count);
        sb.append(", comments_count=").append(comments_count);
        sb.append(", click_count=").append(click_count);
        sb.append(", share_count=").append(share_count);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", craft_id=").append(craft_id);
        sb.append(", isPass=").append(isPass);
        sb.append(", ischeck=").append(ischeck);
        sb.append(", content_url=").append(content_url);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
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
        Article other = (Article) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCover_url() == null ? other.getCover_url() == null : this.getCover_url().equals(other.getCover_url()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPost_time() == null ? other.getPost_time() == null : this.getPost_time().equals(other.getPost_time()))
            && (this.getLike_count() == null ? other.getLike_count() == null : this.getLike_count().equals(other.getLike_count()))
            && (this.getFavor_count() == null ? other.getFavor_count() == null : this.getFavor_count().equals(other.getFavor_count()))
            && (this.getComments_count() == null ? other.getComments_count() == null : this.getComments_count().equals(other.getComments_count()))
            && (this.getClick_count() == null ? other.getClick_count() == null : this.getClick_count().equals(other.getClick_count()))
            && (this.getShare_count() == null ? other.getShare_count() == null : this.getShare_count().equals(other.getShare_count()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()))
            && (this.getCraft_id() == null ? other.getCraft_id() == null : this.getCraft_id().equals(other.getCraft_id()))
            && (this.getIsPass() == null ? other.getIsPass() == null : this.getIsPass().equals(other.getIsPass()))
            && (this.getIscheck() == null ? other.getIscheck() == null : this.getIscheck().equals(other.getIscheck()))
            && (this.getContent_url() == null ? other.getContent_url() == null : this.getContent_url().equals(other.getContent_url()));
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCover_url() == null) ? 0 : getCover_url().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPost_time() == null) ? 0 : getPost_time().hashCode());
        result = prime * result + ((getLike_count() == null) ? 0 : getLike_count().hashCode());
        result = prime * result + ((getFavor_count() == null) ? 0 : getFavor_count().hashCode());
        result = prime * result + ((getComments_count() == null) ? 0 : getComments_count().hashCode());
        result = prime * result + ((getClick_count() == null) ? 0 : getClick_count().hashCode());
        result = prime * result + ((getShare_count() == null) ? 0 : getShare_count().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        result = prime * result + ((getCraft_id() == null) ? 0 : getCraft_id().hashCode());
        result = prime * result + ((getIsPass() == null) ? 0 : getIsPass().hashCode());
        result = prime * result + ((getIscheck() == null) ? 0 : getIscheck().hashCode());
        result = prime * result + ((getContent_url() == null) ? 0 : getContent_url().hashCode());
        return result;
    }
}