package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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

        public Criteria andOdidIsNull() {
            addCriterion("odid is null");
            return (Criteria) this;
        }

        public Criteria andOdidIsNotNull() {
            addCriterion("odid is not null");
            return (Criteria) this;
        }

        public Criteria andOdidEqualTo(Integer value) {
            addCriterion("odid =", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotEqualTo(Integer value) {
            addCriterion("odid <>", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThan(Integer value) {
            addCriterion("odid >", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("odid >=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThan(Integer value) {
            addCriterion("odid <", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidLessThanOrEqualTo(Integer value) {
            addCriterion("odid <=", value, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidIn(List<Integer> values) {
            addCriterion("odid in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotIn(List<Integer> values) {
            addCriterion("odid not in", values, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidBetween(Integer value1, Integer value2) {
            addCriterion("odid between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOdidNotBetween(Integer value1, Integer value2) {
            addCriterion("odid not between", value1, value2, "odid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
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

        public Criteria andPquintityIsNull() {
            addCriterion("pquintity is null");
            return (Criteria) this;
        }

        public Criteria andPquintityIsNotNull() {
            addCriterion("pquintity is not null");
            return (Criteria) this;
        }

        public Criteria andPquintityEqualTo(Integer value) {
            addCriterion("pquintity =", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityNotEqualTo(Integer value) {
            addCriterion("pquintity <>", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityGreaterThan(Integer value) {
            addCriterion("pquintity >", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityGreaterThanOrEqualTo(Integer value) {
            addCriterion("pquintity >=", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityLessThan(Integer value) {
            addCriterion("pquintity <", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityLessThanOrEqualTo(Integer value) {
            addCriterion("pquintity <=", value, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityIn(List<Integer> values) {
            addCriterion("pquintity in", values, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityNotIn(List<Integer> values) {
            addCriterion("pquintity not in", values, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityBetween(Integer value1, Integer value2) {
            addCriterion("pquintity between", value1, value2, "pquintity");
            return (Criteria) this;
        }

        public Criteria andPquintityNotBetween(Integer value1, Integer value2) {
            addCriterion("pquintity not between", value1, value2, "pquintity");
            return (Criteria) this;
        }

        public Criteria andOdcostIsNull() {
            addCriterion("odcost is null");
            return (Criteria) this;
        }

        public Criteria andOdcostIsNotNull() {
            addCriterion("odcost is not null");
            return (Criteria) this;
        }

        public Criteria andOdcostEqualTo(Float value) {
            addCriterion("odcost =", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostNotEqualTo(Float value) {
            addCriterion("odcost <>", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostGreaterThan(Float value) {
            addCriterion("odcost >", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostGreaterThanOrEqualTo(Float value) {
            addCriterion("odcost >=", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostLessThan(Float value) {
            addCriterion("odcost <", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostLessThanOrEqualTo(Float value) {
            addCriterion("odcost <=", value, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostIn(List<Float> values) {
            addCriterion("odcost in", values, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostNotIn(List<Float> values) {
            addCriterion("odcost not in", values, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostBetween(Float value1, Float value2) {
            addCriterion("odcost between", value1, value2, "odcost");
            return (Criteria) this;
        }

        public Criteria andOdcostNotBetween(Float value1, Float value2) {
            addCriterion("odcost not between", value1, value2, "odcost");
            return (Criteria) this;
        }

        public Criteria andOtemp1IsNull() {
            addCriterion("otemp1 is null");
            return (Criteria) this;
        }

        public Criteria andOtemp1IsNotNull() {
            addCriterion("otemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andOtemp1EqualTo(String value) {
            addCriterion("otemp1 =", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1NotEqualTo(String value) {
            addCriterion("otemp1 <>", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1GreaterThan(String value) {
            addCriterion("otemp1 >", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("otemp1 >=", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1LessThan(String value) {
            addCriterion("otemp1 <", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1LessThanOrEqualTo(String value) {
            addCriterion("otemp1 <=", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1Like(String value) {
            addCriterion("otemp1 like", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1NotLike(String value) {
            addCriterion("otemp1 not like", value, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1In(List<String> values) {
            addCriterion("otemp1 in", values, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1NotIn(List<String> values) {
            addCriterion("otemp1 not in", values, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1Between(String value1, String value2) {
            addCriterion("otemp1 between", value1, value2, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp1NotBetween(String value1, String value2) {
            addCriterion("otemp1 not between", value1, value2, "otemp1");
            return (Criteria) this;
        }

        public Criteria andOtemp2IsNull() {
            addCriterion("otemp2 is null");
            return (Criteria) this;
        }

        public Criteria andOtemp2IsNotNull() {
            addCriterion("otemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andOtemp2EqualTo(String value) {
            addCriterion("otemp2 =", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2NotEqualTo(String value) {
            addCriterion("otemp2 <>", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2GreaterThan(String value) {
            addCriterion("otemp2 >", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("otemp2 >=", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2LessThan(String value) {
            addCriterion("otemp2 <", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2LessThanOrEqualTo(String value) {
            addCriterion("otemp2 <=", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2Like(String value) {
            addCriterion("otemp2 like", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2NotLike(String value) {
            addCriterion("otemp2 not like", value, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2In(List<String> values) {
            addCriterion("otemp2 in", values, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2NotIn(List<String> values) {
            addCriterion("otemp2 not in", values, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2Between(String value1, String value2) {
            addCriterion("otemp2 between", value1, value2, "otemp2");
            return (Criteria) this;
        }

        public Criteria andOtemp2NotBetween(String value1, String value2) {
            addCriterion("otemp2 not between", value1, value2, "otemp2");
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