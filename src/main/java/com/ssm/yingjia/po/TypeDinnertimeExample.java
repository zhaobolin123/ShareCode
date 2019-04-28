package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeDinnertimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeDinnertimeExample() {
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

        public Criteria andDinnertimeIdIsNull() {
            addCriterion("dinnertime_id is null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdIsNotNull() {
            addCriterion("dinnertime_id is not null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdEqualTo(Integer value) {
            addCriterion("dinnertime_id =", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdNotEqualTo(Integer value) {
            addCriterion("dinnertime_id <>", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdGreaterThan(Integer value) {
            addCriterion("dinnertime_id >", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinnertime_id >=", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdLessThan(Integer value) {
            addCriterion("dinnertime_id <", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("dinnertime_id <=", value, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdIn(List<Integer> values) {
            addCriterion("dinnertime_id in", values, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdNotIn(List<Integer> values) {
            addCriterion("dinnertime_id not in", values, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdBetween(Integer value1, Integer value2) {
            addCriterion("dinnertime_id between", value1, value2, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dinnertime_id not between", value1, value2, "dinnertimeId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameIsNull() {
            addCriterion("dinnertime_name is null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameIsNotNull() {
            addCriterion("dinnertime_name is not null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameEqualTo(String value) {
            addCriterion("dinnertime_name =", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameNotEqualTo(String value) {
            addCriterion("dinnertime_name <>", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameGreaterThan(String value) {
            addCriterion("dinnertime_name >", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("dinnertime_name >=", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameLessThan(String value) {
            addCriterion("dinnertime_name <", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameLessThanOrEqualTo(String value) {
            addCriterion("dinnertime_name <=", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameLike(String value) {
            addCriterion("dinnertime_name like", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameNotLike(String value) {
            addCriterion("dinnertime_name not like", value, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameIn(List<String> values) {
            addCriterion("dinnertime_name in", values, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameNotIn(List<String> values) {
            addCriterion("dinnertime_name not in", values, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameBetween(String value1, String value2) {
            addCriterion("dinnertime_name between", value1, value2, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeNameNotBetween(String value1, String value2) {
            addCriterion("dinnertime_name not between", value1, value2, "dinnertimeName");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeIsNull() {
            addCriterion("dinnertime_type is null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeIsNotNull() {
            addCriterion("dinnertime_type is not null");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeEqualTo(Integer value) {
            addCriterion("dinnertime_type =", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeNotEqualTo(Integer value) {
            addCriterion("dinnertime_type <>", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeGreaterThan(Integer value) {
            addCriterion("dinnertime_type >", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dinnertime_type >=", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeLessThan(Integer value) {
            addCriterion("dinnertime_type <", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dinnertime_type <=", value, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeIn(List<Integer> values) {
            addCriterion("dinnertime_type in", values, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeNotIn(List<Integer> values) {
            addCriterion("dinnertime_type not in", values, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("dinnertime_type between", value1, value2, "dinnertimeType");
            return (Criteria) this;
        }

        public Criteria andDinnertimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dinnertime_type not between", value1, value2, "dinnertimeType");
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