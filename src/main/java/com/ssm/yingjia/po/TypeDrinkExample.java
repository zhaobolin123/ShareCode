package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeDrinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeDrinkExample() {
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

        public Criteria andDrinkIdIsNull() {
            addCriterion("drink_id is null");
            return (Criteria) this;
        }

        public Criteria andDrinkIdIsNotNull() {
            addCriterion("drink_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkIdEqualTo(Integer value) {
            addCriterion("drink_id =", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotEqualTo(Integer value) {
            addCriterion("drink_id <>", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdGreaterThan(Integer value) {
            addCriterion("drink_id >", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drink_id >=", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdLessThan(Integer value) {
            addCriterion("drink_id <", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("drink_id <=", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdIn(List<Integer> values) {
            addCriterion("drink_id in", values, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotIn(List<Integer> values) {
            addCriterion("drink_id not in", values, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdBetween(Integer value1, Integer value2) {
            addCriterion("drink_id between", value1, value2, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drink_id not between", value1, value2, "drinkId");
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

        public Criteria andDrinkNameIsNull() {
            addCriterion("drink_name is null");
            return (Criteria) this;
        }

        public Criteria andDrinkNameIsNotNull() {
            addCriterion("drink_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkNameEqualTo(String value) {
            addCriterion("drink_name =", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameNotEqualTo(String value) {
            addCriterion("drink_name <>", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameGreaterThan(String value) {
            addCriterion("drink_name >", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("drink_name >=", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameLessThan(String value) {
            addCriterion("drink_name <", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameLessThanOrEqualTo(String value) {
            addCriterion("drink_name <=", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameLike(String value) {
            addCriterion("drink_name like", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameNotLike(String value) {
            addCriterion("drink_name not like", value, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameIn(List<String> values) {
            addCriterion("drink_name in", values, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameNotIn(List<String> values) {
            addCriterion("drink_name not in", values, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameBetween(String value1, String value2) {
            addCriterion("drink_name between", value1, value2, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkNameNotBetween(String value1, String value2) {
            addCriterion("drink_name not between", value1, value2, "drinkName");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeIsNull() {
            addCriterion("drink_type is null");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeIsNotNull() {
            addCriterion("drink_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeEqualTo(Integer value) {
            addCriterion("drink_type =", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeNotEqualTo(Integer value) {
            addCriterion("drink_type <>", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeGreaterThan(Integer value) {
            addCriterion("drink_type >", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drink_type >=", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeLessThan(Integer value) {
            addCriterion("drink_type <", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("drink_type <=", value, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeIn(List<Integer> values) {
            addCriterion("drink_type in", values, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeNotIn(List<Integer> values) {
            addCriterion("drink_type not in", values, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeBetween(Integer value1, Integer value2) {
            addCriterion("drink_type between", value1, value2, "drinkType");
            return (Criteria) this;
        }

        public Criteria andDrinkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("drink_type not between", value1, value2, "drinkType");
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