package com.code.entity;

import java.io.Serializable;

/**
 * (Warehouse)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public class Warehouse implements Serializable {
	private static final long serialVersionUID = -83904690039903439L;
	/**
	 * 仓库id
	 */
	private int wid;
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

	private int wstatus;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public int getWstatus() {
		return wstatus;
	}

	public void setWstatus(int wstatus) {
		this.wstatus = wstatus;
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

}