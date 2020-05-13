package com.code.service.impl;

import com.code.entity.Huiyuankai;
import com.code.dao.HuiyuankaiDao;
import com.code.service.HuiyuankaiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员卡信息表(Huiyuankai)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("huiyuankaiService")
public class HuiyuankaiServiceImpl implements HuiyuankaiService {
    @Resource
    private HuiyuankaiDao huiyuankaiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hid 主键
     * @return 实例对象
     */
    @Override
    public Huiyuankai queryById(int hid) {
        return this.huiyuankaiDao.queryById(hid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Huiyuankai> selectAll(){
        return this.huiyuankaiDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuankai 实例对象
     * @return 对象列表
     */
    @Override
   public List<Huiyuankai> queryAll(Huiyuankai huiyuankai){
          return  this.huiyuankaiDao.queryAll(huiyuankai);
    }

    /**
     * 新增数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Huiyuankai huiyuankai) {
        return this.huiyuankaiDao.insert(huiyuankai);
    }

    /**
     * 修改数据
     *
     * @param huiyuankai 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Huiyuankai huiyuankai) {
        return this.huiyuankaiDao.update(huiyuankai);
    }

    /**
     * 通过主键删除数据
     *
     * @param hid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int hid) {
        return this.huiyuankaiDao.deleteById(hid);
    }
}