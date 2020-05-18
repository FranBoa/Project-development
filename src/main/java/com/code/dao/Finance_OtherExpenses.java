package com.code.dao;

import com.code.entity.OtherExpenses;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Finance_OtherExpenses {
    public int addOtherExpenses(OtherExpenses otherExpenses);
}
