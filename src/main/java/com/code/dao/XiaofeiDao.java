package com.code.dao;

import com.code.entity.Xiaofei;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员消费记录表(Xiaofei)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
public interface XiaofeiDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param xid 主键
	 * @return 实例对象
	 */
	Xiaofei queryById(int xid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Xiaofei> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param xiaofei 实例对象
	 * @return 对象列表
	 */
	List<Xiaofei> queryAll(Xiaofei xiaofei);

	/**
	 * 新增数据
	 *
	 * @param xiaofei 实例对象
	 * @return 影响行数
	 */
	int insert(Xiaofei xiaofei);

	/**
	 * 修改数据
	 *
	 * @param xiaofei 实例对象
	 * @return 影响行数
	 */
	int update(Xiaofei xiaofei);

	/**
	 * 通过主键删除数据
	 *
	 * @param xid 主键
	 * @return 影响行数
	 */
	int deleteById(int xid);

}