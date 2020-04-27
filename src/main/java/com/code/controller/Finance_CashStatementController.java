package com.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("finance")
public class Finance_CashStatementController {
    public String getAllCashStatement(Model model, String date1, String date2, String dealings, @RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "4") int pageSize){

        return "";
    }
}
