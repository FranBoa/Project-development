package com.code.dao;

import com.code.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Finance_Payment {
    public int addPayment(Payment payment);
}
