package com.code.service.impl;

import com.code.dao.Finance_SupplierStatement;
import com.code.entity.SupplierStatement;
import com.code.service.Finance_SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_SupplierStatementServiceImpl implements Finance_SupplierStatementService {
    @Autowired(required = false)
    private Finance_SupplierStatement financeSupplierStatement;
    @Override
    public List<SupplierStatement> getSupplierStatement(String date1, String date2, String supplier_id) {
        return  financeSupplierStatement.getSupplierStatement(date1, date2, supplier_id);
    }
}
