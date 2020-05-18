package com.code.service;

import com.code.entity.Profit;

import java.util.List;

public interface Finance_ProfitService {
    List<Profit> getProfit(String date1, String date2);
}
