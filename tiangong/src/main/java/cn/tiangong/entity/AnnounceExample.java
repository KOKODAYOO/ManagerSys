package cn.tiangong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnounceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnounceExample() {
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

        public Criteria andSender_idIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSender_idIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSender_idEqualTo(Integer value) {
            addCriterion("sender_id =", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idNotEqualTo(Integer value) {
            addCriterion("sender_id <>", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idGreaterThan(Integer value) {
            addCriterion("sender_id >", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_id >=", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idLessThan(Integer value) {
            addCriterion("sender_id <", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idLessThanOrEqualTo(Integer value) {
            addCriterion("sender_id <=", value, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idIn(List<Integer> values) {
            addCriterion("sender_id in", values, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idNotIn(List<Integer> values) {
            addCriterion("sender_id not in", values, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idBetween(Integer value1, Integer value2) {
            addCriterion("sender_id between", value1, value2, "sender_id");
            return (Criteria) this;
        }

        public Criteria andSender_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_id not between", value1, value2, "sender_id");
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

        public Criteria andContentLikeInsensitive(String value) {
            addCriterion("upper(content) like", value.toUpperCase(), "content");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(title) like", value.toUpperCase(), "title");
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