package com.code.dao;

import com.code.entity.Profit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_Profit {
    public List<Profit> getProfit(@Param("date1") String date1, @Param("date2") String date2);
}
