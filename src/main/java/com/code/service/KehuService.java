package com.code.service;

import com.code.entity.Kehu;
import java.util.List;

/**
 * (Kehu)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface KehuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Kehu queryById(int id);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Kehu>selectAll();

    /**
     * 新增数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    int insert(Kehu kehu);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param kehu 实例对象
     * @return 对象列表
     */
    List<Kehu> queryAll(Kehu kehu);

    /**
     * 修改数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    int update(Kehu kehu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(int id);

}