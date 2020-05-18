package com.code.controller;

import com.code.service.Finance_CancelAfterVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class Finance_CancelAfterVerificationController {
    @Autowired
    private Finance_CancelAfterVerificationService financeCancelAfterVerificationService;

}
