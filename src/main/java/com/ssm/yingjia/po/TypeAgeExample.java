package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeAgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeAgeExample() {
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

        public Criteria andAgeIdIsNull() {
            addCriterion("age_id is null");
            return (Criteria) this;
        }

        public Criteria andAgeIdIsNotNull() {
            addCriterion("age_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgeIdEqualTo(Integer value) {
            addCriterion("age_id =", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotEqualTo(Integer value) {
            addCriterion("age_id <>", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThan(Integer value) {
            addCriterion("age_id >", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_id >=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThan(Integer value) {
            addCriterion("age_id <", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("age_id <=", value, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdIn(List<Integer> values) {
            addCriterion("age_id in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotIn(List<Integer> values) {
            addCriterion("age_id not in", values, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdBetween(Integer value1, Integer value2) {
            addCriterion("age_id between", value1, value2, "ageId");
            return (Criteria) this;
        }

        public Criteria andAgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("age_id not between", value1, value2, "ageId");
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

        public Criteria andAgeNameIsNull() {
            addCriterion("age_name is null");
            return (Criteria) this;
        }

        public Criteria andAgeNameIsNotNull() {
            addCriterion("age_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgeNameEqualTo(String value) {
            addCriterion("age_name =", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotEqualTo(String value) {
            addCriterion("age_name <>", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameGreaterThan(String value) {
            addCriterion("age_name >", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("age_name >=", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLessThan(String value) {
            addCriterion("age_name <", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLessThanOrEqualTo(String value) {
            addCriterion("age_name <=", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameLike(String value) {
            addCriterion("age_name like", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotLike(String value) {
            addCriterion("age_name not like", value, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameIn(List<String> values) {
            addCriterion("age_name in", values, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotIn(List<String> values) {
            addCriterion("age_name not in", values, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameBetween(String value1, String value2) {
            addCriterion("age_name between", value1, value2, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeNameNotBetween(String value1, String value2) {
            addCriterion("age_name not between", value1, value2, "ageName");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIsNull() {
            addCriterion("age_type is null");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIsNotNull() {
            addCriterion("age_type is not null");
            return (Criteria) this;
        }

        public Criteria andAgeTypeEqualTo(Integer value) {
            addCriterion("age_type =", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotEqualTo(Integer value) {
            addCriterion("age_type <>", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeGreaterThan(Integer value) {
            addCriterion("age_type >", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age_type >=", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLessThan(Integer value) {
            addCriterion("age_type <", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("age_type <=", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIn(List<Integer> values) {
            addCriterion("age_type in", values, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotIn(List<Integer> values) {
            addCriterion("age_type not in", values, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeBetween(Integer value1, Integer value2) {
            addCriterion("age_type between", value1, value2, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("age_type not between", value1, value2, "ageType");
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