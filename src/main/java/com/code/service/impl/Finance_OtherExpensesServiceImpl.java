package com.code.service.impl;

import com.code.dao.Finance_OtherExpenses;
import com.code.entity.OtherExpenses;
import com.code.service.Finance_OtherExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Finance_OtherExpensesServiceImpl implements Finance_OtherExpensesService {
    @Autowired(required = false)
    private Finance_OtherExpenses financeOtherExpenses;
    @Override
    public int addOtherExpenses(OtherExpenses otherExpenses) {
        return financeOtherExpenses.addOtherExpenses(otherExpenses);
    }
}
