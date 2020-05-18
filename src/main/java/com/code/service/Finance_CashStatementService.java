package com.code.service;

import com.code.entity.CashStatement;

import java.util.List;

public interface Finance_CashStatementService {
    List<CashStatement> getCash_Statement(String date1, String date2, String dealings);
}
