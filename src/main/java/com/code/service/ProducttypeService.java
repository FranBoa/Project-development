package com.code.service;

import com.code.entity.Producttype;
import java.util.List;

/**
 * (Producttype)表服务接口
 *
 * @author yap
 * @since 2020-04-29 16:11:31
 */
public interface ProducttypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param producttypeid 主键
     * @return 实例对象
     */
    Producttype queryById(Integer producttypeid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Producttype>selectAll();

    /**
     * 新增数据
     *
     * @param producttype 实例对象
     * @return 实例对象
     */
    Producttype insert(Producttype producttype);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param producttype 实例对象
     * @return 对象列表
     */
    List<Producttype> queryAll(Producttype producttype);

    /**
     * 修改数据
     *
     * @param producttype 实例对象
     * @return 实例对象
     */
    Producttype update(Producttype producttype);

    /**
     * 通过主键删除数据
     *
     * @param producttypeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer producttypeid);

}