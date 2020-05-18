package com.code.service.impl;

import com.code.dao.Finance_Profit;
import com.code.entity.Profit;
import com.code.service.Finance_ProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Finance_ProfitServiceImpl implements Finance_ProfitService {
    @Autowired(required = false)
    private Finance_Profit financeProfit;
    @Override
    public List<Profit> getProfit(String date1, String date2) {
        return financeProfit.getProfit(date1, date2);
    }
}
