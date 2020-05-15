package com.code.entity;

import java.util.Date;
import java.util.List;



public class Wpurchase {

	/**
	    * 单据编号
	    */
	    private List<User> userList;
		/**
		    * 单据编号
		    */
		    private String purchaseId;
	    /**
	    * 负责人
	    */
	    private String usersId;
	    /**
	    * 审核人
	    */
	    private String bossUsersId;
	 
	/* 负责人名字 */
	    private String userName;
	/* 审核人名字 */
	    private String bossName;
	    /**
	 * supplier_id 供货商id
	    */
	    private String supplierId;
	    /**
	    * 商品id
	    */
	    private String purchaseGoodsId;
	    /**
	    * 商品名称
	    */
	    private String purchaseGoodsName;
	    private String ptype;
	    private String ptypname;
	    /**
	    * 审核状态
	    */
	    private String purchaseStatus;
	    /**
	    * 价格
	    */
	    private Integer purchasePrice;
	    /**
	    * 数量
	    */
	    private Integer purchaseNum;
	    /**
	    * 单据日期
	    */
	    private String purchaseDate;
	    /**
	    * 备注
	    */
	    private String commet;
	    /**
	    * 仓库
	    */
	    private Integer warehouse;
	    /**
	    * 仓库
	    */
	    private String wName;
	    /**
	    * 关联销货订单
	    * private String xhOrders;
	    */
	    /**
	    * 优惠率
	    */
	    private String discounts;
	    /**
	    * 优惠率
	    */
	    private Integer discountsPrice;
	    /**
	    * 优惠后总金额
	    */
	    private Integer discountsSum;
	    /**
	    * 付款状态
	    */
	    private String paymentStatus;
	    /**
	    * 单位
	    */
	    private String purchaseUnit;
	    
		public List<User> getUserList() {
			return userList;
		}
		public void setUserList(List<User> userList) {
			this.userList = userList;
		}
		public String getPurchaseId() {
			return purchaseId;
		}
		public void setPurchaseId(String purchaseId) {
			this.purchaseId = purchaseId;
		}
		public String getUsersId() {
			return usersId;
		}
		public void setUsersId(String usersId) {
			this.usersId = usersId;
		}
		public String getBossUsersId() {
			return bossUsersId;
		}
		public void setBossUsersId(String bossUsersId) {
			this.bossUsersId = bossUsersId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getBossName() {
			return bossName;
		}
		public void setBossName(String bossName) {
			this.bossName = bossName;
		}
		public String getSupplierId() {
			return supplierId;
		}
		public void setSupplierId(String supplierId) {
			this.supplierId = supplierId;
		}
		public String getPurchaseGoodsId() {
			return purchaseGoodsId;
		}
		public void setPurchaseGoodsId(String purchaseGoodsId) {
			this.purchaseGoodsId = purchaseGoodsId;
		}
		public String getPurchaseGoodsName() {
			return purchaseGoodsName;
		}
		public void setPurchaseGoodsName(String purchaseGoodsName) {
			this.purchaseGoodsName = purchaseGoodsName;
		}
		public String getPtype() {
			return ptype;
		}
		public void setPtype(String ptype) {
			this.ptype = ptype;
		}
		public String getPtypname() {
			return ptypname;
		}
		public void setPtypname(String ptypname) {
			this.ptypname = ptypname;
		}
		public String getPurchaseStatus() {
			return purchaseStatus;
		}
		public void setPurchaseStatus(String purchaseStatus) {
			this.purchaseStatus = purchaseStatus;
		}
		public Integer getPurchasePrice() {
			return purchasePrice;
		}
		public void setPurchasePrice(Integer purchasePrice) {
			this.purchasePrice = purchasePrice;
		}
		public Integer getPurchaseNum() {
			return purchaseNum;
		}
		public void setPurchaseNum(Integer purchaseNum) {
			this.purchaseNum = purchaseNum;
		}
		public String getPurchaseDate() {
			return purchaseDate;
		}
		public void setPurchaseDate(String purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		public String getCommet() {
			return commet;
		}
		public void setCommet(String commet) {
			this.commet = commet;
		}
		public Integer getWarehouse() {
			return warehouse;
		}
		public void setWarehouse(Integer warehouse) {
			this.warehouse = warehouse;
		}
		public String getwName() {
			return wName;
		}
		public void setwName(String wName) {
			this.wName = wName;
		}
		public String getDiscounts() {
			return discounts;
		}
		public void setDiscounts(String discounts) {
			this.discounts = discounts;
		}
		public Integer getDiscountsPrice() {
			return discountsPrice;
		}
		public void setDiscountsPrice(Integer discountsPrice) {
			this.discountsPrice = discountsPrice;
		}
		public Integer getDiscountsSum() {
			return discountsSum;
		}
		public void setDiscountsSum(Integer discountsSum) {
			this.discountsSum = discountsSum;
		}
		public String getPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		public String getPurchaseUnit() {
			return purchaseUnit;
		}
		public void setPurchaseUnit(String purchaseUnit) {
			this.purchaseUnit = purchaseUnit;
		}
		@Override
		public String toString() {
			return "Wpurchase [userList=" + userList + ", purchaseId=" + purchaseId + ", usersId=" + usersId
					+ ", bossUsersId=" + bossUsersId + ", userName=" + userName + ", bossName=" + bossName
					+ ", supplierId=" + supplierId + ", purchaseGoodsId=" + purchaseGoodsId + ", purchaseGoodsName="
					+ purchaseGoodsName + ", purchaseStatus=" + purchaseStatus + ", purchasePrice=" + purchasePrice
					+ ", purchaseNum=" + purchaseNum + ", purchaseDate=" + purchaseDate + ", commet=" + commet
					+ ", warehouse=" + warehouse + ", wName=" + wName + ", discounts=" + discounts + ", discountsPrice="
					+ discountsPrice + ", discountsSum=" + discountsSum + ", paymentStatus=" + paymentStatus
					+ ", purchaseUnit=" + purchaseUnit + "]";
		}
		public Wpurchase(List<User> userList, String purchaseId, String usersId, String bossUsersId, String userName,
				String bossName, String supplierId, String purchaseGoodsId, String purchaseGoodsName, String ptype,
				String ptypname, String purchaseStatus, Integer purchasePrice, Integer purchaseNum, String purchaseDate,
				String commet, Integer warehouse, String wName, String discounts, Integer discountsPrice,
				Integer discountsSum, String paymentStatus, String purchaseUnit) {
			super();
			this.userList = userList;
			this.purchaseId = purchaseId;
			this.usersId = usersId;
			this.bossUsersId = bossUsersId;
			this.userName = userName;
			this.bossName = bossName;
			this.supplierId = supplierId;
			this.purchaseGoodsId = purchaseGoodsId;
			this.purchaseGoodsName = purchaseGoodsName;
			this.ptype = ptype;
			this.ptypname = ptypname;
			this.purchaseStatus = purchaseStatus;
			this.purchasePrice = purchasePrice;
			this.purchaseNum = purchaseNum;
			this.purchaseDate = purchaseDate;
			this.commet = commet;
			this.warehouse = warehouse;
			this.wName = wName;
			this.discounts = discounts;
			this.discountsPrice = discountsPrice;
			this.discountsSum = discountsSum;
			this.paymentStatus = paymentStatus;
			this.purchaseUnit = purchaseUnit;
		}
		public Wpurchase() {
			super();
		}
	   
	   
}
