package com.code.service.impl;

import com.code.dao.Finance_OtherIncomeAndExpenditureDetails;
import com.code.entity.OtherIncomeAndExpenditureDetails;
import com.code.service.Finance_OtherIncomeAndExpenditureDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_OtherIncomeAndExpenditureDetailsServiceImpl implements Finance_OtherIncomeAndExpenditureDetailsService {
    @Autowired(required = false)
    private Finance_OtherIncomeAndExpenditureDetails financeOtherIncomeAndExpenditureDetails;
    @Override
    public List<OtherIncomeAndExpenditureDetails> getOtherIncomeAndExpenditureDetails(String date1, String date2, String remark, Integer incomeCategory) {
        return financeOtherIncomeAndExpenditureDetails.getOtherIncomeAndExpenditureDetails(date1, date2, remark, incomeCategory);
    }
}
