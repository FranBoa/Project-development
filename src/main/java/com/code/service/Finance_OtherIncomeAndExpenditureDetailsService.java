package com.code.service;

import com.code.entity.OtherIncomeAndExpenditureDetails;

import java.util.List;

public interface Finance_OtherIncomeAndExpenditureDetailsService {
    List<OtherIncomeAndExpenditureDetails> getOtherIncomeAndExpenditureDetails(String date1, String date2, String remark, Integer incomeCategory);
}
