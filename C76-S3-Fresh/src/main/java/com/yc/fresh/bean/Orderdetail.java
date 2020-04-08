package com.yc.fresh.bean;

public class Orderdetail {
    private Integer odid;

    private Integer oid;

    private Integer pid;

    private Integer pquintity;

    private Float odcost;

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPquintity() {
        return pquintity;
    }

    public void setPquintity(Integer pquintity) {
        this.pquintity = pquintity;
    }

    public Float getOdcost() {
        return odcost;
    }

    public void setOdcost(Float odcost) {
        this.odcost = odcost;
    }
}