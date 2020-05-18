package com.code.service.impl;

import com.code.dao.Finance_Payment;
import com.code.entity.Payment;
import com.code.service.Finance_PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Finance_PaymentServiceImpl implements Finance_PaymentService {
    @Autowired(required = false)
    private Finance_Payment financePayment;
    @Override
    public int addPayment(Payment payment) {
        return financePayment.addPayment(payment);
    }
}
