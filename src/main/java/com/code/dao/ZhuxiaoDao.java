package com.code.dao;

import com.code.entity.Zhuxiao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员卡注销表(Zhuxiao)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface ZhuxiaoDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param zid 主键
	 * @return 实例对象
	 */
	Zhuxiao queryById(int zid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Zhuxiao> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param zhuxiao 实例对象
	 * @return 对象列表
	 */
	List<Zhuxiao> queryAll(Zhuxiao zhuxiao);

	/**
	 * 新增数据
	 *
	 * @param zhuxiao 实例对象
	 * @return 影响行数
	 */
	int insert(Zhuxiao zhuxiao);

	/**
	 * 修改数据
	 *
	 * @param zhuxiao 实例对象
	 * @return 影响行数
	 */
	int update(Zhuxiao zhuxiao);

	/**
	 * 通过主键删除数据
	 *
	 * @param zid 主键
	 * @return 影响行数
	 */
	int deleteById(int zid);

}