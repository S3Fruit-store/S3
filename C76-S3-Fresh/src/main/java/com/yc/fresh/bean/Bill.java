package com.yc.fresh.bean;

import java.util.Date;

public class Bill {
    private Integer oid;

    private Integer uid;

    private String onumber;

    private String oname;

    private String ophone;

    private String oaddress;

    private Float ocost;

    private Integer otype;

    private Date otime;

    private String onote;

    private Integer eid;

    private String otemp1;

    private String eid;
    
    private Express express;

    public Express getExpress() {
		return express;
	}

	public void setExpress(Express express) {
		this.express = express;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress == null ? null : oaddress.trim();
    }

    public Float getOcost() {
        return ocost;
    }

    public void setOcost(Float ocost) {
        this.ocost = ocost;
    }

    public Integer getOtype() {
        return otype;
    }

    public void setOtype(Integer otype) {
        this.otype = otype;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getOnote() {
        return onote;
    }

    public void setOnote(String onote) {
        this.onote = onote == null ? null : onote.trim();
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getOtemp1() {
        return otemp1;
    }

    public void setOtemp1(String otemp1) {
        this.otemp1 = otemp1 == null ? null : otemp1.trim();
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }
}