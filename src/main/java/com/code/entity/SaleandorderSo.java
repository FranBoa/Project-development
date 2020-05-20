package com.code.entity;

/**
 * ClassName:SaleandorderSo
 * Package:com.code.entity
 * Description:
 *
 * @Date: 2020/5/19 0019 8:47
 * @Author:YAP
 */
public class SaleandorderSo extends Saleandorder{
    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
