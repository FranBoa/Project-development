package com.code.dao;

import com.code.entity.ProcurementSellExpenses;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Finance_ProcurementSellExpenses {
    public int addProcurementSellExpenses(ProcurementSellExpenses procurementSellExpenses);
}
