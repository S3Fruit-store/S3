package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(Integer value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(Integer value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(Integer value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(Integer value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(Integer value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<Integer> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<Integer> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(Integer value1, Integer value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNull() {
            addCriterion("ophone is null");
            return (Criteria) this;
        }

        public Criteria andOphoneIsNotNull() {
            addCriterion("ophone is not null");
            return (Criteria) this;
        }

        public Criteria andOphoneEqualTo(String value) {
            addCriterion("ophone =", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotEqualTo(String value) {
            addCriterion("ophone <>", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThan(String value) {
            addCriterion("ophone >", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ophone >=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThan(String value) {
            addCriterion("ophone <", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLessThanOrEqualTo(String value) {
            addCriterion("ophone <=", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneLike(String value) {
            addCriterion("ophone like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotLike(String value) {
            addCriterion("ophone not like", value, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneIn(List<String> values) {
            addCriterion("ophone in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotIn(List<String> values) {
            addCriterion("ophone not in", values, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneBetween(String value1, String value2) {
            addCriterion("ophone between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOphoneNotBetween(String value1, String value2) {
            addCriterion("ophone not between", value1, value2, "ophone");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNull() {
            addCriterion("oaddress is null");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNotNull() {
            addCriterion("oaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOaddressEqualTo(String value) {
            addCriterion("oaddress =", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotEqualTo(String value) {
            addCriterion("oaddress <>", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThan(String value) {
            addCriterion("oaddress >", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThanOrEqualTo(String value) {
            addCriterion("oaddress >=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThan(String value) {
            addCriterion("oaddress <", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThanOrEqualTo(String value) {
            addCriterion("oaddress <=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLike(String value) {
            addCriterion("oaddress like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotLike(String value) {
            addCriterion("oaddress not like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressIn(List<String> values) {
            addCriterion("oaddress in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotIn(List<String> values) {
            addCriterion("oaddress not in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressBetween(String value1, String value2) {
            addCriterion("oaddress between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotBetween(String value1, String value2) {
            addCriterion("oaddress not between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOcostIsNull() {
            addCriterion("ocost is null");
            return (Criteria) this;
        }

        public Criteria andOcostIsNotNull() {
            addCriterion("ocost is not null");
            return (Criteria) this;
        }

        public Criteria andOcostEqualTo(Float value) {
            addCriterion("ocost =", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostNotEqualTo(Float value) {
            addCriterion("ocost <>", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostGreaterThan(Float value) {
            addCriterion("ocost >", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostGreaterThanOrEqualTo(Float value) {
            addCriterion("ocost >=", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostLessThan(Float value) {
            addCriterion("ocost <", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostLessThanOrEqualTo(Float value) {
            addCriterion("ocost <=", value, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostIn(List<Float> values) {
            addCriterion("ocost in", values, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostNotIn(List<Float> values) {
            addCriterion("ocost not in", values, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostBetween(Float value1, Float value2) {
            addCriterion("ocost between", value1, value2, "ocost");
            return (Criteria) this;
        }

        public Criteria andOcostNotBetween(Float value1, Float value2) {
            addCriterion("ocost not between", value1, value2, "ocost");
            return (Criteria) this;
        }

        public Criteria andOtypeIsNull() {
            addCriterion("otype is null");
            return (Criteria) this;
        }

        public Criteria andOtypeIsNotNull() {
            addCriterion("otype is not null");
            return (Criteria) this;
        }

        public Criteria andOtypeEqualTo(Integer value) {
            addCriterion("otype =", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotEqualTo(Integer value) {
            addCriterion("otype <>", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThan(Integer value) {
            addCriterion("otype >", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("otype >=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThan(Integer value) {
            addCriterion("otype <", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeLessThanOrEqualTo(Integer value) {
            addCriterion("otype <=", value, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeIn(List<Integer> values) {
            addCriterion("otype in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotIn(List<Integer> values) {
            addCriterion("otype not in", values, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeBetween(Integer value1, Integer value2) {
            addCriterion("otype between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andOtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("otype not between", value1, value2, "otype");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNull() {
            addCriterion("otime is null");
            return (Criteria) this;
        }

        public Criteria andOtimeIsNotNull() {
            addCriterion("otime is not null");
            return (Criteria) this;
        }

        public Criteria andOtimeEqualTo(Date value) {
            addCriterion("otime =", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotEqualTo(Date value) {
            addCriterion("otime <>", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThan(Date value) {
            addCriterion("otime >", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("otime >=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThan(Date value) {
            addCriterion("otime <", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeLessThanOrEqualTo(Date value) {
            addCriterion("otime <=", value, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeIn(List<Date> values) {
            addCriterion("otime in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotIn(List<Date> values) {
            addCriterion("otime not in", values, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeBetween(Date value1, Date value2) {
            addCriterion("otime between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOtimeNotBetween(Date value1, Date value2) {
            addCriterion("otime not between", value1, value2, "otime");
            return (Criteria) this;
        }

        public Criteria andOnoteIsNull() {
            addCriterion("onote is null");
            return (Criteria) this;
        }

        public Criteria andOnoteIsNotNull() {
            addCriterion("onote is not null");
            return (Criteria) this;
        }

        public Criteria andOnoteEqualTo(String value) {
            addCriterion("onote =", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteNotEqualTo(String value) {
            addCriterion("onote <>", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteGreaterThan(String value) {
            addCriterion("onote >", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteGreaterThanOrEqualTo(String value) {
            addCriterion("onote >=", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteLessThan(String value) {
            addCriterion("onote <", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteLessThanOrEqualTo(String value) {
            addCriterion("onote <=", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteLike(String value) {
            addCriterion("onote like", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteNotLike(String value) {
            addCriterion("onote not like", value, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteIn(List<String> values) {
            addCriterion("onote in", values, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteNotIn(List<String> values) {
            addCriterion("onote not in", values, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteBetween(String value1, String value2) {
            addCriterion("onote between", value1, value2, "onote");
            return (Criteria) this;
        }

        public Criteria andOnoteNotBetween(String value1, String value2) {
            addCriterion("onote not between", value1, value2, "onote");
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