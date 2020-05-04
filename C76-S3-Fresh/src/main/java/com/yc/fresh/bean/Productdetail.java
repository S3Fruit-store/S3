package com.yc.fresh.bean;

public class Productdetail {
    private Integer pid;

    private Integer fid;

    private String pdetail;

    private String ptemp1;

    private String ptemp2;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getPdetail() {
        return pdetail;
    }

    public void setPdetail(String pdetail) {
        this.pdetail = pdetail == null ? null : pdetail.trim();
    }

    public String getPtemp1() {
        return ptemp1;
    }

    public void setPtemp1(String ptemp1) {
        this.ptemp1 = ptemp1 == null ? null : ptemp1.trim();
    }

    public String getPtemp2() {
        return ptemp2;
    }

    public void setPtemp2(String ptemp2) {
        this.ptemp2 = ptemp2 == null ? null : ptemp2.trim();
    }
}