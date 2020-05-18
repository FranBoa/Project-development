package com.code.service;

import com.code.entity.Receipt;

import java.util.List;

public interface Finance_ReceiptService {
    List<Receipt> getReceiptRecord(String params, String date1, String date2, String payee);
    int addReceipt(Receipt receipt);
    int delReceipt(int settle_num);
}
