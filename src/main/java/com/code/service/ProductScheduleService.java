package com.code.service;

import com.code.entity.ProductSchedule;
import com.code.entity.Wpurchase;
import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;

/**
 * (Productschedule)表服务接口
 *
 * @author makejava
 * @since 2020-05-22 08:35:08
 */
public interface ProductScheduleService {

    /**
     * 通过ID查询单条数据
     *
     * @param psid 主键
     * @return 实例对象
     */
    ProductSchedule queryById(String psid);

    /**
     * 查询多条数据
     *
     * @param pagesize 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    PageInfo<ProductSchedule> queryAllByLimit(int pagesize, int limit, ProductSchedule ps);
    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<ProductSchedule> queryAll(ProductSchedule ps);

    /**
     * 新增数据
     *
     * @param productschedule 实例对象
     * @return 实例对象
     */
    int insert(ProductSchedule productschedule);

    /**
     * 修改数据
     *
     * @param productschedule 实例对象
     * @return 实例对象
     */
    int update(ProductSchedule productschedule);

    /**
     * 通过主键删除数据
     *
     * @param psid 主键
     * @return 是否成功
     */
    boolean deleteById(String psid);

}