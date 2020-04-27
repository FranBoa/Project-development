package com.code.dao;

import com.code.entity.CashStatement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Finance_CashStatement {
    List<CashStatement> getCash_Statement(String date1,String date2,String dealings);
}
