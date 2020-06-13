package cn.tiangong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CraftExample {
    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public CraftExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
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
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andPicture_urlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPicture_urlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicture_urlEqualTo(String value) {
            addCriterion("picture_url =", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlGreaterThan(String value) {
            addCriterion("picture_url >", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLessThan(String value) {
            addCriterion("picture_url <", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLike(String value) {
            addCriterion("picture_url like", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotLike(String value) {
            addCriterion("picture_url not like", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlIn(List<String> values) {
            addCriterion("picture_url in", values, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "picture_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlIsNull() {
            addCriterion("3d_url is null");
            return (Criteria) this;
        }

        public Criteria and3d_urlIsNotNull() {
            addCriterion("3d_url is not null");
            return (Criteria) this;
        }

        public Criteria and3d_urlEqualTo(String value) {
            addCriterion("3d_url =", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlNotEqualTo(String value) {
            addCriterion("3d_url <>", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlGreaterThan(String value) {
            addCriterion("3d_url >", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlGreaterThanOrEqualTo(String value) {
            addCriterion("3d_url >=", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlLessThan(String value) {
            addCriterion("3d_url <", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlLessThanOrEqualTo(String value) {
            addCriterion("3d_url <=", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlLike(String value) {
            addCriterion("3d_url like", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlNotLike(String value) {
            addCriterion("3d_url not like", value, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlIn(List<String> values) {
            addCriterion("3d_url in", values, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlNotIn(List<String> values) {
            addCriterion("3d_url not in", values, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlBetween(String value1, String value2) {
            addCriterion("3d_url between", value1, value2, "3d_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlNotBetween(String value1, String value2) {
            addCriterion("3d_url not between", value1, value2, "3d_url");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andRelease_timeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andRelease_timeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andRelease_timeEqualTo(Date value) {
            addCriterion("release_time =", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeGreaterThan(Date value) {
            addCriterion("release_time >", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeLessThan(Date value) {
            addCriterion("release_time <", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeIn(List<Date> values) {
            addCriterion("release_time in", values, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "release_time");
            return (Criteria) this;
        }

        public Criteria andRelease_timeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "release_time");
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

        public Criteria andEntries_idIsNull() {
            addCriterion("entries_id is null");
            return (Criteria) this;
        }

        public Criteria andEntries_idIsNotNull() {
            addCriterion("entries_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntries_idEqualTo(Integer value) {
            addCriterion("entries_id =", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idNotEqualTo(Integer value) {
            addCriterion("entries_id <>", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idGreaterThan(Integer value) {
            addCriterion("entries_id >", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("entries_id >=", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idLessThan(Integer value) {
            addCriterion("entries_id <", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idLessThanOrEqualTo(Integer value) {
            addCriterion("entries_id <=", value, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idIn(List<Integer> values) {
            addCriterion("entries_id in", values, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idNotIn(List<Integer> values) {
            addCriterion("entries_id not in", values, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idBetween(Integer value1, Integer value2) {
            addCriterion("entries_id between", value1, value2, "entries_id");
            return (Criteria) this;
        }

        public Criteria andEntries_idNotBetween(Integer value1, Integer value2) {
            addCriterion("entries_id not between", value1, value2, "entries_id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLikeInsensitive(String value) {
            addCriterion("upper(picture_url) like", value.toUpperCase(), "picture_url");
            return (Criteria) this;
        }

        public Criteria and3d_urlLikeInsensitive(String value) {
            addCriterion("upper(3d_url) like", value.toUpperCase(), "3d_url");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 21 16:25:17 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:25:17 CST 2019
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