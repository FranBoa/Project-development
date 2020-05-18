package com.code.controller;

import com.alibaba.fastjson.JSON;
import com.code.entity.CashStatement;
import com.code.service.Finance_CashStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/finance")
public class Finance_CashStatementController {
    @Autowired
    Finance_CashStatementService financeCashStatementService;
    @RequestMapping("/getAllCashStatement")
    public String getAllCashStatement( String date1, String date2, String dealings, @RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "4") int pageSize){
        int income=0;
        int disburse=0;
        int accountBalance=0;
        List<CashStatement> cash_StatementS = financeCashStatementService.getCash_Statement(date1, date2, dealings);
//        model.addAttribute("cash_StatementS", cash_StatementS);
        for (CashStatement cash_statement : cash_StatementS) {
            income+=cash_statement.getIncome();
            disburse+=cash_statement.getDisburse();
            accountBalance+=cash_statement.getAccountBalance();
        }
        String cash_StatementJSON = JSON.toJSONString(cash_StatementS);
        System.out.println(cash_StatementJSON);
//        model.addAttribute("income", income);
//        model.addAttribute("disburse", disburse);
//        model.addAttribute("accountBalance", accountBalance);
        return cash_StatementJSON;
    }
}
