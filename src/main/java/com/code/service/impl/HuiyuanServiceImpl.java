package com.code.service.impl;

import com.code.entity.Huiyuan;
import com.code.dao.HuiyuanDao;
import com.code.service.HuiyuanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Huiyuan)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("huiyuanService")
public class HuiyuanServiceImpl implements HuiyuanService {
    @Resource
    private HuiyuanDao huiyuanDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hyid 主键
     * @return 实例对象
     */
    @Override
    public Huiyuan queryById(int hyid) {
        return this.huiyuanDao.queryById(hyid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Huiyuan> selectAll(){
        return this.huiyuanDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuan 实例对象
     * @return 对象列表
     */
    @Override
   public List<Huiyuan> queryAll(Huiyuan huiyuan){
          return  this.huiyuanDao.queryAll(huiyuan);
    }

    /**
     * 新增数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Huiyuan huiyuan) {
        return this.huiyuanDao.insert(huiyuan);
    }

    /**
     * 修改数据
     *
     * @param huiyuan 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Huiyuan huiyuan) {
        return this.huiyuanDao.update(huiyuan);
    }

    /**
     * 通过主键删除数据
     *
     * @param hyid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int hyid) {
        return this.huiyuanDao.deleteById(hyid);
    }
}