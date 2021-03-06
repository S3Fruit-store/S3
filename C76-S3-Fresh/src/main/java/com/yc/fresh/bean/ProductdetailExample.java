package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductdetailExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNull() {
            addCriterion("pdetail is null");
            return (Criteria) this;
        }

        public Criteria andPdetailIsNotNull() {
            addCriterion("pdetail is not null");
            return (Criteria) this;
        }

        public Criteria andPdetailEqualTo(String value) {
            addCriterion("pdetail =", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotEqualTo(String value) {
            addCriterion("pdetail <>", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThan(String value) {
            addCriterion("pdetail >", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailGreaterThanOrEqualTo(String value) {
            addCriterion("pdetail >=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThan(String value) {
            addCriterion("pdetail <", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLessThanOrEqualTo(String value) {
            addCriterion("pdetail <=", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailLike(String value) {
            addCriterion("pdetail like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotLike(String value) {
            addCriterion("pdetail not like", value, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailIn(List<String> values) {
            addCriterion("pdetail in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotIn(List<String> values) {
            addCriterion("pdetail not in", values, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailBetween(String value1, String value2) {
            addCriterion("pdetail between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPdetailNotBetween(String value1, String value2) {
            addCriterion("pdetail not between", value1, value2, "pdetail");
            return (Criteria) this;
        }

        public Criteria andPtemp1IsNull() {
            addCriterion("ptemp1 is null");
            return (Criteria) this;
        }

        public Criteria andPtemp1IsNotNull() {
            addCriterion("ptemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andPtemp1EqualTo(String value) {
            addCriterion("ptemp1 =", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1NotEqualTo(String value) {
            addCriterion("ptemp1 <>", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1GreaterThan(String value) {
            addCriterion("ptemp1 >", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("ptemp1 >=", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1LessThan(String value) {
            addCriterion("ptemp1 <", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1LessThanOrEqualTo(String value) {
            addCriterion("ptemp1 <=", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1Like(String value) {
            addCriterion("ptemp1 like", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1NotLike(String value) {
            addCriterion("ptemp1 not like", value, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1In(List<String> values) {
            addCriterion("ptemp1 in", values, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1NotIn(List<String> values) {
            addCriterion("ptemp1 not in", values, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1Between(String value1, String value2) {
            addCriterion("ptemp1 between", value1, value2, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp1NotBetween(String value1, String value2) {
            addCriterion("ptemp1 not between", value1, value2, "ptemp1");
            return (Criteria) this;
        }

        public Criteria andPtemp2IsNull() {
            addCriterion("ptemp2 is null");
            return (Criteria) this;
        }

        public Criteria andPtemp2IsNotNull() {
            addCriterion("ptemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andPtemp2EqualTo(String value) {
            addCriterion("ptemp2 =", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2NotEqualTo(String value) {
            addCriterion("ptemp2 <>", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2GreaterThan(String value) {
            addCriterion("ptemp2 >", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("ptemp2 >=", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2LessThan(String value) {
            addCriterion("ptemp2 <", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2LessThanOrEqualTo(String value) {
            addCriterion("ptemp2 <=", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2Like(String value) {
            addCriterion("ptemp2 like", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2NotLike(String value) {
            addCriterion("ptemp2 not like", value, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2In(List<String> values) {
            addCriterion("ptemp2 in", values, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2NotIn(List<String> values) {
            addCriterion("ptemp2 not in", values, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2Between(String value1, String value2) {
            addCriterion("ptemp2 between", value1, value2, "ptemp2");
            return (Criteria) this;
        }

        public Criteria andPtemp2NotBetween(String value1, String value2) {
            addCriterion("ptemp2 not between", value1, value2, "ptemp2");
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