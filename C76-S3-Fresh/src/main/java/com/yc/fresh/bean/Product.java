package com.yc.fresh.bean;

import java.util.Date;

public class Product {
    private Integer fid;

    private String fname;

    private String fparenttype;

    private String ftype;

    private String faddress;

    private Date ftime;

    private String ffreshtime;

    private Float fprice;

    private String ffilename;

    private Integer fnumber;

    private String ftemp1;

    private String ftemp2;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFparenttype() {
        return fparenttype;
    }

    public void setFparenttype(String fparenttype) {
        this.fparenttype = fparenttype == null ? null : fparenttype.trim();
    }

    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype == null ? null : ftype.trim();
    }

    public String getFaddress() {
        return faddress;
    }

    public void setFaddress(String faddress) {
        this.faddress = faddress == null ? null : faddress.trim();
    }

    public Date getFtime() {
        return ftime;
    }

    public void setFtime(Date ftime) {
        this.ftime = ftime;
    }

    public String getFfreshtime() {
        return ffreshtime;
    }

    public void setFfreshtime(String ffreshtime) {
        this.ffreshtime = ffreshtime == null ? null : ffreshtime.trim();
    }

    public Float getFprice() {
        return fprice;
    }

    public void setFprice(Float fprice) {
        this.fprice = fprice;
    }

    public String getFfilename() {
        return ffilename;
    }

    public void setFfilename(String ffilename) {
        this.ffilename = ffilename == null ? null : ffilename.trim();
    }

    public Integer getFnumber() {
        return fnumber;
    }

    public void setFnumber(Integer fnumber) {
        this.fnumber = fnumber;
    }

    public String getFtemp1() {
        return ftemp1;
    }

    public void setFtemp1(String ftemp1) {
        this.ftemp1 = ftemp1 == null ? null : ftemp1.trim();
    }

    public String getFtemp2() {
        return ftemp2;
    }

    public void setFtemp2(String ftemp2) {
        this.ftemp2 = ftemp2 == null ? null : ftemp2.trim();
    }
}