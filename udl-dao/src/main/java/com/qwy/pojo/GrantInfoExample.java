package com.qwy.pojo;

import java.util.ArrayList;
import java.util.List;

public class GrantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrantInfoExample() {
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

        public Criteria andIdIsNull() {
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

        public Criteria andGranterIsNull() {
            addCriterion("granter is null");
            return (Criteria) this;
        }

        public Criteria andGranterIsNotNull() {
            addCriterion("granter is not null");
            return (Criteria) this;
        }

        public Criteria andGranterEqualTo(Integer value) {
            addCriterion("granter =", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterNotEqualTo(Integer value) {
            addCriterion("granter <>", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterGreaterThan(Integer value) {
            addCriterion("granter >", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterGreaterThanOrEqualTo(Integer value) {
            addCriterion("granter >=", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterLessThan(Integer value) {
            addCriterion("granter <", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterLessThanOrEqualTo(Integer value) {
            addCriterion("granter <=", value, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterIn(List<Integer> values) {
            addCriterion("granter in", values, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterNotIn(List<Integer> values) {
            addCriterion("granter not in", values, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterBetween(Integer value1, Integer value2) {
            addCriterion("granter between", value1, value2, "granter");
            return (Criteria) this;
        }

        public Criteria andGranterNotBetween(Integer value1, Integer value2) {
            addCriterion("granter not between", value1, value2, "granter");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andRootIsNull() {
            addCriterion("root is null");
            return (Criteria) this;
        }

        public Criteria andRootIsNotNull() {
            addCriterion("root is not null");
            return (Criteria) this;
        }

        public Criteria andRootEqualTo(Integer value) {
            addCriterion("root =", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotEqualTo(Integer value) {
            addCriterion("root <>", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThan(Integer value) {
            addCriterion("root >", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootGreaterThanOrEqualTo(Integer value) {
            addCriterion("root >=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThan(Integer value) {
            addCriterion("root <", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootLessThanOrEqualTo(Integer value) {
            addCriterion("root <=", value, "root");
            return (Criteria) this;
        }

        public Criteria andRootIn(List<Integer> values) {
            addCriterion("root in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotIn(List<Integer> values) {
            addCriterion("root not in", values, "root");
            return (Criteria) this;
        }

        public Criteria andRootBetween(Integer value1, Integer value2) {
            addCriterion("root between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andRootNotBetween(Integer value1, Integer value2) {
            addCriterion("root not between", value1, value2, "root");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Byte value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Byte value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Byte value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Byte value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Byte value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Byte value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Byte> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Byte> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Byte value1, Byte value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Byte value1, Byte value2) {
            addCriterion("used not between", value1, value2, "used");
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