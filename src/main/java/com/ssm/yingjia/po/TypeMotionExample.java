package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class TypeMotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeMotionExample() {
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

        public Criteria andMotionIdIsNull() {
            addCriterion("motion_id is null");
            return (Criteria) this;
        }

        public Criteria andMotionIdIsNotNull() {
            addCriterion("motion_id is not null");
            return (Criteria) this;
        }

        public Criteria andMotionIdEqualTo(Integer value) {
            addCriterion("motion_id =", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdNotEqualTo(Integer value) {
            addCriterion("motion_id <>", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdGreaterThan(Integer value) {
            addCriterion("motion_id >", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("motion_id >=", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdLessThan(Integer value) {
            addCriterion("motion_id <", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdLessThanOrEqualTo(Integer value) {
            addCriterion("motion_id <=", value, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdIn(List<Integer> values) {
            addCriterion("motion_id in", values, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdNotIn(List<Integer> values) {
            addCriterion("motion_id not in", values, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdBetween(Integer value1, Integer value2) {
            addCriterion("motion_id between", value1, value2, "motionId");
            return (Criteria) this;
        }

        public Criteria andMotionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("motion_id not between", value1, value2, "motionId");
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

        public Criteria andMotionNameIsNull() {
            addCriterion("motion_name is null");
            return (Criteria) this;
        }

        public Criteria andMotionNameIsNotNull() {
            addCriterion("motion_name is not null");
            return (Criteria) this;
        }

        public Criteria andMotionNameEqualTo(String value) {
            addCriterion("motion_name =", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameNotEqualTo(String value) {
            addCriterion("motion_name <>", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameGreaterThan(String value) {
            addCriterion("motion_name >", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameGreaterThanOrEqualTo(String value) {
            addCriterion("motion_name >=", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameLessThan(String value) {
            addCriterion("motion_name <", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameLessThanOrEqualTo(String value) {
            addCriterion("motion_name <=", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameLike(String value) {
            addCriterion("motion_name like", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameNotLike(String value) {
            addCriterion("motion_name not like", value, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameIn(List<String> values) {
            addCriterion("motion_name in", values, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameNotIn(List<String> values) {
            addCriterion("motion_name not in", values, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameBetween(String value1, String value2) {
            addCriterion("motion_name between", value1, value2, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionNameNotBetween(String value1, String value2) {
            addCriterion("motion_name not between", value1, value2, "motionName");
            return (Criteria) this;
        }

        public Criteria andMotionTypeIsNull() {
            addCriterion("motion_type is null");
            return (Criteria) this;
        }

        public Criteria andMotionTypeIsNotNull() {
            addCriterion("motion_type is not null");
            return (Criteria) this;
        }

        public Criteria andMotionTypeEqualTo(Integer value) {
            addCriterion("motion_type =", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeNotEqualTo(Integer value) {
            addCriterion("motion_type <>", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeGreaterThan(Integer value) {
            addCriterion("motion_type >", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("motion_type >=", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeLessThan(Integer value) {
            addCriterion("motion_type <", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("motion_type <=", value, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeIn(List<Integer> values) {
            addCriterion("motion_type in", values, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeNotIn(List<Integer> values) {
            addCriterion("motion_type not in", values, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeBetween(Integer value1, Integer value2) {
            addCriterion("motion_type between", value1, value2, "motionType");
            return (Criteria) this;
        }

        public Criteria andMotionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("motion_type not between", value1, value2, "motionType");
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