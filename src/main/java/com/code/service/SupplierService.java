package com.code.service;

import com.code.entity.Saleandorder;
import com.code.entity.Supplier;
import com.code.entity.Warehouse;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Supplier)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
public interface SupplierService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Supplier queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Supplier>selectAll();

    PageInfo<Supplier> selectAllForPage(int pageNum, int pageSize);
    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    Supplier insert(Supplier supplier);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplier 实例对象
     * @return 对象列表
     */
    List<Supplier> queryAll(Supplier supplier);

    /**
     * 修改数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    Supplier update(Supplier supplier);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

	PageInfo<Supplier> selectAllforPage(Integer pageNum, Integer pageSize);

}