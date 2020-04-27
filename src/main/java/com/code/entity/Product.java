package com.code.entity;

import java.io.Serializable;

/**
 * (Product)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -26920630454486775L;
    /**
    * 商品id
    */
    private Integer pid;
    /**
    * 商品名称
    */
    private String pname;
    /**
    * 商品类别
    */
    private Integer ptype;
    /**
    * 商品进价
    */
    private Double pbprice;
    /**
    * 商品售价
    */
	private Double psprice;
    /**
    * 商品存储仓库
    */
    private Integer warehouse;
    /**
    * 库存数量
    */
    private Integer warenum;
    /**
    * 详细说明
    */
    private String details;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Double getPbprice() {
        return pbprice;
    }

    public void setPbprice(Double pbprice) {
        this.pbprice = pbprice;
    }

    public Double getPsprice() {
        return psprice;
    }

    public void setPsprice(Double psprice) {
        this.psprice = psprice;
    }

    public Integer getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Integer warehouse) {
        this.warehouse = warehouse;
    }

    public Integer getWarenum() {
        return warenum;
    }

    public void setWarenum(Integer warenum) {
        this.warenum = warenum;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}