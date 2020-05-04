package com.yc.fresh.bean;

public class Express {
    private Integer eid;

    private String ename;

    private String efilename;

    private String edetail;

    private String etemp1;

    private String etemp2;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEfilename() {
        return efilename;
    }

    public void setEfilename(String efilename) {
        this.efilename = efilename == null ? null : efilename.trim();
    }

    public String getEdetail() {
        return edetail;
    }

    public void setEdetail(String edetail) {
        this.edetail = edetail == null ? null : edetail.trim();
    }

    public String getEtemp1() {
        return etemp1;
    }

    public void setEtemp1(String etemp1) {
        this.etemp1 = etemp1 == null ? null : etemp1.trim();
    }

    public String getEtemp2() {
        return etemp2;
    }

    public void setEtemp2(String etemp2) {
        this.etemp2 = etemp2 == null ? null : etemp2.trim();
    }
}