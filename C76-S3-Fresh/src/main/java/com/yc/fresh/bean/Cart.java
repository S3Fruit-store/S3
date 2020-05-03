package com.yc.fresh.bean;

import java.util.Date;

public class Cart {
    private Integer cid;

    private Integer uid;

    private Integer fid;

    private Integer ccount;

    private Date ctime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getCcount() {
        return ccount;
    }

    public void setCcount(Integer ccount) {
        this.ccount = ccount;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}