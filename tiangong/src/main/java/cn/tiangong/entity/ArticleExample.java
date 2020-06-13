package cn.tiangong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCover_urlIsNull() {
            addCriterion("cover_url is null");
            return (Criteria) this;
        }

        public Criteria andCover_urlIsNotNull() {
            addCriterion("cover_url is not null");
            return (Criteria) this;
        }

        public Criteria andCover_urlEqualTo(String value) {
            addCriterion("cover_url =", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlNotEqualTo(String value) {
            addCriterion("cover_url <>", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlGreaterThan(String value) {
            addCriterion("cover_url >", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_url >=", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlLessThan(String value) {
            addCriterion("cover_url <", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlLessThanOrEqualTo(String value) {
            addCriterion("cover_url <=", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlLike(String value) {
            addCriterion("cover_url like", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlNotLike(String value) {
            addCriterion("cover_url not like", value, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlIn(List<String> values) {
            addCriterion("cover_url in", values, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlNotIn(List<String> values) {
            addCriterion("cover_url not in", values, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlBetween(String value1, String value2) {
            addCriterion("cover_url between", value1, value2, "cover_url");
            return (Criteria) this;
        }

        public Criteria andCover_urlNotBetween(String value1, String value2) {
            addCriterion("cover_url not between", value1, value2, "cover_url");
            return (Criteria) this;
        }

        public Criteria andType_idIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andType_idIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andType_idEqualTo(Integer value) {
            addCriterion("type_id =", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThan(Integer value) {
            addCriterion("type_id >", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThan(Integer value) {
            addCriterion("type_id <", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idIn(List<Integer> values) {
            addCriterion("type_id in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andType_idNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "type_id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPost_timeIsNull() {
            addCriterion("post_time is null");
            return (Criteria) this;
        }

        public Criteria andPost_timeIsNotNull() {
            addCriterion("post_time is not null");
            return (Criteria) this;
        }

        public Criteria andPost_timeEqualTo(Date value) {
            addCriterion("post_time =", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeNotEqualTo(Date value) {
            addCriterion("post_time <>", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeGreaterThan(Date value) {
            addCriterion("post_time >", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("post_time >=", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeLessThan(Date value) {
            addCriterion("post_time <", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeLessThanOrEqualTo(Date value) {
            addCriterion("post_time <=", value, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeIn(List<Date> values) {
            addCriterion("post_time in", values, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeNotIn(List<Date> values) {
            addCriterion("post_time not in", values, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeBetween(Date value1, Date value2) {
            addCriterion("post_time between", value1, value2, "post_time");
            return (Criteria) this;
        }

        public Criteria andPost_timeNotBetween(Date value1, Date value2) {
            addCriterion("post_time not between", value1, value2, "post_time");
            return (Criteria) this;
        }

        public Criteria andLike_countIsNull() {
            addCriterion("like_count is null");
            return (Criteria) this;
        }

        public Criteria andLike_countIsNotNull() {
            addCriterion("like_count is not null");
            return (Criteria) this;
        }

        public Criteria andLike_countEqualTo(Integer value) {
            addCriterion("like_count =", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countNotEqualTo(Integer value) {
            addCriterion("like_count <>", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countGreaterThan(Integer value) {
            addCriterion("like_count >", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_count >=", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countLessThan(Integer value) {
            addCriterion("like_count <", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countLessThanOrEqualTo(Integer value) {
            addCriterion("like_count <=", value, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countIn(List<Integer> values) {
            addCriterion("like_count in", values, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countNotIn(List<Integer> values) {
            addCriterion("like_count not in", values, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countBetween(Integer value1, Integer value2) {
            addCriterion("like_count between", value1, value2, "like_count");
            return (Criteria) this;
        }

        public Criteria andLike_countNotBetween(Integer value1, Integer value2) {
            addCriterion("like_count not between", value1, value2, "like_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countIsNull() {
            addCriterion("favor_count is null");
            return (Criteria) this;
        }

        public Criteria andFavor_countIsNotNull() {
            addCriterion("favor_count is not null");
            return (Criteria) this;
        }

        public Criteria andFavor_countEqualTo(Integer value) {
            addCriterion("favor_count =", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countNotEqualTo(Integer value) {
            addCriterion("favor_count <>", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countGreaterThan(Integer value) {
            addCriterion("favor_count >", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("favor_count >=", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countLessThan(Integer value) {
            addCriterion("favor_count <", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countLessThanOrEqualTo(Integer value) {
            addCriterion("favor_count <=", value, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countIn(List<Integer> values) {
            addCriterion("favor_count in", values, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countNotIn(List<Integer> values) {
            addCriterion("favor_count not in", values, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countBetween(Integer value1, Integer value2) {
            addCriterion("favor_count between", value1, value2, "favor_count");
            return (Criteria) this;
        }

        public Criteria andFavor_countNotBetween(Integer value1, Integer value2) {
            addCriterion("favor_count not between", value1, value2, "favor_count");
            return (Criteria) this;
        }

        public Criteria andComments_countIsNull() {
            addCriterion("comments_count is null");
            return (Criteria) this;
        }

        public Criteria andComments_countIsNotNull() {
            addCriterion("comments_count is not null");
            return (Criteria) this;
        }

        public Criteria andComments_countEqualTo(Integer value) {
            addCriterion("comments_count =", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countNotEqualTo(Integer value) {
            addCriterion("comments_count <>", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countGreaterThan(Integer value) {
            addCriterion("comments_count >", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_count >=", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countLessThan(Integer value) {
            addCriterion("comments_count <", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countLessThanOrEqualTo(Integer value) {
            addCriterion("comments_count <=", value, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countIn(List<Integer> values) {
            addCriterion("comments_count in", values, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countNotIn(List<Integer> values) {
            addCriterion("comments_count not in", values, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countBetween(Integer value1, Integer value2) {
            addCriterion("comments_count between", value1, value2, "comments_count");
            return (Criteria) this;
        }

        public Criteria andComments_countNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_count not between", value1, value2, "comments_count");
            return (Criteria) this;
        }

        public Criteria andClick_countIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClick_countIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClick_countEqualTo(Integer value) {
            addCriterion("click_count =", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countGreaterThan(Integer value) {
            addCriterion("click_count >", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countLessThan(Integer value) {
            addCriterion("click_count <", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countIn(List<Integer> values) {
            addCriterion("click_count in", values, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "click_count");
            return (Criteria) this;
        }

        public Criteria andShare_countIsNull() {
            addCriterion("share_count is null");
            return (Criteria) this;
        }

        public Criteria andShare_countIsNotNull() {
            addCriterion("share_count is not null");
            return (Criteria) this;
        }

        public Criteria andShare_countEqualTo(Integer value) {
            addCriterion("share_count =", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countNotEqualTo(Integer value) {
            addCriterion("share_count <>", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countGreaterThan(Integer value) {
            addCriterion("share_count >", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_count >=", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countLessThan(Integer value) {
            addCriterion("share_count <", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countLessThanOrEqualTo(Integer value) {
            addCriterion("share_count <=", value, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countIn(List<Integer> values) {
            addCriterion("share_count in", values, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countNotIn(List<Integer> values) {
            addCriterion("share_count not in", values, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countBetween(Integer value1, Integer value2) {
            addCriterion("share_count between", value1, value2, "share_count");
            return (Criteria) this;
        }

        public Criteria andShare_countNotBetween(Integer value1, Integer value2) {
            addCriterion("share_count not between", value1, value2, "share_count");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andCraft_idIsNull() {
            addCriterion("craft_id is null");
            return (Criteria) this;
        }

        public Criteria andCraft_idIsNotNull() {
            addCriterion("craft_id is not null");
            return (Criteria) this;
        }

        public Criteria andCraft_idEqualTo(Integer value) {
            addCriterion("craft_id =", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idNotEqualTo(Integer value) {
            addCriterion("craft_id <>", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idGreaterThan(Integer value) {
            addCriterion("craft_id >", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("craft_id >=", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idLessThan(Integer value) {
            addCriterion("craft_id <", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idLessThanOrEqualTo(Integer value) {
            addCriterion("craft_id <=", value, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idIn(List<Integer> values) {
            addCriterion("craft_id in", values, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idNotIn(List<Integer> values) {
            addCriterion("craft_id not in", values, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idBetween(Integer value1, Integer value2) {
            addCriterion("craft_id between", value1, value2, "craft_id");
            return (Criteria) this;
        }

        public Criteria andCraft_idNotBetween(Integer value1, Integer value2) {
            addCriterion("craft_id not between", value1, value2, "craft_id");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNull() {
            addCriterion("isPass is null");
            return (Criteria) this;
        }

        public Criteria andIsPassIsNotNull() {
            addCriterion("isPass is not null");
            return (Criteria) this;
        }

        public Criteria andIsPassEqualTo(Boolean value) {
            addCriterion("isPass =", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotEqualTo(Boolean value) {
            addCriterion("isPass <>", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThan(Boolean value) {
            addCriterion("isPass >", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isPass >=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThan(Boolean value) {
            addCriterion("isPass <", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassLessThanOrEqualTo(Boolean value) {
            addCriterion("isPass <=", value, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassIn(List<Boolean> values) {
            addCriterion("isPass in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotIn(List<Boolean> values) {
            addCriterion("isPass not in", values, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassBetween(Boolean value1, Boolean value2) {
            addCriterion("isPass between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIsPassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isPass not between", value1, value2, "isPass");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("ischeck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("ischeck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Boolean value) {
            addCriterion("ischeck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Boolean value) {
            addCriterion("ischeck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Boolean value) {
            addCriterion("ischeck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ischeck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Boolean value) {
            addCriterion("ischeck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Boolean value) {
            addCriterion("ischeck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Boolean> values) {
            addCriterion("ischeck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Boolean> values) {
            addCriterion("ischeck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Boolean value1, Boolean value2) {
            addCriterion("ischeck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ischeck not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andCover_urlLikeInsensitive(String value) {
            addCriterion("upper(cover_url) like", value.toUpperCase(), "cover_url");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Sat Aug 24 16:41:48 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Sat Aug 24 16:41:48 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}