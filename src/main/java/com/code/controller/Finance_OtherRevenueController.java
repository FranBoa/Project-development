package com.code.controller;

import com.code.service.Finance_OtherRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class Finance_OtherRevenueController {
    @Autowired
    private Finance_OtherRevenueService financeOtherRevenueService;
}
