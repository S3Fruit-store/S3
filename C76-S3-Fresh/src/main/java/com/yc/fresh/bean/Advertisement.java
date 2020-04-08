package com.yc.fresh.bean;

import java.util.Date;

public class Advertisement {
    private Integer aid;

    private String afilename;

    private Date atime;

    private Integer atype;

    private String atemp1;

    private String atemp2;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAfilename() {
        return afilename;
    }

    public void setAfilename(String afilename) {
        this.afilename = afilename == null ? null : afilename.trim();
    }

    public Date getAtime() {
        return atime;
    }

    public void setAtime(Date atime) {
        this.atime = atime;
    }

    public Integer getAtype() {
        return atype;
    }

    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    public String getAtemp1() {
        return atemp1;
    }

    public void setAtemp1(String atemp1) {
        this.atemp1 = atemp1 == null ? null : atemp1.trim();
    }

    public String getAtemp2() {
        return atemp2;
    }

    public void setAtemp2(String atemp2) {
        this.atemp2 = atemp2 == null ? null : atemp2.trim();
    }
}