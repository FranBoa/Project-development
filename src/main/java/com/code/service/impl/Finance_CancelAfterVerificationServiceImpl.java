package com.code.service.impl;

import com.code.dao.Finance_CancelAfterVerification;
import com.code.entity.CancelAfterVerification;
import com.code.service.Finance_CancelAfterVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Finance_CancelAfterVerificationServiceImpl implements Finance_CancelAfterVerificationService {
    @Autowired(required = false)
    private Finance_CancelAfterVerification financeCancelAfterVerification;
    @Override
    public int addCancelAfterVerification(CancelAfterVerification cancelAfterVerification) {
        return financeCancelAfterVerification.addCancelAfterVerification(cancelAfterVerification);
    }
}
