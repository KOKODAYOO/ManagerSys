package cn.tiangong.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TypeDatasExample {
    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public TypeDatasExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
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
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andVideo_flowIsNull() {
            addCriterion("video_flow is null");
            return (Criteria) this;
        }

        public Criteria andVideo_flowIsNotNull() {
            addCriterion("video_flow is not null");
            return (Criteria) this;
        }

        public Criteria andVideo_flowEqualTo(Long value) {
            addCriterion("video_flow =", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowNotEqualTo(Long value) {
            addCriterion("video_flow <>", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowGreaterThan(Long value) {
            addCriterion("video_flow >", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowGreaterThanOrEqualTo(Long value) {
            addCriterion("video_flow >=", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowLessThan(Long value) {
            addCriterion("video_flow <", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowLessThanOrEqualTo(Long value) {
            addCriterion("video_flow <=", value, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowIn(List<Long> values) {
            addCriterion("video_flow in", values, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowNotIn(List<Long> values) {
            addCriterion("video_flow not in", values, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowBetween(Long value1, Long value2) {
            addCriterion("video_flow between", value1, value2, "video_flow");
            return (Criteria) this;
        }

        public Criteria andVideo_flowNotBetween(Long value1, Long value2) {
            addCriterion("video_flow not between", value1, value2, "video_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowIsNull() {
            addCriterion("course_flow is null");
            return (Criteria) this;
        }

        public Criteria andCourse_flowIsNotNull() {
            addCriterion("course_flow is not null");
            return (Criteria) this;
        }

        public Criteria andCourse_flowEqualTo(Long value) {
            addCriterion("course_flow =", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowNotEqualTo(Long value) {
            addCriterion("course_flow <>", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowGreaterThan(Long value) {
            addCriterion("course_flow >", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowGreaterThanOrEqualTo(Long value) {
            addCriterion("course_flow >=", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowLessThan(Long value) {
            addCriterion("course_flow <", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowLessThanOrEqualTo(Long value) {
            addCriterion("course_flow <=", value, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowIn(List<Long> values) {
            addCriterion("course_flow in", values, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowNotIn(List<Long> values) {
            addCriterion("course_flow not in", values, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowBetween(Long value1, Long value2) {
            addCriterion("course_flow between", value1, value2, "course_flow");
            return (Criteria) this;
        }

        public Criteria andCourse_flowNotBetween(Long value1, Long value2) {
            addCriterion("course_flow not between", value1, value2, "course_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowIsNull() {
            addCriterion("article_flow is null");
            return (Criteria) this;
        }

        public Criteria andArticle_flowIsNotNull() {
            addCriterion("article_flow is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_flowEqualTo(Long value) {
            addCriterion("article_flow =", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowNotEqualTo(Long value) {
            addCriterion("article_flow <>", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowGreaterThan(Long value) {
            addCriterion("article_flow >", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowGreaterThanOrEqualTo(Long value) {
            addCriterion("article_flow >=", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowLessThan(Long value) {
            addCriterion("article_flow <", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowLessThanOrEqualTo(Long value) {
            addCriterion("article_flow <=", value, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowIn(List<Long> values) {
            addCriterion("article_flow in", values, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowNotIn(List<Long> values) {
            addCriterion("article_flow not in", values, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowBetween(Long value1, Long value2) {
            addCriterion("article_flow between", value1, value2, "article_flow");
            return (Criteria) this;
        }

        public Criteria andArticle_flowNotBetween(Long value1, Long value2) {
            addCriterion("article_flow not between", value1, value2, "article_flow");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 21 16:07:58 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Wed Aug 21 16:07:58 CST 2019
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