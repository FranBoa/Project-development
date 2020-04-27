package com.code.service;

import com.code.entity.Product;
import java.util.List;

/**
 * (Product)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface ProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param pid 主键
     * @return 实例对象
     */
    Product queryById(Integer pid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Product>selectAll();

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    int insert(Product product);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    List<Product> queryAll(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param pid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pid);

}