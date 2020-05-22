package com.code.service.impl;

import com.code.entity.Shangping;
import com.code.dao.ShangpingDao;
import com.code.service.ShangpingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Shangping)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Service("shangpingService")
public class ShangpingServiceImpl implements ShangpingService {
    @Resource
    private ShangpingDao shangpingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param spid 主键
     * @return 实例对象
     */
    @Override
    public Shangping queryById(int spid) {
        return this.shangpingDao.queryById(spid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Shangping> selectAll(){
        return this.shangpingDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param shangping 实例对象
     * @return 对象列表
     */
    @Override
   public List<Shangping> queryAll(Shangping shangping){
          return  this.shangpingDao.queryAll(shangping);
    }

    /**
     * 新增数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Shangping shangping) {
        return this.shangpingDao.insert(shangping);
    }

    /**
     * 修改数据
     *
     * @param shangping 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Shangping shangping) {
        return this.shangpingDao.update(shangping);
    }

    /**
     * 通过主键删除数据
     *
     * @param spid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int spid) {
        return this.shangpingDao.deleteById(spid);
    }
}