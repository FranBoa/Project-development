package com.code.entity;

import java.io.Serializable;

/**
 * (Dengji)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public class Dengji implements Serializable {
	private static final long serialVersionUID = 604174576469546525L;
	/**
	 * 等级编号，主键
	 */
	private Integer djid;
	/**
	 * 等级名称
	 */
	private String djname;
	/**
	 * 等级优惠
	 */
	private Object djyouhui;

	public Integer getDjid() {
		return djid;
	}

	public void setDjid(Integer djid) {
		this.djid = djid;
	}

	public String getDjname() {
		return djname;
	}

	public void setDjname(String djname) {
		this.djname = djname;
	}

	public Object getDjyouhui() {
		return djyouhui;
	}

	public void setDjyouhui(Object djyouhui) {
		this.djyouhui = djyouhui;
	}

	@Override
	public String toString() {
		return "Dengji [djid=" + djid + ", djname=" + djname + ", djyouhui=" + djyouhui + "]";
	}
	
	
	
}