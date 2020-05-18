package com.code.service;

import com.code.entity.Wpurchase;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Purchase)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
public interface WpurchaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
	Wpurchase queryById(Integer WpurchaseId);

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    List<Wpurchase>selectAll();

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    int insert(Wpurchase Wpurchase);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    List<Wpurchase> queryAll(Wpurchase Wpurchase);

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    int update(Wpurchase Wpurchase);

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    int deleteById(Integer WpurchaseId);

	int add(Wpurchase wpurchase);

	List<Wpurchase> queryBy(Wpurchase wpurchase);


    PageInfo<Wpurchase> queryAllForPage(int pageNum, int pageSize, Wpurchase wpurchase);

	PageInfo<Wpurchase> queryByForPage(int pageNum, int pageSize, Wpurchase wpurchase);

}
