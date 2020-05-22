package com.code.entity;

import java.io.Serializable;

/**
 * 会员消费记录表(Xiaofei)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public class Xiaofei extends Shangping implements Serializable {
	private static final long serialVersionUID = -34720252660632525L;
	/**
	 * 消费编号
	 */
	private int xid;
	/**
	 * 会员卡卡号，主键
	 */
	private String hykid;
	/**
	 * 商品编号，主键
	 */
	private int spid;
	private Shangping spname;
	/**
	 * 购买数量
	 */
	private Integer xfsl;
	/**
	 * 金额
	 */
	private double money;

	public int getXid() {
		return xid;
	}

	public void setXid(int xid) {
		this.xid = xid;
	}

	public String getHykid() {
		return hykid;
	}

	public void setHykid(String hykid) {
		this.hykid = hykid;
	}

	public int getSpid() {
		return spid;
	}

	public void setSpid(int spid) {
		this.spid = spid;
	}

	public Integer getXfsl() {
		return xfsl;
	}

	public void setXfsl(Integer xfsl) {
		this.xfsl = xfsl;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Xiaofei [xid=" + xid + ", hykid=" + hykid + ", spid=" + spid + ", spname=" + spname + ", xfsl=" + xfsl
				+ ", money=" + money + "]";
	}
	

}