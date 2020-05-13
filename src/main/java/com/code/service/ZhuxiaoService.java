package com.code.service;

import com.code.entity.Zhuxiao;
import java.util.List;

/**
 * 会员卡注销表(Zhuxiao)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface ZhuxiaoService {

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    Zhuxiao queryById(int zid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Zhuxiao>selectAll();

    /**
     * 新增数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    int insert(Zhuxiao zhuxiao);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param zhuxiao 实例对象
     * @return 对象列表
     */
    List<Zhuxiao> queryAll(Zhuxiao zhuxiao);

    /**
     * 修改数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    int update(Zhuxiao zhuxiao);

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 是否成功
     */
    int deleteById(int zid);

}