package com.code.service.impl;

import com.code.entity.Producttype;
import com.code.dao.ProducttypeDao;
import com.code.service.ProducttypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Producttype)表服务实现类
 *
 * @author yap
 * @since 2020-04-29 16:11:31
 */
@Service("producttypeService")
public class ProducttypeServiceImpl implements ProducttypeService {
    @Resource
    private ProducttypeDao producttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param producttypeid 主键
     * @return 实例对象
     */
    @Override
    public Producttype queryById(Integer producttypeid) {
        return this.producttypeDao.queryById(producttypeid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Producttype> selectAll(){
        return this.producttypeDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param producttype 实例对象
     * @return 对象列表
     */
    @Override
   public List<Producttype> queryAll(Producttype producttype){
          return  this.producttypeDao.queryAll(producttype);
    }

    /**
     * 新增数据
     *
     * @param producttype 实例对象
     * @return 实例对象
     */
    @Override
    public Producttype insert(Producttype producttype) {
        this.producttypeDao.insert(producttype);
        return producttype;
    }

    /**
     * 修改数据
     *
     * @param producttype 实例对象
     * @return 实例对象
     */
    @Override
    public Producttype update(Producttype producttype) {
        this.producttypeDao.update(producttype);
        return this.queryById(producttype.getProducttypeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param producttypeid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer producttypeid) {
        return this.producttypeDao.deleteById(producttypeid) > 0;
    }
}