package com.code.entity;

import java.io.Serializable;

/**
 * (Huiyuan)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Huiyuan implements Serializable {
	private static final long serialVersionUID = -49255712788664475L;
	/**
	 * 会员编号，主键
	 */
	private int hyid;
	/**
	 * 会员卡号，外键
	 */
	private String hykh;
	/**
	 * 密码
	 */
	private String pwd;
	/**
	 * 确认密码
	 */
	private String repass;
	/**
	 * 姓名
	 */
	private String hyname;
	/**
	 * 性别
	 */
	private String hysex;
	/**
	 * 年龄
	 */
	private Integer hyage;
	/**
	 * 工作单位
	 */
	private String hydanwei;
	/**
	 * 联系方式
	 */
	private String hylianxi;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRepass() {
		return repass;
	}

	public void setRepass(String repass) {
		this.repass = repass;
	}

	public int getHyid() {
		return hyid;
	}

	public void setHyid(int hyid) {
		this.hyid = hyid;
	}

	public String getHykh() {
		return hykh;
	}

	public void setHykh(String hykh) {
		this.hykh = hykh;
	}

	public String getHyname() {
		return hyname;
	}

	public void setHyname(String hyname) {
		this.hyname = hyname;
	}

	public String getHysex() {
		return hysex;
	}

	public void setHysex(String hysex) {
		this.hysex = hysex;
	}

	public Integer getHyage() {
		return hyage;
	}

	public void setHyage(Integer hyage) {
		this.hyage = hyage;
	}

	@Override
	public String toString() {
		return "Huiyuan [hyid=" + hyid + ", hykh=" + hykh + ", pwd=" + pwd + ", repass=" + repass + ", hyname=" + hyname
				+ ", hysex=" + hysex + ", hyage=" + hyage + ", hydanwei=" + hydanwei + ", hylianxi=" + hylianxi + "]";
	}

	public String getHydanwei() {
		return hydanwei;
	}

	public void setHydanwei(String hydanwei) {
		this.hydanwei = hydanwei;
	}

	public String getHylianxi() {
		return hylianxi;
	}

	public void setHylianxi(String hylianxi) {
		this.hylianxi = hylianxi;
	}

}