package com.code.dao;

import com.code.entity.Receipt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Finance_Receipt {
    public List<Receipt> getReceiptRecord(String params, String date1, String date2, String payee);
    public int addReceipt(Receipt receipt);
    public int delReceipt(int settle_num);
}
