package com.code.service.impl;

import com.code.dao.Finance_ProcurementSellExpenses;
import com.code.entity.ProcurementSellExpenses;
import com.code.service.Finance_ProcurementSellExpensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Finance_ProcurementSellExpensesServiceImpl implements Finance_ProcurementSellExpensesService {
    @Autowired(required = false)
    private Finance_ProcurementSellExpenses financeProcurementSellExpenses;
    @Override
    public int addProcurementSellExpenses(ProcurementSellExpenses procurementSellExpenses) {
        return financeProcurementSellExpenses.addProcurementSellExpenses(procurementSellExpenses);
    }
}
