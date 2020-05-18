package com.code.dao;

import com.code.entity.OtherRevenue;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Finance_OtherRevenue {
    public int addOtherRevenue(OtherRevenue otherRevenue);
}
