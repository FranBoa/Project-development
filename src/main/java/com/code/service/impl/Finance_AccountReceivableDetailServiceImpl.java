package com.code.service.impl;

import com.code.dao.Finance_AccountReceivableDetail;
import com.code.entity.AccountReceivableDetail;
import com.code.service.Finance_AccountReceivableDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Finance_AccountReceivableDetailServiceImpl implements Finance_AccountReceivableDetailService {
    @Autowired(required = false)
    private Finance_AccountReceivableDetail financeAccountReceivableDetail;
    @Override
    public List<AccountReceivableDetail> getAccountReceivableDetail(String date1, String date2, String clientele_id) {
        return financeAccountReceivableDetail.getAccountReceivableDetail(date1, date2, clientele_id);
    }
}
