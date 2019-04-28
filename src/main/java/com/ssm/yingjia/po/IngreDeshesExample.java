package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class IngreDeshesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IngreDeshesExample() {
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

        public Criteria andIngreDeshesIdIsNull() {
            addCriterion("ingre-deshes_id is null");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdIsNotNull() {
            addCriterion("ingre-deshes_id is not null");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdEqualTo(Integer value) {
            addCriterion("ingre-deshes_id =", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdNotEqualTo(Integer value) {
            addCriterion("ingre-deshes_id <>", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdGreaterThan(Integer value) {
            addCriterion("ingre-deshes_id >", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ingre-deshes_id >=", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdLessThan(Integer value) {
            addCriterion("ingre-deshes_id <", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdLessThanOrEqualTo(Integer value) {
            addCriterion("ingre-deshes_id <=", value, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdIn(List<Integer> values) {
            addCriterion("ingre-deshes_id in", values, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdNotIn(List<Integer> values) {
            addCriterion("ingre-deshes_id not in", values, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdBetween(Integer value1, Integer value2) {
            addCriterion("ingre-deshes_id between", value1, value2, "ingreDeshesId");
            return (Criteria) this;
        }

        public Criteria andIngreDeshesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ingre-deshes_id not between", value1, value2, "ingreDeshesId");
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

        public Criteria andIngreIdIsNull() {
            addCriterion("ingre_id is null");
            return (Criteria) this;
        }

        public Criteria andIngreIdIsNotNull() {
            addCriterion("ingre_id is not null");
            return (Criteria) this;
        }

        public Criteria andIngreIdEqualTo(Integer value) {
            addCriterion("ingre_id =", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdNotEqualTo(Integer value) {
            addCriterion("ingre_id <>", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdGreaterThan(Integer value) {
            addCriterion("ingre_id >", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ingre_id >=", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdLessThan(Integer value) {
            addCriterion("ingre_id <", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdLessThanOrEqualTo(Integer value) {
            addCriterion("ingre_id <=", value, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdIn(List<Integer> values) {
            addCriterion("ingre_id in", values, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdNotIn(List<Integer> values) {
            addCriterion("ingre_id not in", values, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdBetween(Integer value1, Integer value2) {
            addCriterion("ingre_id between", value1, value2, "ingreId");
            return (Criteria) this;
        }

        public Criteria andIngreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ingre_id not between", value1, value2, "ingreId");
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