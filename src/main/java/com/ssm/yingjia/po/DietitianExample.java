package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DietitianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DietitianExample() {
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

        public Criteria andDietitianIdIsNull() {
            addCriterion("dietitian_id is null");
            return (Criteria) this;
        }

        public Criteria andDietitianIdIsNotNull() {
            addCriterion("dietitian_id is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianIdEqualTo(Integer value) {
            addCriterion("dietitian_id =", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdNotEqualTo(Integer value) {
            addCriterion("dietitian_id <>", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdGreaterThan(Integer value) {
            addCriterion("dietitian_id >", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dietitian_id >=", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdLessThan(Integer value) {
            addCriterion("dietitian_id <", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdLessThanOrEqualTo(Integer value) {
            addCriterion("dietitian_id <=", value, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdIn(List<Integer> values) {
            addCriterion("dietitian_id in", values, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdNotIn(List<Integer> values) {
            addCriterion("dietitian_id not in", values, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_id between", value1, value2, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_id not between", value1, value2, "dietitianId");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameIsNull() {
            addCriterion("dietitian_nickname is null");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameIsNotNull() {
            addCriterion("dietitian_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameEqualTo(String value) {
            addCriterion("dietitian_nickname =", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameNotEqualTo(String value) {
            addCriterion("dietitian_nickname <>", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameGreaterThan(String value) {
            addCriterion("dietitian_nickname >", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("dietitian_nickname >=", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameLessThan(String value) {
            addCriterion("dietitian_nickname <", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameLessThanOrEqualTo(String value) {
            addCriterion("dietitian_nickname <=", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameLike(String value) {
            addCriterion("dietitian_nickname like", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameNotLike(String value) {
            addCriterion("dietitian_nickname not like", value, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameIn(List<String> values) {
            addCriterion("dietitian_nickname in", values, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameNotIn(List<String> values) {
            addCriterion("dietitian_nickname not in", values, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameBetween(String value1, String value2) {
            addCriterion("dietitian_nickname between", value1, value2, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianNicknameNotBetween(String value1, String value2) {
            addCriterion("dietitian_nickname not between", value1, value2, "dietitianNickname");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneIsNull() {
            addCriterion("dietitian_phone is null");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneIsNotNull() {
            addCriterion("dietitian_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneEqualTo(String value) {
            addCriterion("dietitian_phone =", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneNotEqualTo(String value) {
            addCriterion("dietitian_phone <>", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneGreaterThan(String value) {
            addCriterion("dietitian_phone >", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dietitian_phone >=", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneLessThan(String value) {
            addCriterion("dietitian_phone <", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneLessThanOrEqualTo(String value) {
            addCriterion("dietitian_phone <=", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneLike(String value) {
            addCriterion("dietitian_phone like", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneNotLike(String value) {
            addCriterion("dietitian_phone not like", value, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneIn(List<String> values) {
            addCriterion("dietitian_phone in", values, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneNotIn(List<String> values) {
            addCriterion("dietitian_phone not in", values, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneBetween(String value1, String value2) {
            addCriterion("dietitian_phone between", value1, value2, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPhoneNotBetween(String value1, String value2) {
            addCriterion("dietitian_phone not between", value1, value2, "dietitianPhone");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordIsNull() {
            addCriterion("dietitian_password is null");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordIsNotNull() {
            addCriterion("dietitian_password is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordEqualTo(String value) {
            addCriterion("dietitian_password =", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordNotEqualTo(String value) {
            addCriterion("dietitian_password <>", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordGreaterThan(String value) {
            addCriterion("dietitian_password >", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("dietitian_password >=", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordLessThan(String value) {
            addCriterion("dietitian_password <", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordLessThanOrEqualTo(String value) {
            addCriterion("dietitian_password <=", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordLike(String value) {
            addCriterion("dietitian_password like", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordNotLike(String value) {
            addCriterion("dietitian_password not like", value, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordIn(List<String> values) {
            addCriterion("dietitian_password in", values, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordNotIn(List<String> values) {
            addCriterion("dietitian_password not in", values, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordBetween(String value1, String value2) {
            addCriterion("dietitian_password between", value1, value2, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianPasswordNotBetween(String value1, String value2) {
            addCriterion("dietitian_password not between", value1, value2, "dietitianPassword");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberIsNull() {
            addCriterion("dietitian_number is null");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberIsNotNull() {
            addCriterion("dietitian_number is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberEqualTo(Integer value) {
            addCriterion("dietitian_number =", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberNotEqualTo(Integer value) {
            addCriterion("dietitian_number <>", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberGreaterThan(Integer value) {
            addCriterion("dietitian_number >", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("dietitian_number >=", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberLessThan(Integer value) {
            addCriterion("dietitian_number <", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberLessThanOrEqualTo(Integer value) {
            addCriterion("dietitian_number <=", value, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberIn(List<Integer> values) {
            addCriterion("dietitian_number in", values, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberNotIn(List<Integer> values) {
            addCriterion("dietitian_number not in", values, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_number between", value1, value2, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_number not between", value1, value2, "dietitianNumber");
            return (Criteria) this;
        }

        public Criteria andDietitianNameIsNull() {
            addCriterion("dietitian_name is null");
            return (Criteria) this;
        }

        public Criteria andDietitianNameIsNotNull() {
            addCriterion("dietitian_name is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianNameEqualTo(String value) {
            addCriterion("dietitian_name =", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameNotEqualTo(String value) {
            addCriterion("dietitian_name <>", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameGreaterThan(String value) {
            addCriterion("dietitian_name >", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameGreaterThanOrEqualTo(String value) {
            addCriterion("dietitian_name >=", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameLessThan(String value) {
            addCriterion("dietitian_name <", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameLessThanOrEqualTo(String value) {
            addCriterion("dietitian_name <=", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameLike(String value) {
            addCriterion("dietitian_name like", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameNotLike(String value) {
            addCriterion("dietitian_name not like", value, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameIn(List<String> values) {
            addCriterion("dietitian_name in", values, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameNotIn(List<String> values) {
            addCriterion("dietitian_name not in", values, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameBetween(String value1, String value2) {
            addCriterion("dietitian_name between", value1, value2, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianNameNotBetween(String value1, String value2) {
            addCriterion("dietitian_name not between", value1, value2, "dietitianName");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelIsNull() {
            addCriterion("dietitian_level is null");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelIsNotNull() {
            addCriterion("dietitian_level is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelEqualTo(Integer value) {
            addCriterion("dietitian_level =", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelNotEqualTo(Integer value) {
            addCriterion("dietitian_level <>", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelGreaterThan(Integer value) {
            addCriterion("dietitian_level >", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dietitian_level >=", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelLessThan(Integer value) {
            addCriterion("dietitian_level <", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelLessThanOrEqualTo(Integer value) {
            addCriterion("dietitian_level <=", value, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelIn(List<Integer> values) {
            addCriterion("dietitian_level in", values, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelNotIn(List<Integer> values) {
            addCriterion("dietitian_level not in", values, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_level between", value1, value2, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andDietitianLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("dietitian_level not between", value1, value2, "dietitianLevel");
            return (Criteria) this;
        }

        public Criteria andWalletIsNull() {
            addCriterion("wallet is null");
            return (Criteria) this;
        }

        public Criteria andWalletIsNotNull() {
            addCriterion("wallet is not null");
            return (Criteria) this;
        }

        public Criteria andWalletEqualTo(Integer value) {
            addCriterion("wallet =", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotEqualTo(Integer value) {
            addCriterion("wallet <>", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThan(Integer value) {
            addCriterion("wallet >", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletGreaterThanOrEqualTo(Integer value) {
            addCriterion("wallet >=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThan(Integer value) {
            addCriterion("wallet <", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletLessThanOrEqualTo(Integer value) {
            addCriterion("wallet <=", value, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletIn(List<Integer> values) {
            addCriterion("wallet in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotIn(List<Integer> values) {
            addCriterion("wallet not in", values, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletBetween(Integer value1, Integer value2) {
            addCriterion("wallet between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andWalletNotBetween(Integer value1, Integer value2) {
            addCriterion("wallet not between", value1, value2, "wallet");
            return (Criteria) this;
        }

        public Criteria andDietitianPicIsNull() {
            addCriterion("dietitian_pic is null");
            return (Criteria) this;
        }

        public Criteria andDietitianPicIsNotNull() {
            addCriterion("dietitian_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianPicEqualTo(String value) {
            addCriterion("dietitian_pic =", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicNotEqualTo(String value) {
            addCriterion("dietitian_pic <>", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicGreaterThan(String value) {
            addCriterion("dietitian_pic >", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicGreaterThanOrEqualTo(String value) {
            addCriterion("dietitian_pic >=", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicLessThan(String value) {
            addCriterion("dietitian_pic <", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicLessThanOrEqualTo(String value) {
            addCriterion("dietitian_pic <=", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicLike(String value) {
            addCriterion("dietitian_pic like", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicNotLike(String value) {
            addCriterion("dietitian_pic not like", value, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicIn(List<String> values) {
            addCriterion("dietitian_pic in", values, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicNotIn(List<String> values) {
            addCriterion("dietitian_pic not in", values, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicBetween(String value1, String value2) {
            addCriterion("dietitian_pic between", value1, value2, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianPicNotBetween(String value1, String value2) {
            addCriterion("dietitian_pic not between", value1, value2, "dietitianPic");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeIsNull() {
            addCriterion("dietitian_time is null");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeIsNotNull() {
            addCriterion("dietitian_time is not null");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeEqualTo(Date value) {
            addCriterion("dietitian_time =", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeNotEqualTo(Date value) {
            addCriterion("dietitian_time <>", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeGreaterThan(Date value) {
            addCriterion("dietitian_time >", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dietitian_time >=", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeLessThan(Date value) {
            addCriterion("dietitian_time <", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeLessThanOrEqualTo(Date value) {
            addCriterion("dietitian_time <=", value, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeIn(List<Date> values) {
            addCriterion("dietitian_time in", values, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeNotIn(List<Date> values) {
            addCriterion("dietitian_time not in", values, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeBetween(Date value1, Date value2) {
            addCriterion("dietitian_time between", value1, value2, "dietitianTime");
            return (Criteria) this;
        }

        public Criteria andDietitianTimeNotBetween(Date value1, Date value2) {
            addCriterion("dietitian_time not between", value1, value2, "dietitianTime");
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