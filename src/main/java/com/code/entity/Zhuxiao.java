package com.code.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * 会员卡注销表(Zhuxiao)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Zhuxiao implements Serializable {
	private static final long serialVersionUID = -42805668269991269L;
	/**
	 * 注销编号
	 */
	private int zid;
	/**
	 * 会员卡卡号
	 */
	private String hykkh;
	/**
	 * 注销时间
	 */
	//设置时区为上海时区，时间格式自己据需求定。
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date zxtime;

	public int getZid() {
		return zid;
	}

	public void setZid(int zid) {
		this.zid = zid;
	}

	public String getHykkh() {
		return hykkh;
	}

	public void setHykkh(String hykkh) {
		this.hykkh = hykkh;
	}

	public Date getZxtime() {
		return zxtime;
	}

	public void setZxtime(Date zxtime) {
		this.zxtime = zxtime;
	}

}