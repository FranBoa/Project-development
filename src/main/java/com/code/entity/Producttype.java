package com.code.entity;

import java.io.Serializable;

/**
 * (Producttype)实体类
 *
 * @author yap
 * @since 2020-04-29 16:11:31
 */
public class Producttype implements Serializable {
    private static final long serialVersionUID = 272947543536846656L;
    /**
    * 商品类别id
    */
    private Integer producttypeid;
    /**
    * 商品类别名称
    */
    private String producttypename;
    /**
    * 父类id
    */
    private Integer parentid;
    /**
    * 是否是菜单
    */
    private Integer ismenu;


    public Integer getProducttypeid() {
        return producttypeid;
    }

    public void setProducttypeid(Integer producttypeid) {
        this.producttypeid = producttypeid;
    }

    public String getProducttypename() {
        return producttypename;
    }

    public void setProducttypename(String producttypename) {
        this.producttypename = producttypename;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

}