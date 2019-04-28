package com.ssm.yingjia.po;

import java.util.ArrayList;
import java.util.List;

public class MenuIngreDeshesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuIngreDeshesExample() {
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

        public Criteria andMenuIngreDeshesIdIsNull() {
            addCriterion("menu-ingre_deshes_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdIsNotNull() {
            addCriterion("menu-ingre_deshes_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdEqualTo(Integer value) {
            addCriterion("menu-ingre_deshes_id =", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdNotEqualTo(Integer value) {
            addCriterion("menu-ingre_deshes_id <>", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdGreaterThan(Integer value) {
            addCriterion("menu-ingre_deshes_id >", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu-ingre_deshes_id >=", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdLessThan(Integer value) {
            addCriterion("menu-ingre_deshes_id <", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu-ingre_deshes_id <=", value, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdIn(List<Integer> values) {
            addCriterion("menu-ingre_deshes_id in", values, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdNotIn(List<Integer> values) {
            addCriterion("menu-ingre_deshes_id not in", values, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdBetween(Integer value1, Integer value2) {
            addCriterion("menu-ingre_deshes_id between", value1, value2, "menuIngreDeshesId");
            return (Criteria) this;
        }

        public Criteria andMenuIngreDeshesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu-ingre_deshes_id not between", value1, value2, "menuIngreDeshesId");
            return (Criteria) this;
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(Integer value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(Integer value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(Integer value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(Integer value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(Integer value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(Integer value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<Integer> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<Integer> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(Integer value1, Integer value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(Integer value1, Integer value2) {
            addCriterion("content not between", value1, value2, "content");
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