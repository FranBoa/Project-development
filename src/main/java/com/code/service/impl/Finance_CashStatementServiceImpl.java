package com.code.service.impl;

import com.code.dao.Finance_CashStatement;
import com.code.entity.CashStatement;
import com.code.service.Finance_CashStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_CashStatementServiceImpl implements Finance_CashStatementService {
    @Autowired(required = false)
    private Finance_CashStatement finance_cashStatement;
    @Override
    public List<CashStatement> getCash_Statement(String date1, String date2, String dealings) {
        return finance_cashStatement.getCash_Statement(date1, date2, dealings);
    }
}
