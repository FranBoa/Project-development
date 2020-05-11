package com.code.dao;

import com.code.entity.Warehouse;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Warehouse)表数据库访问层
 *
 * @author yap
 * @since 2020-05-01 20:50:03
 */
public interface WarehouseDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param wid 主键
	 * @return 实例对象
	 */
	Warehouse queryById(Integer wid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Warehouse> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param warehouse 实例对象
	 * @return 对象列表
	 */
	List<Warehouse> queryAll(Warehouse warehouse);

	/**
	 * 新增数据
	 *
	 * @param warehouse 实例对象
	 * @return 影响行数
	 */
	int insert(Warehouse warehouse);

	/**
	 * 修改数据
	 *
	 * @param warehouse 实例对象
	 * @return 影响行数
	 */
	int update(Warehouse warehouse);

	/**
	 * 通过主键删除数据
	 *
	 * @param wid 主键
	 * @return 影响行数
	 */
	int deleteById(Integer wid);

}