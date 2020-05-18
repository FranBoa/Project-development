package com.code.service.impl;

import com.code.dao.Finance_CustomerStatement;
import com.code.entity.CustomerStatement;
import com.code.service.Finance_CustomerStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_CustomerStatementServiceImpl implements Finance_CustomerStatementService {
    @Autowired(required = false)
    private Finance_CustomerStatement financeCustomerStatement;
    @Override
    public List<CustomerStatement> getCustomerStatement(String date1, String date2, String clientele_id) {
        return financeCustomerStatement.getCustomerStatement(date1, date2, clientele_id);
    }
}
