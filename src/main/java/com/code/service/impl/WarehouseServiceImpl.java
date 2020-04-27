package com.code.service.impl;

import com.code.entity.Warehouse;
import com.code.dao.WarehouseDao;
import com.code.service.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Warehouse)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("warehouseService")
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseDao warehouseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param wid 主键
     * @return 实例对象
     */
    @Override
    public Warehouse queryById(Integer wid) {
        return this.warehouseDao.queryById(wid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Warehouse> selectAll(){
        return this.warehouseDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouse 实例对象
     * @return 对象列表
     */
    @Override
   public List<Warehouse> queryAll(Warehouse warehouse){
          return  this.warehouseDao.queryAll(warehouse);
    }

    /**
     * 新增数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Warehouse warehouse) {
       
        return  this.warehouseDao.insert(warehouse);
    }

    /**
     * 修改数据
     *
     * @param warehouse 实例对象
     * @return 实例对象
     */
    @Override
    public Warehouse update(Warehouse warehouse) {
        this.warehouseDao.update(warehouse);
        return this.queryById(warehouse.getWid());
    }

    /**
     * 通过主键删除数据
     *
     * @param wid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer wid) {
        return this.warehouseDao.deleteById(wid) > 0;
    }

	
}