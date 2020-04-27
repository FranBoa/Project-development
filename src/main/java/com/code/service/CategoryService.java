package com.code.service;

import com.code.entity.Category;
import java.util.List;

/**
 * 客户类别(Category)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface CategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Category queryById(String cid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Category>selectAll();

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    int insert(Category category);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param category 实例对象
     * @return 对象列表
     */
    List<Category> queryAll(Category category);

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    int update(Category category);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    int deleteById(int cid);

}