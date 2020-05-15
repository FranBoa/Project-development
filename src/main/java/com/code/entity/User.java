package com.code.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public class User implements Serializable {
    private static final long serialVersionUID = -11909188348881844L;
    /**
    * 用户编号
    */
    private String id;
    private String bossid;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 盐值
    */
    private String salt;
    /**
    * 电话号码
    */
    private String phone;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 用户状态
    */
    private Integer status;


    public User() {
		super();
	}
    public User(String id, String bossid, String username, String password, String salt, String phone, String mail,
			Integer status) {
		super();
		this.id = id;
		this.bossid = bossid;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.phone = phone;
		this.email = email;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBossid() {
		return bossid;
	}
	public void setBossid(String bossid) {
		this.bossid = bossid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}