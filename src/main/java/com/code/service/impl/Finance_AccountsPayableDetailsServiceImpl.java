package com.code.service.impl;

import com.code.dao.Finance_AccountsPayableDetails;
import com.code.entity.AccountsPayableDetails;
import com.code.service.Finance_AccountsPayableDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_AccountsPayableDetailsServiceImpl implements Finance_AccountsPayableDetailsService {
    @Autowired(required = false)
    private Finance_AccountsPayableDetails financeAccountsPayableDetails;

    @Override
    public List<AccountsPayableDetails> getAllAccountsPayableDetails(String date1, String date2, int expenditure_num) {
        return financeAccountsPayableDetails.getAllAccountsPayableDetails(date1, date2, expenditure_num);
    }
}
