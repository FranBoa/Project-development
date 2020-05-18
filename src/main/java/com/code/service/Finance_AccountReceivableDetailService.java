package com.code.service;

import com.code.entity.AccountReceivableDetail;

import java.util.List;

public interface Finance_AccountReceivableDetailService {
     List<AccountReceivableDetail> getAccountReceivableDetail(String date1, String date2, String clientele_id);
}
