package com.code.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * 会员卡信息表(Huiyuankai)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Huiyuankai extends Dengji implements Serializable {
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
	private Integer djid;
	private Dengji djname;
	/**
	 * 注册时间
	 */
	//设置时区为上海时区，时间格式自己据需求定。
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date hyktime;
    /**
     * 注销
     * @return
     */
	private int zx;

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

	public Integer getDjid() {
		return djid;
	}

	public void setDjid(Integer djid) {
		this.djid = djid;
	}

	public Date getHyktime() {
		return hyktime;
	}

	public void setHyktime(Date hyktime) {
		this.hyktime = hyktime;
	}

	public int getZx() {
		return zx;
	}

	public void setZx(int zx) {
		this.zx = zx;
	}

	@Override
	public String toString() {
		return "Huiyuankai [hid=" + hid + ", hykkh=" + hykkh + ", djid=" + djid + ", djname=" + djname + ", hyktime="
				+ hyktime + "]";
	}

	
	
}