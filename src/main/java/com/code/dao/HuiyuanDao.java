package com.code.dao;

import com.code.entity.Huiyuan;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Huiyuan)表数据库访问层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface HuiyuanDao {

	/**
	 * 通过ID查询单条数据
	 *
	 * @param hyid 主键
	 * @return 实例对象
	 */
	Huiyuan queryById(int hyid);

	/**
	 * 查询指定行数据
	 *
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return 对象列表
	 */
	List<Huiyuan> selectAll();

	/**
	 * 通过实体作为筛选条件查询
	 *
	 * @param huiyuan 实例对象
	 * @return 对象列表
	 */
	List<Huiyuan> queryAll(Huiyuan huiyuan);

	/**
	 * 新增数据
	 *
	 * @param huiyuan 实例对象
	 * @return 影响行数
	 */
	int insert(Huiyuan huiyuan);

	/**
	 * 修改数据
	 *
	 * @param huiyuan 实例对象
	 * @return 影响行数
	 */
	int update(Huiyuan huiyuan);

	/**
	 * 通过主键删除数据
	 *
	 * @param hyid 主键
	 * @return 影响行数
	 */
	int deleteById(int hyid);

	//修改密码
	int pwdORrepass(int hyid, String pwd, String repass);
}
