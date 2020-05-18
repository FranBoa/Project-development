package com.code.service;

import com.code.entity.CustomerStatement;

import java.util.List;

public interface Finance_CustomerStatementService {
    List<CustomerStatement> getCustomerStatement(String date1, String date2, String clientele_id);
}
