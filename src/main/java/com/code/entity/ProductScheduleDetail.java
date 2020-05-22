package com.code.entity;

import java.io.Serializable;

/**
 * (Productscheduledetail)实体类
 *
 * @author makejava
 * @since 2020-05-22 08:45:33
 */
public class ProductScheduleDetail implements Serializable {
    private static final long serialVersionUID = 226830070659508529L;
    /**
    * 产品计划表
    */
    private Integer id;
    /**
    * 产品计划单id
    */
    private String psid;
    /**
    * 原料名称
    */
    private String psname;
    /**
    * 原料数量
    */
    private Integer psnum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPsid() {
        return psid;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public Integer getPsnum() {
        return psnum;
    }

    public void setPsnum(Integer psnum) {
        this.psnum = psnum;
    }

}