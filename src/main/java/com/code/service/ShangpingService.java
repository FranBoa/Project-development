package com.code.service;

import com.code.entity.Shangping;
import java.util.List;

/**
 * (Shangping)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface ShangpingService {

    /**
     * 通过ID查询单条数据
     *
     * @param spid 主键
     * @return 实例对象
     */
    Shangping queryById(int spid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Shangping>selectAll();

    /**
     * 新增数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    int insert(Shangping shangping);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param shangping 实例对象
     * @return 对象列表
     */
    List<Shangping> queryAll(Shangping shangping);

    /**
     * 修改数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    int update(Shangping shangping);

    /**
     * 通过主键删除数据
     *
     * @param spid 主键
     * @return 是否成功
     */
    int deleteById(int spid);

}