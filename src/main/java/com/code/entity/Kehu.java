package com.code.entity;

import java.io.Serializable;

import lombok.ToString;

/**
 * (Kehu)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Kehu implements Serializable {
    private static final long serialVersionUID = -23526044327921403L;
    /**
    * 客户编号
    */
    private int id;
    /**
    * 客户等级
    */
    private String grade;
    /**
    * 客户名称
    */
    private String name;
    /**
    * 类别编号
    */
    private String cid;
    /**
    * 销售人员
    */
    private String sell;
    /**
    * 联系人
    */
    private String contact;
    /**
    * 手机
    */
    private String mobilePhone;
    /**
    * 送货地址
    */
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	@Override
	public String toString() {
		return "Kehu [id=" + id + ", grade=" + grade + ", name=" + name + ", cid=" + cid + ", sell=" + sell
				+ ", contact=" + contact + ", mobilePhone=" + mobilePhone + ", address=" + address + "]";
	}

	

    
    
}