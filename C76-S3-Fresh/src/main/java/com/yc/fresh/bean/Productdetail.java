package com.yc.fresh.bean;

public class Productdetail {
    private Integer pid;

    private Integer fid;

    private String pdetail;

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
}