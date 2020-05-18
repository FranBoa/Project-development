package com.code.dao;

import com.code.entity.AccountReceivableDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface Finance_AccountReceivableDetail {
    public List<AccountReceivableDetail> getAccountReceivableDetail(@Param("date1") String date1, @Param("date2") String date2, @Param("clientele_id") String clientele_id);
}

