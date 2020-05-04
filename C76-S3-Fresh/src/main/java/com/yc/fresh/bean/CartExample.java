package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andCcountIsNull() {
            addCriterion("ccount is null");
            return (Criteria) this;
        }

        public Criteria andCcountIsNotNull() {
            addCriterion("ccount is not null");
            return (Criteria) this;
        }

        public Criteria andCcountEqualTo(Integer value) {
            addCriterion("ccount =", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotEqualTo(Integer value) {
            addCriterion("ccount <>", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThan(Integer value) {
            addCriterion("ccount >", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccount >=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThan(Integer value) {
            addCriterion("ccount <", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThanOrEqualTo(Integer value) {
            addCriterion("ccount <=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountIn(List<Integer> values) {
            addCriterion("ccount in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotIn(List<Integer> values) {
            addCriterion("ccount not in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountBetween(Integer value1, Integer value2) {
            addCriterion("ccount between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ccount not between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtemp1IsNull() {
            addCriterion("ctemp1 is null");
            return (Criteria) this;
        }

        public Criteria andCtemp1IsNotNull() {
            addCriterion("ctemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andCtemp1EqualTo(String value) {
            addCriterion("ctemp1 =", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1NotEqualTo(String value) {
            addCriterion("ctemp1 <>", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1GreaterThan(String value) {
            addCriterion("ctemp1 >", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("ctemp1 >=", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1LessThan(String value) {
            addCriterion("ctemp1 <", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1LessThanOrEqualTo(String value) {
            addCriterion("ctemp1 <=", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1Like(String value) {
            addCriterion("ctemp1 like", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1NotLike(String value) {
            addCriterion("ctemp1 not like", value, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1In(List<String> values) {
            addCriterion("ctemp1 in", values, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1NotIn(List<String> values) {
            addCriterion("ctemp1 not in", values, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1Between(String value1, String value2) {
            addCriterion("ctemp1 between", value1, value2, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp1NotBetween(String value1, String value2) {
            addCriterion("ctemp1 not between", value1, value2, "ctemp1");
            return (Criteria) this;
        }

        public Criteria andCtemp2IsNull() {
            addCriterion("ctemp2 is null");
            return (Criteria) this;
        }

        public Criteria andCtemp2IsNotNull() {
            addCriterion("ctemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andCtemp2EqualTo(String value) {
            addCriterion("ctemp2 =", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2NotEqualTo(String value) {
            addCriterion("ctemp2 <>", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2GreaterThan(String value) {
            addCriterion("ctemp2 >", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("ctemp2 >=", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2LessThan(String value) {
            addCriterion("ctemp2 <", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2LessThanOrEqualTo(String value) {
            addCriterion("ctemp2 <=", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2Like(String value) {
            addCriterion("ctemp2 like", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2NotLike(String value) {
            addCriterion("ctemp2 not like", value, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2In(List<String> values) {
            addCriterion("ctemp2 in", values, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2NotIn(List<String> values) {
            addCriterion("ctemp2 not in", values, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2Between(String value1, String value2) {
            addCriterion("ctemp2 between", value1, value2, "ctemp2");
            return (Criteria) this;
        }

        public Criteria andCtemp2NotBetween(String value1, String value2) {
            addCriterion("ctemp2 not between", value1, value2, "ctemp2");
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