package com.code.dao;

import com.code.entity.Relatedsaleandorder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Relatedsaleandorder)表数据库访问层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
public interface RelatedsaleandorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    Relatedsaleandorder queryById(Integer sid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Relatedsaleandorder> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder 实例对象
     * @return 对象列表
     */
    List<Relatedsaleandorder> queryAll(Relatedsaleandorder relatedsaleandorder);

    /**
     * 新增数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 影响行数
     */
    int insert(Relatedsaleandorder relatedsaleandorder);

    /**
     * 修改数据
     *
     * @param relatedsaleandorder 实例对象
     * @return 影响行数
     */
    int update(Relatedsaleandorder relatedsaleandorder);

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 影响行数
     */
    int deleteById(Integer sid);

    boolean deleteByOrderNumber(String ordernumber);

}
