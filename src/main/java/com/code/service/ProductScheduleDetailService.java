package com.code.service;

import com.code.entity.ProductSchedule;
import com.code.entity.ProductScheduleDetail;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Productscheduledetail)表服务接口
 *
 * @author makejava
 * @since 2020-05-22 08:45:33
 */
public interface ProductScheduleDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductScheduleDetail queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    PageInfo<ProductScheduleDetail> queryAllByLimit(int offset, int limit, ProductScheduleDetail psd);
    /**
     * 查询多条数据
     *
     */
    List<ProductScheduleDetail> queryAll(ProductScheduleDetail psd);

    /**
     * 新增数据
     *
     * @param productscheduledetail 实例对象
     * @return 实例对象
     */
    int insert(ProductScheduleDetail productscheduledetail);

    /**
     * 修改数据
     *
     * @param productscheduledetail 实例对象
     * @return 实例对象
     */
    int update(ProductScheduleDetail productscheduledetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}