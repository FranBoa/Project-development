package com.code.dao;

import com.code.entity.CashStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_CashStatement {
    List<CashStatement> getCash_Statement(@Param("date1") String date1, @Param("date2") String date2, @Param("dealings") String dealings);
}
