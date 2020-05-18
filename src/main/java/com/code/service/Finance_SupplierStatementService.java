package com.code.service;

import com.code.entity.SupplierStatement;

import java.util.List;

public interface Finance_SupplierStatementService {
    List<SupplierStatement> getSupplierStatement(String date1, String date2, String supplier_id);
}
