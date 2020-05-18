package com.code.service.impl;

import com.code.entity.Supplier;
import com.code.entity.Warehouse;
import com.code.dao.SupplierDao;
import com.code.service.SupplierService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Supplier)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao supplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Supplier queryById(Integer sid) {
        return this.supplierDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Supplier> selectAll(){
        return this.supplierDao.selectAll();
    }

    public PageInfo<Supplier> selectAllForPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Supplier> list =this.supplierDao.selectAll();
        PageInfo<Supplier> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    /**
     * 通过实体作为筛选条件查询
     *
     * @param supplier 实例对象
     * @return 对象列表
     */
    @Override
   public List<Supplier> queryAll(Supplier supplier){
          return  this.supplierDao.queryAll(supplier);
    }

    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier insert(Supplier supplier) {
        this.supplierDao.insert(supplier);
        return supplier;
    }

    /**
     * 修改数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier update(Supplier supplier) {
        this.supplierDao.update(supplier);
        return this.queryById(supplier.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.supplierDao.deleteById(sid) > 0;
    }

	@Override
	public PageInfo<Supplier> selectAllforPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
        List<Supplier> list=this.supplierDao.selectAll();
        PageInfo<Supplier> pageInfo=new PageInfo<>(list);
		return pageInfo;
	}
}