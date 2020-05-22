package com.code.service;

import com.code.entity.Relatedsaleandorder;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Relatedsaleandorder)表服务接口
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public interface RelatedsaleandorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Relatedsaleandorder queryById(Integer sid);

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    List<Relatedsaleandorder>selectAll();

    /**
     * 新增数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder insert(Relatedsaleandorder relatedsaleandorder);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder 实例对象
     * @return 对象列表
     */
    List<Relatedsaleandorder> queryAll(Relatedsaleandorder relatedsaleandorder);

    PageInfo<Relatedsaleandorder> queryAllforPage(int pageNum, int pageSize, Relatedsaleandorder relatedsaleandorder);

    /**
     * 修改数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 实例对象
     */
    Relatedsaleandorder update(Relatedsaleandorder relatedsaleandorder);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sid);

    boolean deleteByOrderNumber(String ordernumber);

}
