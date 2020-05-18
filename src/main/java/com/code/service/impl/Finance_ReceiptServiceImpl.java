package com.code.service.impl;

import com.code.dao.Finance_Receipt;
import com.code.entity.Receipt;
import com.code.service.Finance_ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_ReceiptServiceImpl implements Finance_ReceiptService {
    @Autowired(required = false)
    private Finance_Receipt financeReceipt;
    @Override
    public List<Receipt> getReceiptRecord(String params, String date1, String date2, String payee) {
        return financeReceipt.getReceiptRecord(params, date1, date2, payee);
    }

    @Override
    public int addReceipt(Receipt receipt) {
        return financeReceipt.addReceipt(receipt);
    }

    @Override
    public int delReceipt(int settle_num) {
        return financeReceipt.delReceipt(settle_num);
    }
}
