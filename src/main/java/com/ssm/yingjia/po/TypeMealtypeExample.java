package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeMealtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeMealtypeExample() {
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

        public Criteria andMealtypeIdIsNull() {
            addCriterion("mealtype_id is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdIsNotNull() {
            addCriterion("mealtype_id is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdEqualTo(Integer value) {
            addCriterion("mealtype_id =", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdNotEqualTo(Integer value) {
            addCriterion("mealtype_id <>", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdGreaterThan(Integer value) {
            addCriterion("mealtype_id >", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mealtype_id >=", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdLessThan(Integer value) {
            addCriterion("mealtype_id <", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("mealtype_id <=", value, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdIn(List<Integer> values) {
            addCriterion("mealtype_id in", values, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdNotIn(List<Integer> values) {
            addCriterion("mealtype_id not in", values, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdBetween(Integer value1, Integer value2) {
            addCriterion("mealtype_id between", value1, value2, "mealtypeId");
            return (Criteria) this;
        }

        public Criteria andMealtypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mealtype_id not between", value1, value2, "mealtypeId");
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

        public Criteria andMealtypeNameIsNull() {
            addCriterion("mealtype_name is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameIsNotNull() {
            addCriterion("mealtype_name is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameEqualTo(String value) {
            addCriterion("mealtype_name =", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameNotEqualTo(String value) {
            addCriterion("mealtype_name <>", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameGreaterThan(String value) {
            addCriterion("mealtype_name >", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("mealtype_name >=", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameLessThan(String value) {
            addCriterion("mealtype_name <", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameLessThanOrEqualTo(String value) {
            addCriterion("mealtype_name <=", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameLike(String value) {
            addCriterion("mealtype_name like", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameNotLike(String value) {
            addCriterion("mealtype_name not like", value, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameIn(List<String> values) {
            addCriterion("mealtype_name in", values, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameNotIn(List<String> values) {
            addCriterion("mealtype_name not in", values, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameBetween(String value1, String value2) {
            addCriterion("mealtype_name between", value1, value2, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeNameNotBetween(String value1, String value2) {
            addCriterion("mealtype_name not between", value1, value2, "mealtypeName");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeIsNull() {
            addCriterion("mealtype_type is null");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeIsNotNull() {
            addCriterion("mealtype_type is not null");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeEqualTo(Integer value) {
            addCriterion("mealtype_type =", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeNotEqualTo(Integer value) {
            addCriterion("mealtype_type <>", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeGreaterThan(Integer value) {
            addCriterion("mealtype_type >", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mealtype_type >=", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeLessThan(Integer value) {
            addCriterion("mealtype_type <", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mealtype_type <=", value, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeIn(List<Integer> values) {
            addCriterion("mealtype_type in", values, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeNotIn(List<Integer> values) {
            addCriterion("mealtype_type not in", values, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeBetween(Integer value1, Integer value2) {
            addCriterion("mealtype_type between", value1, value2, "mealtypeType");
            return (Criteria) this;
        }

        public Criteria andMealtypeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mealtype_type not between", value1, value2, "mealtypeType");
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