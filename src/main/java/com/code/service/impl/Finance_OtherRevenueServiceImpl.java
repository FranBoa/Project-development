package com.code.service.impl;

import com.code.dao.Finance_OtherRevenue;
import com.code.entity.OtherRevenue;
import com.code.service.Finance_OtherRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Finance_OtherRevenueServiceImpl implements Finance_OtherRevenueService {
    @Autowired(required = false)
    private Finance_OtherRevenue financeOtherRevenue;
    @Override
    public int addOtherRevenue(OtherRevenue otherRevenue) {
        return financeOtherRevenue.addOtherRevenue(otherRevenue);
    }
}
