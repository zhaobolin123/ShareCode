package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeAllergenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeAllergenExample() {
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

        public Criteria andAllergenIdIsNull() {
            addCriterion("allergen_id is null");
            return (Criteria) this;
        }

        public Criteria andAllergenIdIsNotNull() {
            addCriterion("allergen_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllergenIdEqualTo(Integer value) {
            addCriterion("allergen_id =", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdNotEqualTo(Integer value) {
            addCriterion("allergen_id <>", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdGreaterThan(Integer value) {
            addCriterion("allergen_id >", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("allergen_id >=", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdLessThan(Integer value) {
            addCriterion("allergen_id <", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdLessThanOrEqualTo(Integer value) {
            addCriterion("allergen_id <=", value, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdIn(List<Integer> values) {
            addCriterion("allergen_id in", values, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdNotIn(List<Integer> values) {
            addCriterion("allergen_id not in", values, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdBetween(Integer value1, Integer value2) {
            addCriterion("allergen_id between", value1, value2, "allergenId");
            return (Criteria) this;
        }

        public Criteria andAllergenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("allergen_id not between", value1, value2, "allergenId");
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

        public Criteria andAllergenNameIsNull() {
            addCriterion("allergen_name is null");
            return (Criteria) this;
        }

        public Criteria andAllergenNameIsNotNull() {
            addCriterion("allergen_name is not null");
            return (Criteria) this;
        }

        public Criteria andAllergenNameEqualTo(String value) {
            addCriterion("allergen_name =", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameNotEqualTo(String value) {
            addCriterion("allergen_name <>", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameGreaterThan(String value) {
            addCriterion("allergen_name >", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameGreaterThanOrEqualTo(String value) {
            addCriterion("allergen_name >=", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameLessThan(String value) {
            addCriterion("allergen_name <", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameLessThanOrEqualTo(String value) {
            addCriterion("allergen_name <=", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameLike(String value) {
            addCriterion("allergen_name like", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameNotLike(String value) {
            addCriterion("allergen_name not like", value, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameIn(List<String> values) {
            addCriterion("allergen_name in", values, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameNotIn(List<String> values) {
            addCriterion("allergen_name not in", values, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameBetween(String value1, String value2) {
            addCriterion("allergen_name between", value1, value2, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenNameNotBetween(String value1, String value2) {
            addCriterion("allergen_name not between", value1, value2, "allergenName");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeIsNull() {
            addCriterion("allergen_type is null");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeIsNotNull() {
            addCriterion("allergen_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeEqualTo(Integer value) {
            addCriterion("allergen_type =", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeNotEqualTo(Integer value) {
            addCriterion("allergen_type <>", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeGreaterThan(Integer value) {
            addCriterion("allergen_type >", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("allergen_type >=", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeLessThan(Integer value) {
            addCriterion("allergen_type <", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeLessThanOrEqualTo(Integer value) {
            addCriterion("allergen_type <=", value, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeIn(List<Integer> values) {
            addCriterion("allergen_type in", values, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeNotIn(List<Integer> values) {
            addCriterion("allergen_type not in", values, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeBetween(Integer value1, Integer value2) {
            addCriterion("allergen_type between", value1, value2, "allergenType");
            return (Criteria) this;
        }

        public Criteria andAllergenTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("allergen_type not between", value1, value2, "allergenType");
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