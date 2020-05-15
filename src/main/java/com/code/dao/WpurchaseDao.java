package com.code.dao;

import com.code.entity.Wpurchase;

import java.util.List;

/**
 * (Purchase)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface WpurchaseDao {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
	Wpurchase queryById(Integer WpurchaseId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Wpurchase> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    List<Wpurchase> queryAll(Wpurchase Wpurchase);
    List<Wpurchase> queryBy(Wpurchase Wpurchase);

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int insert(Wpurchase Wpurchase);

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 影响行数
     */
    int update(Wpurchase Wpurchase);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 影响行数
     */
    int deleteById(Integer WpurchaseId);

	int addpd(Wpurchase wpurchase);

	int addp(Wpurchase wpurchase);

}