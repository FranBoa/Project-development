package com.code.dao;

import com.code.entity.OtherIncomeAndExpenditureDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_OtherIncomeAndExpenditureDetails {
    public List<OtherIncomeAndExpenditureDetails> getOtherIncomeAndExpenditureDetails(@Param("date1") String date1, @Param("date2") String date2, @Param("remark") String remark, @Param("incomeCategory") Integer incomeCategory);
}
