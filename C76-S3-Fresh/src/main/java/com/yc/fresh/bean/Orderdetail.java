package com.yc.fresh.bean;

public class Orderdetail {
    private Integer odid;

    private Integer oid;

    private Integer fid;

    private Integer pquintity;

    private Float odcost;

    private String otemp1;

    private String otemp2;

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

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public String getOtemp1() {
        return otemp1;
    }

    public void setOtemp1(String otemp1) {
        this.otemp1 = otemp1 == null ? null : otemp1.trim();
    }

    public String getOtemp2() {
        return otemp2;
    }

    public void setOtemp2(String otemp2) {
        this.otemp2 = otemp2 == null ? null : otemp2.trim();
    }
}