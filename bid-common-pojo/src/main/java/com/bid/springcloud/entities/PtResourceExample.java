package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class PtResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtResourceExample() {
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

    /**
     * ƽ̨
     * 
     * @author wcyong
     * 
     * @date 2018-11-15
     */
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

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(Integer value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resource_name in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resource_name not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourcePathIsNull() {
            addCriterion("resource_path is null");
            return (Criteria) this;
        }

        public Criteria andResourcePathIsNotNull() {
            addCriterion("resource_path is not null");
            return (Criteria) this;
        }

        public Criteria andResourcePathEqualTo(String value) {
            addCriterion("resource_path =", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotEqualTo(String value) {
            addCriterion("resource_path <>", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathGreaterThan(String value) {
            addCriterion("resource_path >", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathGreaterThanOrEqualTo(String value) {
            addCriterion("resource_path >=", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLessThan(String value) {
            addCriterion("resource_path <", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLessThanOrEqualTo(String value) {
            addCriterion("resource_path <=", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLike(String value) {
            addCriterion("resource_path like", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotLike(String value) {
            addCriterion("resource_path not like", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathIn(List<String> values) {
            addCriterion("resource_path in", values, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotIn(List<String> values) {
            addCriterion("resource_path not in", values, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathBetween(String value1, String value2) {
            addCriterion("resource_path between", value1, value2, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotBetween(String value1, String value2) {
            addCriterion("resource_path not between", value1, value2, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("resource_type like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("resource_type not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andPResourceIdIsNull() {
            addCriterion("p_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andPResourceIdIsNotNull() {
            addCriterion("p_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andPResourceIdEqualTo(String value) {
            addCriterion("p_resource_id =", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdNotEqualTo(String value) {
            addCriterion("p_resource_id <>", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdGreaterThan(String value) {
            addCriterion("p_resource_id >", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_resource_id >=", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdLessThan(String value) {
            addCriterion("p_resource_id <", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdLessThanOrEqualTo(String value) {
            addCriterion("p_resource_id <=", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdLike(String value) {
            addCriterion("p_resource_id like", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdNotLike(String value) {
            addCriterion("p_resource_id not like", value, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdIn(List<String> values) {
            addCriterion("p_resource_id in", values, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdNotIn(List<String> values) {
            addCriterion("p_resource_id not in", values, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdBetween(String value1, String value2) {
            addCriterion("p_resource_id between", value1, value2, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPResourceIdNotBetween(String value1, String value2) {
            addCriterion("p_resource_id not between", value1, value2, "pResourceId");
            return (Criteria) this;
        }

        public Criteria andPtTypeIsNull() {
            addCriterion("pt_type is null");
            return (Criteria) this;
        }

        public Criteria andPtTypeIsNotNull() {
            addCriterion("pt_type is not null");
            return (Criteria) this;
        }

        public Criteria andPtTypeEqualTo(String value) {
            addCriterion("pt_type =", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotEqualTo(String value) {
            addCriterion("pt_type <>", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeGreaterThan(String value) {
            addCriterion("pt_type >", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pt_type >=", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLessThan(String value) {
            addCriterion("pt_type <", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLessThanOrEqualTo(String value) {
            addCriterion("pt_type <=", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLike(String value) {
            addCriterion("pt_type like", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotLike(String value) {
            addCriterion("pt_type not like", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeIn(List<String> values) {
            addCriterion("pt_type in", values, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotIn(List<String> values) {
            addCriterion("pt_type not in", values, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeBetween(String value1, String value2) {
            addCriterion("pt_type between", value1, value2, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotBetween(String value1, String value2) {
            addCriterion("pt_type not between", value1, value2, "ptType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ƽ̨
     * 
     * @author wcyong
     * 
     * @date 2018-11-15
     */
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