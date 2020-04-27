package com.code.service.impl;

import com.code.entity.Category;
import com.code.dao.CategoryDao;
import com.code.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户类别(Category)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryDao categoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public Category queryById(String cid) {
        return this.categoryDao.queryById(cid);
    }

    /**
     * 查询多条数据
     *
     * @param 
     * @param 
     * @return 对象列表
     */
    @Override
    public List<Category> selectAll(){
        return this.categoryDao.selectAll();
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param category 实例对象
     * @return 对象列表
     */
    @Override
   public List<Category> queryAll(Category category){
          return  this.categoryDao.queryAll(category);
    }

    /**
     * 新增数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Category category) {
        return this.categoryDao.insert(category);
    }

    /**
     * 修改数据
     *
     * @param category 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Category category) {
        return this.categoryDao.update(category);
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int cid) {
        return this.categoryDao.deleteById(cid);
    }
}