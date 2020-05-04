package com.yc.fresh.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFparenttypeIsNull() {
            addCriterion("fparenttype is null");
            return (Criteria) this;
        }

        public Criteria andFparenttypeIsNotNull() {
            addCriterion("fparenttype is not null");
            return (Criteria) this;
        }

        public Criteria andFparenttypeEqualTo(String value) {
            addCriterion("fparenttype =", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeNotEqualTo(String value) {
            addCriterion("fparenttype <>", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeGreaterThan(String value) {
            addCriterion("fparenttype >", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("fparenttype >=", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeLessThan(String value) {
            addCriterion("fparenttype <", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeLessThanOrEqualTo(String value) {
            addCriterion("fparenttype <=", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeLike(String value) {
            addCriterion("fparenttype like", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeNotLike(String value) {
            addCriterion("fparenttype not like", value, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeIn(List<String> values) {
            addCriterion("fparenttype in", values, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeNotIn(List<String> values) {
            addCriterion("fparenttype not in", values, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeBetween(String value1, String value2) {
            addCriterion("fparenttype between", value1, value2, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFparenttypeNotBetween(String value1, String value2) {
            addCriterion("fparenttype not between", value1, value2, "fparenttype");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("ftype is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("ftype is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(Integer value) {
            addCriterion("ftype =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(Integer value) {
            addCriterion("ftype <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(Integer value) {
            addCriterion("ftype >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftype >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(Integer value) {
            addCriterion("ftype <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(Integer value) {
            addCriterion("ftype <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<Integer> values) {
            addCriterion("ftype in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<Integer> values) {
            addCriterion("ftype not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(Integer value1, Integer value2) {
            addCriterion("ftype between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ftype not between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNull() {
            addCriterion("faddress is null");
            return (Criteria) this;
        }

        public Criteria andFaddressIsNotNull() {
            addCriterion("faddress is not null");
            return (Criteria) this;
        }

        public Criteria andFaddressEqualTo(String value) {
            addCriterion("faddress =", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotEqualTo(String value) {
            addCriterion("faddress <>", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThan(String value) {
            addCriterion("faddress >", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressGreaterThanOrEqualTo(String value) {
            addCriterion("faddress >=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThan(String value) {
            addCriterion("faddress <", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLessThanOrEqualTo(String value) {
            addCriterion("faddress <=", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressLike(String value) {
            addCriterion("faddress like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotLike(String value) {
            addCriterion("faddress not like", value, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressIn(List<String> values) {
            addCriterion("faddress in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotIn(List<String> values) {
            addCriterion("faddress not in", values, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressBetween(String value1, String value2) {
            addCriterion("faddress between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFaddressNotBetween(String value1, String value2) {
            addCriterion("faddress not between", value1, value2, "faddress");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNull() {
            addCriterion("ftime is null");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNotNull() {
            addCriterion("ftime is not null");
            return (Criteria) this;
        }

        public Criteria andFtimeEqualTo(Date value) {
            addCriterion("ftime =", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotEqualTo(Date value) {
            addCriterion("ftime <>", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThan(Date value) {
            addCriterion("ftime >", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ftime >=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThan(Date value) {
            addCriterion("ftime <", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThanOrEqualTo(Date value) {
            addCriterion("ftime <=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeIn(List<Date> values) {
            addCriterion("ftime in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotIn(List<Date> values) {
            addCriterion("ftime not in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeBetween(Date value1, Date value2) {
            addCriterion("ftime between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotBetween(Date value1, Date value2) {
            addCriterion("ftime not between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeIsNull() {
            addCriterion("ffreshtime is null");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeIsNotNull() {
            addCriterion("ffreshtime is not null");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeEqualTo(String value) {
            addCriterion("ffreshtime =", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeNotEqualTo(String value) {
            addCriterion("ffreshtime <>", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeGreaterThan(String value) {
            addCriterion("ffreshtime >", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ffreshtime >=", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeLessThan(String value) {
            addCriterion("ffreshtime <", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeLessThanOrEqualTo(String value) {
            addCriterion("ffreshtime <=", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeLike(String value) {
            addCriterion("ffreshtime like", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeNotLike(String value) {
            addCriterion("ffreshtime not like", value, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeIn(List<String> values) {
            addCriterion("ffreshtime in", values, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeNotIn(List<String> values) {
            addCriterion("ffreshtime not in", values, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeBetween(String value1, String value2) {
            addCriterion("ffreshtime between", value1, value2, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFfreshtimeNotBetween(String value1, String value2) {
            addCriterion("ffreshtime not between", value1, value2, "ffreshtime");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNull() {
            addCriterion("fprice is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("fprice is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(Float value) {
            addCriterion("fprice =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(Float value) {
            addCriterion("fprice <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(Float value) {
            addCriterion("fprice >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("fprice >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(Float value) {
            addCriterion("fprice <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(Float value) {
            addCriterion("fprice <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<Float> values) {
            addCriterion("fprice in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<Float> values) {
            addCriterion("fprice not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(Float value1, Float value2) {
            addCriterion("fprice between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(Float value1, Float value2) {
            addCriterion("fprice not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFfilenameIsNull() {
            addCriterion("ffilename is null");
            return (Criteria) this;
        }

        public Criteria andFfilenameIsNotNull() {
            addCriterion("ffilename is not null");
            return (Criteria) this;
        }

        public Criteria andFfilenameEqualTo(String value) {
            addCriterion("ffilename =", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameNotEqualTo(String value) {
            addCriterion("ffilename <>", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameGreaterThan(String value) {
            addCriterion("ffilename >", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("ffilename >=", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameLessThan(String value) {
            addCriterion("ffilename <", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameLessThanOrEqualTo(String value) {
            addCriterion("ffilename <=", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameLike(String value) {
            addCriterion("ffilename like", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameNotLike(String value) {
            addCriterion("ffilename not like", value, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameIn(List<String> values) {
            addCriterion("ffilename in", values, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameNotIn(List<String> values) {
            addCriterion("ffilename not in", values, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameBetween(String value1, String value2) {
            addCriterion("ffilename between", value1, value2, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFfilenameNotBetween(String value1, String value2) {
            addCriterion("ffilename not between", value1, value2, "ffilename");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNull() {
            addCriterion("fnumber is null");
            return (Criteria) this;
        }

        public Criteria andFnumberIsNotNull() {
            addCriterion("fnumber is not null");
            return (Criteria) this;
        }

        public Criteria andFnumberEqualTo(Integer value) {
            addCriterion("fnumber =", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotEqualTo(Integer value) {
            addCriterion("fnumber <>", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThan(Integer value) {
            addCriterion("fnumber >", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fnumber >=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThan(Integer value) {
            addCriterion("fnumber <", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberLessThanOrEqualTo(Integer value) {
            addCriterion("fnumber <=", value, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberIn(List<Integer> values) {
            addCriterion("fnumber in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotIn(List<Integer> values) {
            addCriterion("fnumber not in", values, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberBetween(Integer value1, Integer value2) {
            addCriterion("fnumber between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("fnumber not between", value1, value2, "fnumber");
            return (Criteria) this;
        }

        public Criteria andFtemp1IsNull() {
            addCriterion("ftemp1 is null");
            return (Criteria) this;
        }

        public Criteria andFtemp1IsNotNull() {
            addCriterion("ftemp1 is not null");
            return (Criteria) this;
        }

        public Criteria andFtemp1EqualTo(String value) {
            addCriterion("ftemp1 =", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1NotEqualTo(String value) {
            addCriterion("ftemp1 <>", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1GreaterThan(String value) {
            addCriterion("ftemp1 >", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1GreaterThanOrEqualTo(String value) {
            addCriterion("ftemp1 >=", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1LessThan(String value) {
            addCriterion("ftemp1 <", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1LessThanOrEqualTo(String value) {
            addCriterion("ftemp1 <=", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1Like(String value) {
            addCriterion("ftemp1 like", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1NotLike(String value) {
            addCriterion("ftemp1 not like", value, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1In(List<String> values) {
            addCriterion("ftemp1 in", values, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1NotIn(List<String> values) {
            addCriterion("ftemp1 not in", values, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1Between(String value1, String value2) {
            addCriterion("ftemp1 between", value1, value2, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp1NotBetween(String value1, String value2) {
            addCriterion("ftemp1 not between", value1, value2, "ftemp1");
            return (Criteria) this;
        }

        public Criteria andFtemp2IsNull() {
            addCriterion("ftemp2 is null");
            return (Criteria) this;
        }

        public Criteria andFtemp2IsNotNull() {
            addCriterion("ftemp2 is not null");
            return (Criteria) this;
        }

        public Criteria andFtemp2EqualTo(String value) {
            addCriterion("ftemp2 =", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2NotEqualTo(String value) {
            addCriterion("ftemp2 <>", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2GreaterThan(String value) {
            addCriterion("ftemp2 >", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2GreaterThanOrEqualTo(String value) {
            addCriterion("ftemp2 >=", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2LessThan(String value) {
            addCriterion("ftemp2 <", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2LessThanOrEqualTo(String value) {
            addCriterion("ftemp2 <=", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2Like(String value) {
            addCriterion("ftemp2 like", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2NotLike(String value) {
            addCriterion("ftemp2 not like", value, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2In(List<String> values) {
            addCriterion("ftemp2 in", values, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2NotIn(List<String> values) {
            addCriterion("ftemp2 not in", values, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2Between(String value1, String value2) {
            addCriterion("ftemp2 between", value1, value2, "ftemp2");
            return (Criteria) this;
        }

        public Criteria andFtemp2NotBetween(String value1, String value2) {
            addCriterion("ftemp2 not between", value1, value2, "ftemp2");
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