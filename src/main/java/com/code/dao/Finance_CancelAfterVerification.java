package com.code.dao;

import com.code.entity.CancelAfterVerification;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Finance_CancelAfterVerification {
    public  int addCancelAfterVerification(CancelAfterVerification cancelAfterVerification);
}
