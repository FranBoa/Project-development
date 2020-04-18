package com.code.service;

import com.code.entity.Saleandorder;
import java.util.List;

/**
 * (Saleandorder)表服务接口
 *
 * @author yap
 * @since 2020-04-18 16:52:56
 */
public interface SaleandorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Saleandorder queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Saleandorder>selectAll();

    /**
     * 新增数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    Saleandorder insert(Saleandorder saleandorder);

    /**
     * 修改数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    Saleandorder update(Saleandorder saleandorder);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

}