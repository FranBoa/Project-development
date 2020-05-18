package com.code.dao;

import com.code.entity.AccountsPayableDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_AccountsPayableDetails {
    public List<AccountsPayableDetails> getAllAccountsPayableDetails(@Param("date1") String date1, @Param("date2") String date2, @Param("expenditure_num") int expenditure_num);
}


