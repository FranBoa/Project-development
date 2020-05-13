package com.code.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 客户类别(Category)实体类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public class Category implements Serializable {
	private static final long serialVersionUID = -96080337786070315L;
	/**
	 * 类别编号
	 */
	private int cid;
	/**
	 * 类别名称
	 */
	private String cType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public List<Kehu> getChildren() {
		return children;
	}

	public void setChildren(List<Kehu> children) {
		this.children = children;
	}

	private List<Kehu> children;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}



}
