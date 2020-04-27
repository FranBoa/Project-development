package com.code.service.impl;

import com.code.entity.Purchase;
import com.code.dao.PurchaseDao;
import com.code.service.PurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Purchase)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
    @Resource
    private PurchaseDao purchaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public Purchase queryById(Integer purchaseId) {
        return this.purchaseDao.queryById(purchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Purchase> selectAll(){
        return this.purchaseDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    @Override
   public List<Purchase> queryAll(Purchase purchase){
          return  this.purchaseDao.queryAll(purchase);
    }

    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public Purchase insert(Purchase purchase) {
        this.purchaseDao.insert(purchase);
        return purchase;
    }

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Purchase purchase) {
        return this.purchaseDao.update(purchase);
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer purchaseId) {
        return this.purchaseDao.deleteById(purchaseId) > 0;
    }
}