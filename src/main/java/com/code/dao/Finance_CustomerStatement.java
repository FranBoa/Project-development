package com.code.dao;

import com.code.entity.CustomerStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_CustomerStatement {
    public List<CustomerStatement> getCustomerStatement(@Param("date1") String date1, @Param("date2") String date2, @Param("clientele_id") String clientele_id);
}
