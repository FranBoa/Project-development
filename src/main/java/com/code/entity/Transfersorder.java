package com.code.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * (Transfersorder)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public class Transfersorder implements Serializable {
	private static final long serialVersionUID = 602359088132828565L;
	/**
	 * 调拨单ID
	 */
	private Integer transfersorderid;
	/**
	 * 商品id
	 */
	private Integer pid;
	/**
	 * 单位
	 */
	private String unitrequire;
	/**
	 * 数量
	 */
	private Integer num;
	/**
	 * 调出仓库
	 */
	private Integer outware;
	/**
	 * 调入仓库
	 */
	private Integer inware;
	/**
	 * 审核状态
	 */
	public Integer stuta;
	/**
	 * 制单日期
	 */
	public Date createtime;
	/**
	 * 制单人
	 */
	public Integer createPerson;
	/**
	 * 备注
	 */
	private String details;

	public Integer getTransfersorderid() {
		return transfersorderid;
	}

	public void setTransfersorderid(Integer transfersorderid) {
		this.transfersorderid = transfersorderid;
	}

	public Integer getStuta() {
		return stuta;
	}

	public void setStuta(Integer stuta) {
		this.stuta = stuta;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getCreatePerson() {
		return createPerson;
	}

	public void setCreatePerson(Integer createPerson) {
		this.createPerson = createPerson;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getUnitrequire() {
		return unitrequire;
	}

	public void setUnitrequire(String unitrequire) {
		this.unitrequire = unitrequire;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getOutware() {
		return outware;
	}

	public void setOutware(Integer outware) {
		this.outware = outware;
	}

	public Integer getInware() {
		return inware;
	}

	public void setInware(Integer inware) {
		this.inware = inware;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}