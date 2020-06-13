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
public class TypeDatas implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Integer type_id;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Date time;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Long video_flow;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Long course_flow;

    /**
     *
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private Long article_flow;

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column type_datas.id
     *
     * @return the value of type_datas.id
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.id
     *
     * @param id the value for type_datas.id
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column type_datas.type_id
     *
     * @return the value of type_datas.type_id
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Integer getType_id() {
        return type_id;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.type_id
     *
     * @param type_id the value for type_datas.type_id
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    /**
     * This method returns the value of the database column type_datas.time
     *
     * @return the value of type_datas.time
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withTime(Date time) {
        this.setTime(time);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.time
     *
     * @param time the value for type_datas.time
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method returns the value of the database column type_datas.video_flow
     *
     * @return the value of type_datas.video_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Long getVideo_flow() {
        return video_flow;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withVideo_flow(Long video_flow) {
        this.setVideo_flow(video_flow);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.video_flow
     *
     * @param video_flow the value for type_datas.video_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setVideo_flow(Long video_flow) {
        this.video_flow = video_flow;
    }

    /**
     * This method returns the value of the database column type_datas.course_flow
     *
     * @return the value of type_datas.course_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Long getCourse_flow() {
        return course_flow;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withCourse_flow(Long course_flow) {
        this.setCourse_flow(course_flow);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.course_flow
     *
     * @param course_flow the value for type_datas.course_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setCourse_flow(Long course_flow) {
        this.course_flow = course_flow;
    }

    /**
     * This method returns the value of the database column type_datas.article_flow
     *
     * @return the value of type_datas.article_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Long getArticle_flow() {
        return article_flow;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatas withArticle_flow(Long article_flow) {
        this.setArticle_flow(article_flow);
        return this;
    }

    /**
     * This method sets the value of the database column type_datas.article_flow
     *
     * @param article_flow the value for type_datas.article_flow
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setArticle_flow(Long article_flow) {
        this.article_flow = article_flow;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type_id=").append(type_id);
        sb.append(", time=").append(time);
        sb.append(", video_flow=").append(video_flow);
        sb.append(", course_flow=").append(course_flow);
        sb.append(", article_flow=").append(article_flow);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
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
        TypeDatas other = (TypeDatas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getVideo_flow() == null ? other.getVideo_flow() == null : this.getVideo_flow().equals(other.getVideo_flow()))
            && (this.getCourse_flow() == null ? other.getCourse_flow() == null : this.getCourse_flow().equals(other.getCourse_flow()))
            && (this.getArticle_flow() == null ? other.getArticle_flow() == null : this.getArticle_flow().equals(other.getArticle_flow()));
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getVideo_flow() == null) ? 0 : getVideo_flow().hashCode());
        result = prime * result + ((getCourse_flow() == null) ? 0 : getCourse_flow().hashCode());
        result = prime * result + ((getArticle_flow() == null) ? 0 : getArticle_flow().hashCode());
        return result;
    }
}