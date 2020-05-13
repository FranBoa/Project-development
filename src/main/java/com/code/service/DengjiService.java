package com.code.service;

import com.code.entity.Dengji;
import java.util.List;

/**
 * (Dengji)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface DengjiService {

    /**
     * 通过ID查询单条数据
     *
     * @param djid 主键
     * @return 实例对象
     */
    Dengji queryById(int djid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Dengji>selectAll();

    /**
     * 新增数据
     *
     * @param dengji 实例对象
     * @return 实例对象
     */
    int insert(Dengji dengji);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param dengji 实例对象
     * @return 对象列表
     */
    List<Dengji> queryAll(Dengji dengji);

    /**
     * 修改数据
     *
     * @param dengji 实例对象
     * @return 实例对象
     */
    int update(Dengji dengji);

    /**
     * 通过主键删除数据
     *
     * @param djid 主键
     * @return 是否成功
     */
    int deleteById(int djid);

}