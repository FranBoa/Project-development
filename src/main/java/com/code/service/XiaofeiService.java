package com.code.service;

import com.code.entity.Xiaofei;
import java.util.List;

/**
 * 会员消费记录表(Xiaofei)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public interface XiaofeiService {

    /**
     * 通过ID查询单条数据
     *
     * @param xid 主键
     * @return 实例对象
     */
    Xiaofei queryById(int xid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Xiaofei>selectAll();

    /**
     * 新增数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    int insert(Xiaofei xiaofei);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param xiaofei 实例对象
     * @return 对象列表
     */
    List<Xiaofei> queryAll(Xiaofei xiaofei);

    /**
     * 修改数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    int update(Xiaofei xiaofei);

    /**
     * 通过主键删除数据
     *
     * @param xid 主键
     * @return 是否成功
     */
    int deleteById(int xid);

}