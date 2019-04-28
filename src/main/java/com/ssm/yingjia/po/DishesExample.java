package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class DishesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DishesExample() {
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

        public Criteria andDishesNameIsNull() {
            addCriterion("dishes_name is null");
            return (Criteria) this;
        }

        public Criteria andDishesNameIsNotNull() {
            addCriterion("dishes_name is not null");
            return (Criteria) this;
        }

        public Criteria andDishesNameEqualTo(String value) {
            addCriterion("dishes_name =", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotEqualTo(String value) {
            addCriterion("dishes_name <>", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThan(String value) {
            addCriterion("dishes_name >", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_name >=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThan(String value) {
            addCriterion("dishes_name <", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLessThanOrEqualTo(String value) {
            addCriterion("dishes_name <=", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameLike(String value) {
            addCriterion("dishes_name like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotLike(String value) {
            addCriterion("dishes_name not like", value, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameIn(List<String> values) {
            addCriterion("dishes_name in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotIn(List<String> values) {
            addCriterion("dishes_name not in", values, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameBetween(String value1, String value2) {
            addCriterion("dishes_name between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesNameNotBetween(String value1, String value2) {
            addCriterion("dishes_name not between", value1, value2, "dishesName");
            return (Criteria) this;
        }

        public Criteria andDishesProteinIsNull() {
            addCriterion("dishes_protein is null");
            return (Criteria) this;
        }

        public Criteria andDishesProteinIsNotNull() {
            addCriterion("dishes_protein is not null");
            return (Criteria) this;
        }

        public Criteria andDishesProteinEqualTo(Integer value) {
            addCriterion("dishes_protein =", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinNotEqualTo(Integer value) {
            addCriterion("dishes_protein <>", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinGreaterThan(Integer value) {
            addCriterion("dishes_protein >", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_protein >=", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinLessThan(Integer value) {
            addCriterion("dishes_protein <", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_protein <=", value, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinIn(List<Integer> values) {
            addCriterion("dishes_protein in", values, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinNotIn(List<Integer> values) {
            addCriterion("dishes_protein not in", values, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinBetween(Integer value1, Integer value2) {
            addCriterion("dishes_protein between", value1, value2, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesProteinNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_protein not between", value1, value2, "dishesProtein");
            return (Criteria) this;
        }

        public Criteria andDishesFatIsNull() {
            addCriterion("dishes_fat is null");
            return (Criteria) this;
        }

        public Criteria andDishesFatIsNotNull() {
            addCriterion("dishes_fat is not null");
            return (Criteria) this;
        }

        public Criteria andDishesFatEqualTo(Integer value) {
            addCriterion("dishes_fat =", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatNotEqualTo(Integer value) {
            addCriterion("dishes_fat <>", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatGreaterThan(Integer value) {
            addCriterion("dishes_fat >", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_fat >=", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatLessThan(Integer value) {
            addCriterion("dishes_fat <", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_fat <=", value, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatIn(List<Integer> values) {
            addCriterion("dishes_fat in", values, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatNotIn(List<Integer> values) {
            addCriterion("dishes_fat not in", values, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatBetween(Integer value1, Integer value2) {
            addCriterion("dishes_fat between", value1, value2, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesFatNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_fat not between", value1, value2, "dishesFat");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateIsNull() {
            addCriterion("dishes_carbohydrate is null");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateIsNotNull() {
            addCriterion("dishes_carbohydrate is not null");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateEqualTo(Integer value) {
            addCriterion("dishes_carbohydrate =", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateNotEqualTo(Integer value) {
            addCriterion("dishes_carbohydrate <>", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateGreaterThan(Integer value) {
            addCriterion("dishes_carbohydrate >", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishes_carbohydrate >=", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateLessThan(Integer value) {
            addCriterion("dishes_carbohydrate <", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateLessThanOrEqualTo(Integer value) {
            addCriterion("dishes_carbohydrate <=", value, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateIn(List<Integer> values) {
            addCriterion("dishes_carbohydrate in", values, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateNotIn(List<Integer> values) {
            addCriterion("dishes_carbohydrate not in", values, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateBetween(Integer value1, Integer value2) {
            addCriterion("dishes_carbohydrate between", value1, value2, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesCarbohydrateNotBetween(Integer value1, Integer value2) {
            addCriterion("dishes_carbohydrate not between", value1, value2, "dishesCarbohydrate");
            return (Criteria) this;
        }

        public Criteria andDishesPicIsNull() {
            addCriterion("dishes_pic is null");
            return (Criteria) this;
        }

        public Criteria andDishesPicIsNotNull() {
            addCriterion("dishes_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDishesPicEqualTo(String value) {
            addCriterion("dishes_pic =", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicNotEqualTo(String value) {
            addCriterion("dishes_pic <>", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicGreaterThan(String value) {
            addCriterion("dishes_pic >", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicGreaterThanOrEqualTo(String value) {
            addCriterion("dishes_pic >=", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicLessThan(String value) {
            addCriterion("dishes_pic <", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicLessThanOrEqualTo(String value) {
            addCriterion("dishes_pic <=", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicLike(String value) {
            addCriterion("dishes_pic like", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicNotLike(String value) {
            addCriterion("dishes_pic not like", value, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicIn(List<String> values) {
            addCriterion("dishes_pic in", values, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicNotIn(List<String> values) {
            addCriterion("dishes_pic not in", values, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicBetween(String value1, String value2) {
            addCriterion("dishes_pic between", value1, value2, "dishesPic");
            return (Criteria) this;
        }

        public Criteria andDishesPicNotBetween(String value1, String value2) {
            addCriterion("dishes_pic not between", value1, value2, "dishesPic");
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