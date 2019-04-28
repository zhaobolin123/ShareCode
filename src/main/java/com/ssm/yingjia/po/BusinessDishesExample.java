package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class BusinessDishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessDishesExample() {
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

        public Criteria andBusinessDishesIdIsNull() {
            addCriterion("business-dishes_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdIsNotNull() {
            addCriterion("business-dishes_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdEqualTo(Integer value) {
            addCriterion("business-dishes_id =", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdNotEqualTo(Integer value) {
            addCriterion("business-dishes_id <>", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdGreaterThan(Integer value) {
            addCriterion("business-dishes_id >", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business-dishes_id >=", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdLessThan(Integer value) {
            addCriterion("business-dishes_id <", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdLessThanOrEqualTo(Integer value) {
            addCriterion("business-dishes_id <=", value, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdIn(List<Integer> values) {
            addCriterion("business-dishes_id in", values, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdNotIn(List<Integer> values) {
            addCriterion("business-dishes_id not in", values, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdBetween(Integer value1, Integer value2) {
            addCriterion("business-dishes_id between", value1, value2, "businessDishesId");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business-dishes_id not between", value1, value2, "businessDishesId");
            return (Criteria) this;
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

        public Criteria andDishesIdIsNull() {
            addCriterion("dishes_id is null");
            return (Criteria) this;
        }

        public Criteria andDishesIdIsNotNull() {
            addCriterion("dishes_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishesIdEqualTo(Integer value) {
            addCriterion("dishes_id =", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotEqualTo(Integer value) {
            addCriterion("dishes_id <>", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdGreaterThan(Integer value) {
            addCriterion("dishes_id >", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_id >=", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdLessThan(Integer value) {
            addCriterion("dishes_id <", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_id <=", value, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdIn(List<Integer> values) {
            addCriterion("dishes_id in", values, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotIn(List<Integer> values) {
            addCriterion("dishes_id not in", values, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdBetween(Integer value1, Integer value2) {
            addCriterion("dishes_id between", value1, value2, "dishesId");
            return (Criteria) this;
        }

        public Criteria andDishesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_id not between", value1, value2, "dishesId");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelIsNull() {
            addCriterion("special_level is null");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelIsNotNull() {
            addCriterion("special_level is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelEqualTo(Integer value) {
            addCriterion("special_level =", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelNotEqualTo(Integer value) {
            addCriterion("special_level <>", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelGreaterThan(Integer value) {
            addCriterion("special_level >", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_level >=", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelLessThan(Integer value) {
            addCriterion("special_level <", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelLessThanOrEqualTo(Integer value) {
            addCriterion("special_level <=", value, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelIn(List<Integer> values) {
            addCriterion("special_level in", values, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelNotIn(List<Integer> values) {
            addCriterion("special_level not in", values, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelBetween(Integer value1, Integer value2) {
            addCriterion("special_level between", value1, value2, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andSpecialLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("special_level not between", value1, value2, "specialLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNull() {
            addCriterion("quality_level is null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIsNotNull() {
            addCriterion("quality_level is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelEqualTo(Integer value) {
            addCriterion("quality_level =", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotEqualTo(Integer value) {
            addCriterion("quality_level <>", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThan(Integer value) {
            addCriterion("quality_level >", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_level >=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThan(Integer value) {
            addCriterion("quality_level <", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("quality_level <=", value, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIn(List<Integer> values) {
            addCriterion("quality_level in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotIn(List<Integer> values) {
            addCriterion("quality_level not in", values, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelBetween(Integer value1, Integer value2) {
            addCriterion("quality_level between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andQualityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_level not between", value1, value2, "qualityLevel");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicIsNull() {
            addCriterion("business-dishes_pic is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicIsNotNull() {
            addCriterion("business-dishes_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicEqualTo(String value) {
            addCriterion("business-dishes_pic =", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicNotEqualTo(String value) {
            addCriterion("business-dishes_pic <>", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicGreaterThan(String value) {
            addCriterion("business-dishes_pic >", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicGreaterThanOrEqualTo(String value) {
            addCriterion("business-dishes_pic >=", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicLessThan(String value) {
            addCriterion("business-dishes_pic <", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicLessThanOrEqualTo(String value) {
            addCriterion("business-dishes_pic <=", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicLike(String value) {
            addCriterion("business-dishes_pic like", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicNotLike(String value) {
            addCriterion("business-dishes_pic not like", value, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicIn(List<String> values) {
            addCriterion("business-dishes_pic in", values, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicNotIn(List<String> values) {
            addCriterion("business-dishes_pic not in", values, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicBetween(String value1, String value2) {
            addCriterion("business-dishes_pic between", value1, value2, "businessDishesPic");
            return (Criteria) this;
        }

        public Criteria andBusinessDishesPicNotBetween(String value1, String value2) {
            addCriterion("business-dishes_pic not between", value1, value2, "businessDishesPic");
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