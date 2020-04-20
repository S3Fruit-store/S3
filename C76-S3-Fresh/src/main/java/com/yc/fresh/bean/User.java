package com.yc.fresh.bean;

public class User {
    private Integer uid;

    private String uaccount;

    private String uname;

    private String upwd;

    private String usex;

    private String uphone;

    private String uemail;

    private String ufilename;

    private Integer utype;

    private Integer ustatus;

    private String utemp1;

    private String utemp2;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUaccount() {
        return uaccount;
    }

    public void setUaccount(String uaccount) {
        this.uaccount = uaccount == null ? null : uaccount.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd == null ? null : upwd.trim();
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex == null ? null : usex.trim();
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone == null ? null : uphone.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public String getUfilename() {
        return ufilename;
    }

    public void setUfilename(String ufilename) {
        this.ufilename = ufilename == null ? null : ufilename.trim();
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    public String getUtemp1() {
        return utemp1;
    }

    public void setUtemp1(String utemp1) {
        this.utemp1 = utemp1 == null ? null : utemp1.trim();
    }

    public String getUtemp2() {
        return utemp2;
    }

    public void setUtemp2(String utemp2) {
        this.utemp2 = utemp2 == null ? null : utemp2.trim();
    }
}