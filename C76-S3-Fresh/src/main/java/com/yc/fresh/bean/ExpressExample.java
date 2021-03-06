package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.List;

public class ExpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpressExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEfilenameIsNull() {
            addCriterion("efilename is null");
            return (Criteria) this;
        }

        public Criteria andEfilenameIsNotNull() {
            addCriterion("efilename is not null");
            return (Criteria) this;
        }

        public Criteria andEfilenameEqualTo(String value) {
            addCriterion("efilename =", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameNotEqualTo(String value) {
            addCriterion("efilename <>", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameGreaterThan(String value) {
            addCriterion("efilename >", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("efilename >=", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameLessThan(String value) {
            addCriterion("efilename <", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameLessThanOrEqualTo(String value) {
            addCriterion("efilename <=", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameLike(String value) {
            addCriterion("efilename like", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameNotLike(String value) {
            addCriterion("efilename not like", value, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameIn(List<String> values) {
            addCriterion("efilename in", values, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameNotIn(List<String> values) {
            addCriterion("efilename not in", values, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameBetween(String value1, String value2) {
            addCriterion("efilename between", value1, value2, "efilename");
            return (Criteria) this;
        }

        public Criteria andEfilenameNotBetween(String value1, String value2) {
            addCriterion("efilename not between", value1, value2, "efilename");
            return (Criteria) this;
        }

        public Criteria andEdetailIsNull() {
            addCriterion("edetail is null");
            return (Criteria) this;
        }

        public Criteria andEdetailIsNotNull() {
            addCriterion("edetail is not null");
            return (Criteria) this;
        }

        public Criteria andEdetailEqualTo(String value) {
            addCriterion("edetail =", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailNotEqualTo(String value) {
            addCriterion("edetail <>", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailGreaterThan(String value) {
            addCriterion("edetail >", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailGreaterThanOrEqualTo(String value) {
            addCriterion("edetail >=", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailLessThan(String value) {
            addCriterion("edetail <", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailLessThanOrEqualTo(String value) {
            addCriterion("edetail <=", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailLike(String value) {
            addCriterion("edetail like", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailNotLike(String value) {
            addCriterion("edetail not like", value, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailIn(List<String> values) {
            addCriterion("edetail in", values, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailNotIn(List<String> values) {
            addCriterion("edetail not in", values, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailBetween(String value1, String value2) {
            addCriterion("edetail between", value1, value2, "edetail");
            return (Criteria) this;
        }

        public Criteria andEdetailNotBetween(String value1, String value2) {
            addCriterion("edetail not between", value1, value2, "edetail");
            return (Criteria) this;
        }

        public Criteria andEtemp1IsNull() {
            addCriterion("etemp1 is null");
            return (Criteria) this;
        }

        public Criteria andEtemp1IsNotNull() {
            addCriterion("etemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andEtemp1EqualTo(String value) {
            addCriterion("etemp1 =", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1NotEqualTo(String value) {
            addCriterion("etemp1 <>", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1GreaterThan(String value) {
            addCriterion("etemp1 >", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("etemp1 >=", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1LessThan(String value) {
            addCriterion("etemp1 <", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1LessThanOrEqualTo(String value) {
            addCriterion("etemp1 <=", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1Like(String value) {
            addCriterion("etemp1 like", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1NotLike(String value) {
            addCriterion("etemp1 not like", value, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1In(List<String> values) {
            addCriterion("etemp1 in", values, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1NotIn(List<String> values) {
            addCriterion("etemp1 not in", values, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1Between(String value1, String value2) {
            addCriterion("etemp1 between", value1, value2, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp1NotBetween(String value1, String value2) {
            addCriterion("etemp1 not between", value1, value2, "etemp1");
            return (Criteria) this;
        }

        public Criteria andEtemp2IsNull() {
            addCriterion("etemp2 is null");
            return (Criteria) this;
        }

        public Criteria andEtemp2IsNotNull() {
            addCriterion("etemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andEtemp2EqualTo(String value) {
            addCriterion("etemp2 =", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2NotEqualTo(String value) {
            addCriterion("etemp2 <>", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2GreaterThan(String value) {
            addCriterion("etemp2 >", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("etemp2 >=", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2LessThan(String value) {
            addCriterion("etemp2 <", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2LessThanOrEqualTo(String value) {
            addCriterion("etemp2 <=", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2Like(String value) {
            addCriterion("etemp2 like", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2NotLike(String value) {
            addCriterion("etemp2 not like", value, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2In(List<String> values) {
            addCriterion("etemp2 in", values, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2NotIn(List<String> values) {
            addCriterion("etemp2 not in", values, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2Between(String value1, String value2) {
            addCriterion("etemp2 between", value1, value2, "etemp2");
            return (Criteria) this;
        }

        public Criteria andEtemp2NotBetween(String value1, String value2) {
            addCriterion("etemp2 not between", value1, value2, "etemp2");
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