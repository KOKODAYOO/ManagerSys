package cn.tiangong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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