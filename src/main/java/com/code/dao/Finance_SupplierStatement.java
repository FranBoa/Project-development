package com.code.dao;

import com.code.entity.SupplierStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Finance_SupplierStatement {
    public List<SupplierStatement> getSupplierStatement(@Param("date1") String date1, @Param("date2") String date2, @Param("supplier_id") String supplier_id);
}
