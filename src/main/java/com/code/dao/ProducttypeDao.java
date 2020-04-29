package com.code.dao;

import com.code.entity.Producttype;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Producttype)表数据库访问层
 *
 * @author yap
 * @since 2020-04-29 16:11:31
 */
public interface ProducttypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param producttypeid 主键
     * @return 实例对象
     */
    Producttype queryById(Integer producttypeid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Producttype> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param producttype 实例对象
     * @return 对象列表
     */
    List<Producttype> queryAll(Producttype producttype);

    /**
     * 新增数据
     *
     * @param producttype 实例对象
     * @return 影响行数
     */
    int insert(Producttype producttype);

    /**
     * 修改数据
     *
     * @param producttype 实例对象
     * @return 影响行数
     */
    int update(Producttype producttype);

    /**
     * 通过主键删除数据
     *
     * @param producttypeid 主键
     * @return 影响行数
     */
    int deleteById(Integer producttypeid);

}