package com.code.entity;

/**
 * ClassName:fromdata
 * Package:com.code.entity
 * Description:
 *
 * @Date: 2020/5/14 0014 17:35
 * @Author:YAP
 */
public class formdata {
    private String title;

    private String pay;

    private  String kehuid;

    private String customername;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getKehuid() {
        return kehuid;
    }

    public void setKehuid(String kehuid) {
        this.kehuid = kehuid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public formdata(String title, String pay, String kehuid, String customername) {
        this.title = title;
        this.pay = pay;
        this.kehuid = kehuid;
        this.customername = customername;
    }

    @Override
    public String toString() {
        return "formdata{" +
                "title='" + title + '\'' +
                ", pay='" + pay + '\'' +
                ", kehuid='" + kehuid + '\'' +
                ", customername='" + customername + '\'' +
                '}';
    }
}
