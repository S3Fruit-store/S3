package com.yc.fresh.bean;

public class Express {
    private Integer eid;

    private String ename;

    private String efilename;

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
}