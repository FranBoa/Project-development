package com.code.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员卡信息表(Huiyuankai)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Huiyuankai implements Serializable {
	private static final long serialVersionUID = -23026033707480532L;
	/**
	 * 会员卡编号
	 */
	private int hid;
	/**
	 * 会员卡卡号，主键
	 */
	private String hykkh;
	/**
	 * 等级编号，外键
	 */
	private Integer hykdjid;
	/**
	 * 注册时间
	 */
	private Date hyktime;

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHykkh() {
		return hykkh;
	}

	public void setHykkh(String hykkh) {
		this.hykkh = hykkh;
	}

	public Integer getHykdjid() {
		return hykdjid;
	}

	public void setHykdjid(Integer hykdjid) {
		this.hykdjid = hykdjid;
	}

	public Date getHyktime() {
		return hyktime;
	}

	public void setHyktime(Date hyktime) {
		this.hyktime = hyktime;
	}

}