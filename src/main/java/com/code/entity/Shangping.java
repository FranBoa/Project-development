package com.code.entity;

import java.io.Serializable;

/**
 * (Shangping)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class Shangping implements Serializable {
    private static final long serialVersionUID = 472083609701513908L;
    /**
    * 商品编号，主键
    */
    private int spid;
    /**
    * 商品单价
    */
    private Object spdanjia;
    /**
    * 商品名称
    */
    private String spname;
    /**
    * 商品数量
    */
    private Integer spshul;

    public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public Object getSpdanjia() {
        return spdanjia;
    }

    public void setSpdanjia(Object spdanjia) {
        this.spdanjia = spdanjia;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Integer getSpshul() {
        return spshul;
    }

    public void setSpshul(Integer spshul) {
        this.spshul = spshul;
    }

	@Override
	public String toString() {
		return "Shangping [spid=" + spid + ", spdanjia=" + spdanjia + ", spname=" + spname + ", spshul=" + spshul + "]";
	}
    
    
}