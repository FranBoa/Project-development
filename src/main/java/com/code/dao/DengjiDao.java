package com.code.dao;

import com.code.entity.Dengji;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Dengji)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface DengjiDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param djid 主键
	 * @return 实例对象
	 */
	Dengji queryById(int djid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Dengji> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param dengji 实例对象
	 * @return 对象列表
	 */
	List<Dengji> queryAll(Dengji dengji);

	/**
	 * 新增数据
	 *
	 * @param dengji 实例对象
	 * @return 影响行数
	 */
	int insert(Dengji dengji);

	/**
	 * 修改数据
	 *
	 * @param dengji 实例对象
	 * @return 影响行数
	 */
	int update(Dengji dengji);

	/**
	 * 通过主键删除数据
	 *
	 * @param djid 主键
	 * @return 影响行数
	 */
	int deleteById(int djid);

}