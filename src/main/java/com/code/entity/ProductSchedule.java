package com.code.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (ProductSchedule)实体类
 *
 * @author makejava
 * @since 2020-05-22 08:35:08
 */
public class ProductSchedule implements Serializable {
    private static final long serialVersionUID = 819348760133703131L;
    /**
    * 产品订单编号
    */
    private String psid;
    /**
    * 产品名称
    */
    private String psname;
    /**
    * 审核状态
    */
    private String psstatus;
    /**
    * 申请时间
    */
    private String psdate;
    /**
    * 申请人
    */
    private String userid;
    /**
    * 审核人
    */
    private String bossid;
    /**
    * 备注
    */
    private String pscommet;

    private User userlist;
    private User bosslist;
    private List<ProductScheduleDetail> psd;


    public String getPsid() {
        return psid;
    }

    public void setPsid(String psid) {
        this.psid = psid;
    }

    public String getPsname() {
        return psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public String getPsstatus() {
        return psstatus;
    }

    public void setPsstatus(String psstatus) {
        this.psstatus = psstatus;
    }

    public String getPsdate() {
        return psdate;
    }

    public void setPsdate(String psdate) {
        this.psdate = psdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBossid() {
        return bossid;
    }

    public void setBossid(String bossid) {
        this.bossid = bossid;
    }

    public String getPscommet() {
        return pscommet;
    }

    public void setPscommet(String pscommet) {
        this.pscommet = pscommet;
    }

    public User getUserlist() {
        return userlist;
    }

    public void setUserlist(User userlist) {
        this.userlist = userlist;
    }

    public User getBosslist() {
        return bosslist;
    }

    public void setBosslist(User bosslist) {
        this.bosslist = bosslist;
    }

    public List<ProductScheduleDetail> getPsd() {
        return psd;
    }

    public void setPsd(List<ProductScheduleDetail> psd) {
        this.psd = psd;
    }
}