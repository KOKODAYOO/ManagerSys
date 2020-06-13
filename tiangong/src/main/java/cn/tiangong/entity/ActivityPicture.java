package cn.tiangong.entity;

import java.io.Serializable;

public class ActivityPicture implements Serializable {
    private String url;

    private Integer activity_id;

    private static final long serialVersionUID = 1L;

    public String getUrl() {
        return url;
    }

    public ActivityPicture withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getActivity_id() {
        return activity_id;
    }

    public ActivityPicture withActivity_id(Integer activity_id) {
        this.setActivity_id(activity_id);
        return this;
    }

    public void setActivity_id(Integer activity_id) {
        this.activity_id = activity_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", url=").append(url);
        sb.append(", activity_id=").append(activity_id);
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
        ActivityPicture other = (ActivityPicture) that;
        return (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getActivity_id() == null ? other.getActivity_id() == null : this.getActivity_id().equals(other.getActivity_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getActivity_id() == null) ? 0 : getActivity_id().hashCode());
        return result;
    }
}