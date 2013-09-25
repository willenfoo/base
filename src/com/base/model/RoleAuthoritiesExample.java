package com.base.model;import com.util.mybatis.BaseExample;

import java.util.ArrayList;
import java.util.List;

public class RoleAuthoritiesExample extends BaseExample {
    

    

    protected List<Criteria> oredCriteria;

    public RoleAuthoritiesExample() {
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
        distinct = false;   join = null; column = null; isCache = false;groupBy = null;having = null;
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

        public void addCriterion(String condition) {
            if (condition == null) {
                log.error("值为空,Value for condition cannot be null");
            return ;}
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                log.error("值为空,Value for " + property + " cannot be null");
            return ;}
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                log.error("值为空,Between values for " + property + " cannot be null");
            return ;}
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull(String as) {
            addCriterion(as+".id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull(String as) {
            addCriterion(as+".id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String as,Integer value) {
            addCriterion(as+".id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String as,Integer value) {
            addCriterion(as+".id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String as,Integer value) {
            addCriterion(as+".id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(String as,List<Integer> values) {
            addCriterion(as+".id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull(String as) {
            addCriterion(as+".role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull(String as) {
            addCriterion(as+".role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String as,Integer value) {
            addCriterion(as+".role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String as,Integer value) {
            addCriterion(as+".role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String as,Integer value) {
            addCriterion(as+".role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(String as,List<Integer> values) {
            addCriterion(as+".role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIsNull(String as) {
            addCriterion(as+".authorities_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIsNotNull(String as) {
            addCriterion(as+".authorities_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdEqualTo(String as,Integer value) {
            addCriterion(as+".authorities_id =", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotEqualTo(String as,Integer value) {
            addCriterion(as+".authorities_id <>", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdGreaterThan(String as,Integer value) {
            addCriterion(as+".authorities_id >", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdGreaterThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".authorities_id >=", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdLessThan(String as,Integer value) {
            addCriterion(as+".authorities_id <", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdLessThanOrEqualTo(String as,Integer value) {
            addCriterion(as+".authorities_id <=", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIn(String as,List<Integer> values) {
            addCriterion(as+".authorities_id in", values, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotIn(String as,List<Integer> values) {
            addCriterion(as+".authorities_id not in", values, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".authorities_id between", value1, value2, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotBetween(String as,Integer value1, Integer value2) {
            addCriterion(as+".authorities_id not between", value1, value2, "authoritiesId");
            return (Criteria) this;
        }public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIsNull() {
            addCriterion("authorities_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIsNotNull() {
            addCriterion("authorities_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdEqualTo(Integer value) {
            addCriterion("authorities_id =", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotEqualTo(Integer value) {
            addCriterion("authorities_id <>", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdGreaterThan(Integer value) {
            addCriterion("authorities_id >", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("authorities_id >=", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdLessThan(Integer value) {
            addCriterion("authorities_id <", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdLessThanOrEqualTo(Integer value) {
            addCriterion("authorities_id <=", value, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdIn(List<Integer> values) {
            addCriterion("authorities_id in", values, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotIn(List<Integer> values) {
            addCriterion("authorities_id not in", values, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdBetween(Integer value1, Integer value2) {
            addCriterion("authorities_id between", value1, value2, "authoritiesId");
            return (Criteria) this;
        }

        public Criteria andAuthoritiesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("authorities_id not between", value1, value2, "authoritiesId");
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