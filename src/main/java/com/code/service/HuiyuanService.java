package com.code.service;

import com.code.entity.Huiyuan;
import java.util.List;

/**
 * (Huiyuan)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface HuiyuanService {

    /**
     * 通过ID查询单条数据
     *
     * @param hyid 主键
     * @return 实例对象
     */
    Huiyuan queryById(int hyid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Huiyuan>selectAll();

    /**
     * 新增数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    int insert(Huiyuan huiyuan);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuan 实例对象
     * @return 对象列表
     */
    List<Huiyuan> queryAll(Huiyuan huiyuan);

    /**
     * 修改数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    int update(Huiyuan huiyuan);

    /**
     * 通过主键删除数据
     *
     * @param hyid 主键
     * @return 是否成功
     */
    int deleteById(int hyid);

}