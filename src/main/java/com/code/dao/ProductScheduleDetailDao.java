package com.code.dao;

import com.code.entity.ProductScheduleDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Productscheduledetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-22 08:45:33
 */
public interface ProductScheduleDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductScheduleDetail queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param productscheduledetail 实例对象
     * @return 对象列表
     */
    List<ProductScheduleDetail> queryAll(ProductScheduleDetail productscheduledetail);

    /**
     * 新增数据
     *
     * @param productscheduledetail 实例对象
     * @return 影响行数
     */
    int insert(ProductScheduleDetail productscheduledetail);

    /**
     * 修改数据
     *
     * @param productscheduledetail 实例对象
     * @return 影响行数
     */
    int update(ProductScheduleDetail productscheduledetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}