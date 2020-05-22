package com.code.dao;

import com.code.entity.Shangping;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Shangping)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface ShangpingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param spid 主键
     * @return 实例对象
     */
    Shangping queryById(int spid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Shangping> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param shangping 实例对象
     * @return 对象列表
     */
    List<Shangping> queryAll(Shangping shangping);

    /**
     * 新增数据
     *
     * @param shangping 实例对象
     * @return 影响行数
     */
    int insert(Shangping shangping);

    /**
     * 修改数据
     *
     * @param shangping 实例对象
     * @return 影响行数
     */
    int update(Shangping shangping);

    /**
     * 通过主键删除数据
     *
     * @param spid 主键
     * @return 影响行数
     */
    int deleteById(int spid);

}