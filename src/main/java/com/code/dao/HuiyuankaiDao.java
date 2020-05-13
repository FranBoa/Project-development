package com.code.dao;

import com.code.entity.Huiyuankai;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 会员卡信息表(Huiyuankai)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface HuiyuankaiDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param hid 主键
	 * @return 实例对象
	 */
	Huiyuankai queryById(int hid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Huiyuankai> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param huiyuankai 实例对象
	 * @return 对象列表
	 */
	List<Huiyuankai> queryAll(Huiyuankai huiyuankai);

	/**
	 * 新增数据
	 *
	 * @param huiyuankai 实例对象
	 * @return 影响行数
	 */
	int insert(Huiyuankai huiyuankai);

	/**
	 * 修改数据
	 *
	 * @param huiyuankai 实例对象
	 * @return 影响行数
	 */
	int update(Huiyuankai huiyuankai);

	/**
	 * 通过主键删除数据
	 *
	 * @param hid 主键
	 * @return 影响行数
	 */
	int deleteById(int hid);

}