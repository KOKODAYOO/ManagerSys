package cn.tiangong.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andReg_timeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andReg_timeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andReg_timeEqualTo(Date value) {
            addCriterion("reg_time =", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeLessThan(Date value) {
            addCriterion("reg_time <", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeIn(List<Date> values) {
            addCriterion("reg_time in", values, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "reg_time");
            return (Criteria) this;
        }

        public Criteria andLast_loginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLast_loginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLast_loginEqualTo(Date value) {
            addCriterion("last_login =", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginNotEqualTo(Date value) {
            addCriterion("last_login <>", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginGreaterThan(Date value) {
            addCriterion("last_login >", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login >=", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginLessThan(Date value) {
            addCriterion("last_login <", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginLessThanOrEqualTo(Date value) {
            addCriterion("last_login <=", value, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginIn(List<Date> values) {
            addCriterion("last_login in", values, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginNotIn(List<Date> values) {
            addCriterion("last_login not in", values, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginBetween(Date value1, Date value2) {
            addCriterion("last_login between", value1, value2, "last_login");
            return (Criteria) this;
        }

        public Criteria andLast_loginNotBetween(Date value1, Date value2) {
            addCriterion("last_login not between", value1, value2, "last_login");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlLike(String value) {
            addCriterion("avatar_url like", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatar_url");
            return (Criteria) this;
        }

        public Criteria andE_mailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andE_mailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andE_mailEqualTo(String value) {
            addCriterion("e_mail =", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailGreaterThan(String value) {
            addCriterion("e_mail >", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailLessThan(String value) {
            addCriterion("e_mail <", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailLike(String value) {
            addCriterion("e_mail like", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailNotLike(String value) {
            addCriterion("e_mail not like", value, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailIn(List<String> values) {
            addCriterion("e_mail in", values, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "e_mail");
            return (Criteria) this;
        }

        public Criteria andE_mailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "e_mail");
            return (Criteria) this;
        }

        public Criteria andFocus_countIsNull() {
            addCriterion("focus_count is null");
            return (Criteria) this;
        }

        public Criteria andFocus_countIsNotNull() {
            addCriterion("focus_count is not null");
            return (Criteria) this;
        }

        public Criteria andFocus_countEqualTo(Integer value) {
            addCriterion("focus_count =", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countNotEqualTo(Integer value) {
            addCriterion("focus_count <>", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countGreaterThan(Integer value) {
            addCriterion("focus_count >", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("focus_count >=", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countLessThan(Integer value) {
            addCriterion("focus_count <", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countLessThanOrEqualTo(Integer value) {
            addCriterion("focus_count <=", value, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countIn(List<Integer> values) {
            addCriterion("focus_count in", values, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countNotIn(List<Integer> values) {
            addCriterion("focus_count not in", values, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countBetween(Integer value1, Integer value2) {
            addCriterion("focus_count between", value1, value2, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocus_countNotBetween(Integer value1, Integer value2) {
            addCriterion("focus_count not between", value1, value2, "focus_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countIsNull() {
            addCriterion("focused_count is null");
            return (Criteria) this;
        }

        public Criteria andFocused_countIsNotNull() {
            addCriterion("focused_count is not null");
            return (Criteria) this;
        }

        public Criteria andFocused_countEqualTo(Integer value) {
            addCriterion("focused_count =", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countNotEqualTo(Integer value) {
            addCriterion("focused_count <>", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countGreaterThan(Integer value) {
            addCriterion("focused_count >", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("focused_count >=", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countLessThan(Integer value) {
            addCriterion("focused_count <", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countLessThanOrEqualTo(Integer value) {
            addCriterion("focused_count <=", value, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countIn(List<Integer> values) {
            addCriterion("focused_count in", values, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countNotIn(List<Integer> values) {
            addCriterion("focused_count not in", values, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countBetween(Integer value1, Integer value2) {
            addCriterion("focused_count between", value1, value2, "focused_count");
            return (Criteria) this;
        }

        public Criteria andFocused_countNotBetween(Integer value1, Integer value2) {
            addCriterion("focused_count not between", value1, value2, "focused_count");
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

        public Criteria andMsg_count_not_readIsNull() {
            addCriterion("msg_count_not_read is null");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readIsNotNull() {
            addCriterion("msg_count_not_read is not null");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readEqualTo(Integer value) {
            addCriterion("msg_count_not_read =", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readNotEqualTo(Integer value) {
            addCriterion("msg_count_not_read <>", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readGreaterThan(Integer value) {
            addCriterion("msg_count_not_read >", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readGreaterThanOrEqualTo(Integer value) {
            addCriterion("msg_count_not_read >=", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readLessThan(Integer value) {
            addCriterion("msg_count_not_read <", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readLessThanOrEqualTo(Integer value) {
            addCriterion("msg_count_not_read <=", value, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readIn(List<Integer> values) {
            addCriterion("msg_count_not_read in", values, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readNotIn(List<Integer> values) {
            addCriterion("msg_count_not_read not in", values, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readBetween(Integer value1, Integer value2) {
            addCriterion("msg_count_not_read between", value1, value2, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andMsg_count_not_readNotBetween(Integer value1, Integer value2) {
            addCriterion("msg_count_not_read not between", value1, value2, "msg_count_not_read");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeIsNull() {
            addCriterion("noAdv_time is null");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeIsNotNull() {
            addCriterion("noAdv_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeEqualTo(Date value) {
            addCriterion("noAdv_time =", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeNotEqualTo(Date value) {
            addCriterion("noAdv_time <>", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeGreaterThan(Date value) {
            addCriterion("noAdv_time >", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("noAdv_time >=", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeLessThan(Date value) {
            addCriterion("noAdv_time <", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeLessThanOrEqualTo(Date value) {
            addCriterion("noAdv_time <=", value, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeIn(List<Date> values) {
            addCriterion("noAdv_time in", values, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeNotIn(List<Date> values) {
            addCriterion("noAdv_time not in", values, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeBetween(Date value1, Date value2) {
            addCriterion("noAdv_time between", value1, value2, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andNoAdv_timeNotBetween(Date value1, Date value2) {
            addCriterion("noAdv_time not between", value1, value2, "noAdv_time");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMttoIsNull() {
            addCriterion("mtto is null");
            return (Criteria) this;
        }

        public Criteria andMttoIsNotNull() {
            addCriterion("mtto is not null");
            return (Criteria) this;
        }

        public Criteria andMttoEqualTo(String value) {
            addCriterion("mtto =", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoNotEqualTo(String value) {
            addCriterion("mtto <>", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoGreaterThan(String value) {
            addCriterion("mtto >", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoGreaterThanOrEqualTo(String value) {
            addCriterion("mtto >=", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoLessThan(String value) {
            addCriterion("mtto <", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoLessThanOrEqualTo(String value) {
            addCriterion("mtto <=", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoLike(String value) {
            addCriterion("mtto like", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoNotLike(String value) {
            addCriterion("mtto not like", value, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoIn(List<String> values) {
            addCriterion("mtto in", values, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoNotIn(List<String> values) {
            addCriterion("mtto not in", values, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoBetween(String value1, String value2) {
            addCriterion("mtto between", value1, value2, "mtto");
            return (Criteria) this;
        }

        public Criteria andMttoNotBetween(String value1, String value2) {
            addCriterion("mtto not between", value1, value2, "mtto");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(password) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(username) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andProvinceLikeInsensitive(String value) {
            addCriterion("upper(province) like", value.toUpperCase(), "province");
            return (Criteria) this;
        }

        public Criteria andCityLikeInsensitive(String value) {
            addCriterion("upper(city) like", value.toUpperCase(), "city");
            return (Criteria) this;
        }

        public Criteria andAvatar_urlLikeInsensitive(String value) {
            addCriterion("upper(avatar_url) like", value.toUpperCase(), "avatar_url");
            return (Criteria) this;
        }

        public Criteria andE_mailLikeInsensitive(String value) {
            addCriterion("upper(e_mail) like", value.toUpperCase(), "e_mail");
            return (Criteria) this;
        }

        public Criteria andMttoLikeInsensitive(String value) {
            addCriterion("upper(mtto) like", value.toUpperCase(), "mtto");
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