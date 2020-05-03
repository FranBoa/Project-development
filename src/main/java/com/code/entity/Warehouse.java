package com.code.entity;

import java.io.Serializable;

/**
 * (Warehouse)实体类
 *
 * @author yap
 * @since 2020-05-01 20:50:03
 */
public class Warehouse implements Serializable {
    private static final long serialVersionUID = 523697581223124342L;
    /**
    * 仓库id
    */
    private Integer wid;
    /**
    * 仓库名称
    */
    private String wname;
    /**
    * 仓库地址
    */
    private String address;
    /**
    * 负责人
    */
    private String personnelname;
    /**
    * 负责人联系电话
    */
    private String personnelphone;
    /**
    * 仓库电话
    */
    private String wphone;


    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonnelname() {
        return personnelname;
    }

    public void setPersonnelname(String personnelname) {
        this.personnelname = personnelname;
    }

    public String getPersonnelphone() {
        return personnelphone;
    }

    public void setPersonnelphone(String personnelphone) {
        this.personnelphone = personnelphone;
    }

    public String getWphone() {
        return wphone;
    }

    public void setWphone(String wphone) {
        this.wphone = wphone;
    }

}