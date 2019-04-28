package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeConstitutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeConstitutionExample() {
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

        public Criteria andConstitutionIdIsNull() {
            addCriterion("constitution_id is null");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdIsNotNull() {
            addCriterion("constitution_id is not null");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdEqualTo(Integer value) {
            addCriterion("constitution_id =", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdNotEqualTo(Integer value) {
            addCriterion("constitution_id <>", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdGreaterThan(Integer value) {
            addCriterion("constitution_id >", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("constitution_id >=", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdLessThan(Integer value) {
            addCriterion("constitution_id <", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdLessThanOrEqualTo(Integer value) {
            addCriterion("constitution_id <=", value, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdIn(List<Integer> values) {
            addCriterion("constitution_id in", values, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdNotIn(List<Integer> values) {
            addCriterion("constitution_id not in", values, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdBetween(Integer value1, Integer value2) {
            addCriterion("constitution_id between", value1, value2, "constitutionId");
            return (Criteria) this;
        }

        public Criteria andConstitutionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("constitution_id not between", value1, value2, "constitutionId");
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

        public Criteria andConstitutionNameIsNull() {
            addCriterion("constitution_name is null");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameIsNotNull() {
            addCriterion("constitution_name is not null");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameEqualTo(String value) {
            addCriterion("constitution_name =", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameNotEqualTo(String value) {
            addCriterion("constitution_name <>", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameGreaterThan(String value) {
            addCriterion("constitution_name >", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("constitution_name >=", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameLessThan(String value) {
            addCriterion("constitution_name <", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("constitution_name <=", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameLike(String value) {
            addCriterion("constitution_name like", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameNotLike(String value) {
            addCriterion("constitution_name not like", value, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameIn(List<String> values) {
            addCriterion("constitution_name in", values, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameNotIn(List<String> values) {
            addCriterion("constitution_name not in", values, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameBetween(String value1, String value2) {
            addCriterion("constitution_name between", value1, value2, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionNameNotBetween(String value1, String value2) {
            addCriterion("constitution_name not between", value1, value2, "constitutionName");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeIsNull() {
            addCriterion("constitution_type is null");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeIsNotNull() {
            addCriterion("constitution_type is not null");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeEqualTo(Integer value) {
            addCriterion("constitution_type =", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeNotEqualTo(Integer value) {
            addCriterion("constitution_type <>", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeGreaterThan(Integer value) {
            addCriterion("constitution_type >", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("constitution_type >=", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeLessThan(Integer value) {
            addCriterion("constitution_type <", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("constitution_type <=", value, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeIn(List<Integer> values) {
            addCriterion("constitution_type in", values, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeNotIn(List<Integer> values) {
            addCriterion("constitution_type not in", values, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeBetween(Integer value1, Integer value2) {
            addCriterion("constitution_type between", value1, value2, "constitutionType");
            return (Criteria) this;
        }

        public Criteria andConstitutionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("constitution_type not between", value1, value2, "constitutionType");
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