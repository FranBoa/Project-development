package com.code.service;

import com.code.entity.Huiyuankai;
import java.util.List;

/**
 * 会员卡信息表(Huiyuankai)表服务接口
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
public interface HuiyuankaiService {

    /**
     * 通过ID查询单条数据
     *
     * @param hid 主键
     * @return 实例对象
     */
    Huiyuankai queryById(int hid);

    /**
     * 查询多条数据
     *
     * @param 
     * @param
     * @return 对象列表
     */
    List<Huiyuankai>selectAll();

    /**
     * 新增数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    int insert(Huiyuankai huiyuankai);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuankai 实例对象
     * @return 对象列表
     */
    List<Huiyuankai> queryAll(Huiyuankai huiyuankai);

    /**
     * 修改数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    int update(Huiyuankai huiyuankai);

    /**
     * 通过主键删除数据
     *
     * @param hid 主键
     * @return 是否成功
     */
    int deleteById(int hid);

}