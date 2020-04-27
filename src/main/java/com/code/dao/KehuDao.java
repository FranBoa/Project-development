package com.code.dao;

import com.code.entity.Kehu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Kehu)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface KehuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Kehu queryById(int id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Kehu> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param kehu 实例对象
     * @return 对象列表
     */
    List<Kehu> queryAll(Kehu kehu);

    /**
     * 新增数据
     *
     * @param kehu 实例对象
     * @return 影响行数
     */
    int insert(Kehu kehu);

    /**
     * 修改数据
     *
     * @param kehu 实例对象
     * @return 影响行数
     */
    int update(Kehu kehu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(int id);

}