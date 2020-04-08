package com.yc.fresh.bean;

public class Producttype {
    private Integer tid;

    private String tname;

    private Integer tstate;

    private String ttemp1;

    private String ttemp2;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Integer getTstate() {
        return tstate;
    }

    public void setTstate(Integer tstate) {
        this.tstate = tstate;
    }

    public String getTtemp1() {
        return ttemp1;
    }

    public void setTtemp1(String ttemp1) {
        this.ttemp1 = ttemp1 == null ? null : ttemp1.trim();
    }

    public String getTtemp2() {
        return ttemp2;
    }

    public void setTtemp2(String ttemp2) {
        this.ttemp2 = ttemp2 == null ? null : ttemp2.trim();
    }
}