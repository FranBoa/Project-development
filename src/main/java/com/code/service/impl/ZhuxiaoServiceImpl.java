package com.code.service.impl;

import com.code.entity.Zhuxiao;
import com.code.dao.ZhuxiaoDao;
import com.code.service.ZhuxiaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员卡注销表(Zhuxiao)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("zhuxiaoService")
public class ZhuxiaoServiceImpl implements ZhuxiaoService {
    @Resource
    private ZhuxiaoDao zhuxiaoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param zid 主键
     * @return 实例对象
     */
    @Override
    public Zhuxiao queryById(int zid) {
        return this.zhuxiaoDao.queryById(zid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Zhuxiao> selectAll(){
        return this.zhuxiaoDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param zhuxiao 实例对象
     * @return 对象列表
     */
    @Override
   public List<Zhuxiao> queryAll(Zhuxiao zhuxiao){
          return  this.zhuxiaoDao.queryAll(zhuxiao);
    }

    /**
     * 新增数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Zhuxiao zhuxiao) {
        return this.zhuxiaoDao.insert(zhuxiao);
    }

    /**
     * 修改数据
     *
     * @param zhuxiao 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Zhuxiao zhuxiao) {
        return this.zhuxiaoDao.update(zhuxiao);
    }

    /**
     * 通过主键删除数据
     *
     * @param zid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int zid) {
        return this.zhuxiaoDao.deleteById(zid);
    }
}