package com.code.service;

import com.code.entity.AccountsPayableDetails;

import java.util.List;

public interface Finance_AccountsPayableDetailsService {
    List<AccountsPayableDetails> getAllAccountsPayableDetails(String date1, String date2, int expenditure_num);
}
