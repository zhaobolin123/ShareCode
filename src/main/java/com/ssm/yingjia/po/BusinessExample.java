package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class BusinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessExample() {
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

        public Criteria andBusIdIsNull() {
            addCriterion("bus_id is null");
            return (Criteria) this;
        }

        public Criteria andBusIdIsNotNull() {
            addCriterion("bus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusIdEqualTo(Integer value) {
            addCriterion("bus_id =", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotEqualTo(Integer value) {
            addCriterion("bus_id <>", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThan(Integer value) {
            addCriterion("bus_id >", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_id >=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThan(Integer value) {
            addCriterion("bus_id <", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdLessThanOrEqualTo(Integer value) {
            addCriterion("bus_id <=", value, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdIn(List<Integer> values) {
            addCriterion("bus_id in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotIn(List<Integer> values) {
            addCriterion("bus_id not in", values, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdBetween(Integer value1, Integer value2) {
            addCriterion("bus_id between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_id not between", value1, value2, "busId");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNull() {
            addCriterion("bus_name is null");
            return (Criteria) this;
        }

        public Criteria andBusNameIsNotNull() {
            addCriterion("bus_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusNameEqualTo(String value) {
            addCriterion("bus_name =", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotEqualTo(String value) {
            addCriterion("bus_name <>", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThan(String value) {
            addCriterion("bus_name >", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameGreaterThanOrEqualTo(String value) {
            addCriterion("bus_name >=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThan(String value) {
            addCriterion("bus_name <", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLessThanOrEqualTo(String value) {
            addCriterion("bus_name <=", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameLike(String value) {
            addCriterion("bus_name like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotLike(String value) {
            addCriterion("bus_name not like", value, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameIn(List<String> values) {
            addCriterion("bus_name in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotIn(List<String> values) {
            addCriterion("bus_name not in", values, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameBetween(String value1, String value2) {
            addCriterion("bus_name between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andBusNameNotBetween(String value1, String value2) {
            addCriterion("bus_name not between", value1, value2, "busName");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIsNull() {
            addCriterion("bus_phone is null");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIsNotNull() {
            addCriterion("bus_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBusPhoneEqualTo(String value) {
            addCriterion("bus_phone =", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotEqualTo(String value) {
            addCriterion("bus_phone <>", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneGreaterThan(String value) {
            addCriterion("bus_phone >", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bus_phone >=", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLessThan(String value) {
            addCriterion("bus_phone <", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLessThanOrEqualTo(String value) {
            addCriterion("bus_phone <=", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneLike(String value) {
            addCriterion("bus_phone like", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotLike(String value) {
            addCriterion("bus_phone not like", value, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneIn(List<String> values) {
            addCriterion("bus_phone in", values, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotIn(List<String> values) {
            addCriterion("bus_phone not in", values, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneBetween(String value1, String value2) {
            addCriterion("bus_phone between", value1, value2, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPhoneNotBetween(String value1, String value2) {
            addCriterion("bus_phone not between", value1, value2, "busPhone");
            return (Criteria) this;
        }

        public Criteria andBusPasswordIsNull() {
            addCriterion("bus_password is null");
            return (Criteria) this;
        }

        public Criteria andBusPasswordIsNotNull() {
            addCriterion("bus_password is not null");
            return (Criteria) this;
        }

        public Criteria andBusPasswordEqualTo(String value) {
            addCriterion("bus_password =", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordNotEqualTo(String value) {
            addCriterion("bus_password <>", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordGreaterThan(String value) {
            addCriterion("bus_password >", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("bus_password >=", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordLessThan(String value) {
            addCriterion("bus_password <", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordLessThanOrEqualTo(String value) {
            addCriterion("bus_password <=", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordLike(String value) {
            addCriterion("bus_password like", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordNotLike(String value) {
            addCriterion("bus_password not like", value, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordIn(List<String> values) {
            addCriterion("bus_password in", values, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordNotIn(List<String> values) {
            addCriterion("bus_password not in", values, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordBetween(String value1, String value2) {
            addCriterion("bus_password between", value1, value2, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusPasswordNotBetween(String value1, String value2) {
            addCriterion("bus_password not between", value1, value2, "busPassword");
            return (Criteria) this;
        }

        public Criteria andBusLocIsNull() {
            addCriterion("bus_loc is null");
            return (Criteria) this;
        }

        public Criteria andBusLocIsNotNull() {
            addCriterion("bus_loc is not null");
            return (Criteria) this;
        }

        public Criteria andBusLocEqualTo(String value) {
            addCriterion("bus_loc =", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocNotEqualTo(String value) {
            addCriterion("bus_loc <>", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocGreaterThan(String value) {
            addCriterion("bus_loc >", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocGreaterThanOrEqualTo(String value) {
            addCriterion("bus_loc >=", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocLessThan(String value) {
            addCriterion("bus_loc <", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocLessThanOrEqualTo(String value) {
            addCriterion("bus_loc <=", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocLike(String value) {
            addCriterion("bus_loc like", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocNotLike(String value) {
            addCriterion("bus_loc not like", value, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocIn(List<String> values) {
            addCriterion("bus_loc in", values, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocNotIn(List<String> values) {
            addCriterion("bus_loc not in", values, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocBetween(String value1, String value2) {
            addCriterion("bus_loc between", value1, value2, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLocNotBetween(String value1, String value2) {
            addCriterion("bus_loc not between", value1, value2, "busLoc");
            return (Criteria) this;
        }

        public Criteria andBusLevelIsNull() {
            addCriterion("bus_level is null");
            return (Criteria) this;
        }

        public Criteria andBusLevelIsNotNull() {
            addCriterion("bus_level is not null");
            return (Criteria) this;
        }

        public Criteria andBusLevelEqualTo(Integer value) {
            addCriterion("bus_level =", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelNotEqualTo(Integer value) {
            addCriterion("bus_level <>", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelGreaterThan(Integer value) {
            addCriterion("bus_level >", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("bus_level >=", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelLessThan(Integer value) {
            addCriterion("bus_level <", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelLessThanOrEqualTo(Integer value) {
            addCriterion("bus_level <=", value, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelIn(List<Integer> values) {
            addCriterion("bus_level in", values, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelNotIn(List<Integer> values) {
            addCriterion("bus_level not in", values, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelBetween(Integer value1, Integer value2) {
            addCriterion("bus_level between", value1, value2, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("bus_level not between", value1, value2, "busLevel");
            return (Criteria) this;
        }

        public Criteria andBusContactIsNull() {
            addCriterion("bus_contact is null");
            return (Criteria) this;
        }

        public Criteria andBusContactIsNotNull() {
            addCriterion("bus_contact is not null");
            return (Criteria) this;
        }

        public Criteria andBusContactEqualTo(String value) {
            addCriterion("bus_contact =", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactNotEqualTo(String value) {
            addCriterion("bus_contact <>", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactGreaterThan(String value) {
            addCriterion("bus_contact >", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactGreaterThanOrEqualTo(String value) {
            addCriterion("bus_contact >=", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactLessThan(String value) {
            addCriterion("bus_contact <", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactLessThanOrEqualTo(String value) {
            addCriterion("bus_contact <=", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactLike(String value) {
            addCriterion("bus_contact like", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactNotLike(String value) {
            addCriterion("bus_contact not like", value, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactIn(List<String> values) {
            addCriterion("bus_contact in", values, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactNotIn(List<String> values) {
            addCriterion("bus_contact not in", values, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactBetween(String value1, String value2) {
            addCriterion("bus_contact between", value1, value2, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusContactNotBetween(String value1, String value2) {
            addCriterion("bus_contact not between", value1, value2, "busContact");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionIsNull() {
            addCriterion("bus_introduction is null");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionIsNotNull() {
            addCriterion("bus_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionEqualTo(String value) {
            addCriterion("bus_introduction =", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionNotEqualTo(String value) {
            addCriterion("bus_introduction <>", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionGreaterThan(String value) {
            addCriterion("bus_introduction >", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("bus_introduction >=", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionLessThan(String value) {
            addCriterion("bus_introduction <", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionLessThanOrEqualTo(String value) {
            addCriterion("bus_introduction <=", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionLike(String value) {
            addCriterion("bus_introduction like", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionNotLike(String value) {
            addCriterion("bus_introduction not like", value, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionIn(List<String> values) {
            addCriterion("bus_introduction in", values, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionNotIn(List<String> values) {
            addCriterion("bus_introduction not in", values, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionBetween(String value1, String value2) {
            addCriterion("bus_introduction between", value1, value2, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusIntroductionNotBetween(String value1, String value2) {
            addCriterion("bus_introduction not between", value1, value2, "busIntroduction");
            return (Criteria) this;
        }

        public Criteria andBusPicIsNull() {
            addCriterion("bus_pic is null");
            return (Criteria) this;
        }

        public Criteria andBusPicIsNotNull() {
            addCriterion("bus_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBusPicEqualTo(String value) {
            addCriterion("bus_pic =", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotEqualTo(String value) {
            addCriterion("bus_pic <>", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicGreaterThan(String value) {
            addCriterion("bus_pic >", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicGreaterThanOrEqualTo(String value) {
            addCriterion("bus_pic >=", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLessThan(String value) {
            addCriterion("bus_pic <", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLessThanOrEqualTo(String value) {
            addCriterion("bus_pic <=", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicLike(String value) {
            addCriterion("bus_pic like", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotLike(String value) {
            addCriterion("bus_pic not like", value, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicIn(List<String> values) {
            addCriterion("bus_pic in", values, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotIn(List<String> values) {
            addCriterion("bus_pic not in", values, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicBetween(String value1, String value2) {
            addCriterion("bus_pic between", value1, value2, "busPic");
            return (Criteria) this;
        }

        public Criteria andBusPicNotBetween(String value1, String value2) {
            addCriterion("bus_pic not between", value1, value2, "busPic");
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