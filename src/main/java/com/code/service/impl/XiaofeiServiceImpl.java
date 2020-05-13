package com.code.service.impl;

import com.code.entity.Xiaofei;
import com.code.dao.XiaofeiDao;
import com.code.service.XiaofeiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员消费记录表(Xiaofei)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
@Service("xiaofeiService")
public class XiaofeiServiceImpl implements XiaofeiService {
    @Resource
    private XiaofeiDao xiaofeiDao;

    /**
     * 通过ID查询单条数据
     *
     * @param xid 主键
     * @return 实例对象
     */
    @Override
    public Xiaofei queryById(int xid) {
        return this.xiaofeiDao.queryById(xid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Xiaofei> selectAll(){
        return this.xiaofeiDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param xiaofei 实例对象
     * @return 对象列表
     */
    @Override
   public List<Xiaofei> queryAll(Xiaofei xiaofei){
          return  this.xiaofeiDao.queryAll(xiaofei);
    }

    /**
     * 新增数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Xiaofei xiaofei) {
        return this.xiaofeiDao.insert(xiaofei);
    }

    /**
     * 修改数据
     *
     * @param xiaofei 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Xiaofei xiaofei) {
        return this.xiaofeiDao.update(xiaofei);
    }

    /**
     * 通过主键删除数据
     *
     * @param xid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int xid) {
        return this.xiaofeiDao.deleteById(xid);
    }
}