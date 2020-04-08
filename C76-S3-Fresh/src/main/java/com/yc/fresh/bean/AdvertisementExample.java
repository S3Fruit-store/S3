package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdvertisementExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAfilenameIsNull() {
            addCriterion("afilename is null");
            return (Criteria) this;
        }

        public Criteria andAfilenameIsNotNull() {
            addCriterion("afilename is not null");
            return (Criteria) this;
        }

        public Criteria andAfilenameEqualTo(String value) {
            addCriterion("afilename =", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameNotEqualTo(String value) {
            addCriterion("afilename <>", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameGreaterThan(String value) {
            addCriterion("afilename >", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("afilename >=", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameLessThan(String value) {
            addCriterion("afilename <", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameLessThanOrEqualTo(String value) {
            addCriterion("afilename <=", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameLike(String value) {
            addCriterion("afilename like", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameNotLike(String value) {
            addCriterion("afilename not like", value, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameIn(List<String> values) {
            addCriterion("afilename in", values, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameNotIn(List<String> values) {
            addCriterion("afilename not in", values, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameBetween(String value1, String value2) {
            addCriterion("afilename between", value1, value2, "afilename");
            return (Criteria) this;
        }

        public Criteria andAfilenameNotBetween(String value1, String value2) {
            addCriterion("afilename not between", value1, value2, "afilename");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNull() {
            addCriterion("atime is null");
            return (Criteria) this;
        }

        public Criteria andAtimeIsNotNull() {
            addCriterion("atime is not null");
            return (Criteria) this;
        }

        public Criteria andAtimeEqualTo(Date value) {
            addCriterion("atime =", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotEqualTo(Date value) {
            addCriterion("atime <>", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThan(Date value) {
            addCriterion("atime >", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atime >=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThan(Date value) {
            addCriterion("atime <", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeLessThanOrEqualTo(Date value) {
            addCriterion("atime <=", value, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeIn(List<Date> values) {
            addCriterion("atime in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotIn(List<Date> values) {
            addCriterion("atime not in", values, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeBetween(Date value1, Date value2) {
            addCriterion("atime between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtimeNotBetween(Date value1, Date value2) {
            addCriterion("atime not between", value1, value2, "atime");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNull() {
            addCriterion("atype is null");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNotNull() {
            addCriterion("atype is not null");
            return (Criteria) this;
        }

        public Criteria andAtypeEqualTo(Integer value) {
            addCriterion("atype =", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotEqualTo(Integer value) {
            addCriterion("atype <>", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThan(Integer value) {
            addCriterion("atype >", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("atype >=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThan(Integer value) {
            addCriterion("atype <", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThanOrEqualTo(Integer value) {
            addCriterion("atype <=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeIn(List<Integer> values) {
            addCriterion("atype in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotIn(List<Integer> values) {
            addCriterion("atype not in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeBetween(Integer value1, Integer value2) {
            addCriterion("atype between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("atype not between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAtemp1IsNull() {
            addCriterion("atemp1 is null");
            return (Criteria) this;
        }

        public Criteria andAtemp1IsNotNull() {
            addCriterion("atemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andAtemp1EqualTo(String value) {
            addCriterion("atemp1 =", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1NotEqualTo(String value) {
            addCriterion("atemp1 <>", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1GreaterThan(String value) {
            addCriterion("atemp1 >", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("atemp1 >=", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1LessThan(String value) {
            addCriterion("atemp1 <", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1LessThanOrEqualTo(String value) {
            addCriterion("atemp1 <=", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1Like(String value) {
            addCriterion("atemp1 like", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1NotLike(String value) {
            addCriterion("atemp1 not like", value, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1In(List<String> values) {
            addCriterion("atemp1 in", values, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1NotIn(List<String> values) {
            addCriterion("atemp1 not in", values, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1Between(String value1, String value2) {
            addCriterion("atemp1 between", value1, value2, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp1NotBetween(String value1, String value2) {
            addCriterion("atemp1 not between", value1, value2, "atemp1");
            return (Criteria) this;
        }

        public Criteria andAtemp2IsNull() {
            addCriterion("atemp2 is null");
            return (Criteria) this;
        }

        public Criteria andAtemp2IsNotNull() {
            addCriterion("atemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andAtemp2EqualTo(String value) {
            addCriterion("atemp2 =", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2NotEqualTo(String value) {
            addCriterion("atemp2 <>", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2GreaterThan(String value) {
            addCriterion("atemp2 >", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("atemp2 >=", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2LessThan(String value) {
            addCriterion("atemp2 <", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2LessThanOrEqualTo(String value) {
            addCriterion("atemp2 <=", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2Like(String value) {
            addCriterion("atemp2 like", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2NotLike(String value) {
            addCriterion("atemp2 not like", value, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2In(List<String> values) {
            addCriterion("atemp2 in", values, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2NotIn(List<String> values) {
            addCriterion("atemp2 not in", values, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2Between(String value1, String value2) {
            addCriterion("atemp2 between", value1, value2, "atemp2");
            return (Criteria) this;
        }

        public Criteria andAtemp2NotBetween(String value1, String value2) {
            addCriterion("atemp2 not between", value1, value2, "atemp2");
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