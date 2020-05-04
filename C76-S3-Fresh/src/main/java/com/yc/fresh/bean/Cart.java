package com.yc.fresh.bean;

import java.util.Date;

public class Cart {
    private Integer cid;

    private Integer uid;

    private Integer fid;

    private Integer ccount;

    private Date ctime;

    private String ctemp1;

    private String ctemp2;
    
    private Product product;
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

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

    public String getCtemp1() {
        return ctemp1;
    }

    public void setCtemp1(String ctemp1) {
        this.ctemp1 = ctemp1 == null ? null : ctemp1.trim();
    }

    public String getCtemp2() {
        return ctemp2;
    }

    public void setCtemp2(String ctemp2) {
        this.ctemp2 = ctemp2 == null ? null : ctemp2.trim();
    }
}