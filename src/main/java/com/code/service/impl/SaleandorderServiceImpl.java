package com.code.service.impl;

import com.code.entity.Saleandorder;
import com.code.dao.SaleandorderDao;
import com.code.service.SaleandorderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Saleandorder)表服务实现类
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
@Service("saleandorderService")
public class SaleandorderServiceImpl implements SaleandorderService {
    @Resource
    private SaleandorderDao saleandorderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sid 主键
     * @return 实例对象
     */
    @Override
    public Saleandorder queryById(Integer sid) {
        return this.saleandorderDao.queryById(sid);
    }

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    @Override
    public List<Saleandorder> selectAll(){
        return this.saleandorderDao.selectAll();
    }

    @Override
    public PageInfo<Saleandorder> selectAllForPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Saleandorder> list =this.saleandorderDao.selectAll();
        PageInfo<Saleandorder> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder 实例对象
     * @return 对象列表
     */
    @Override
   public List<Saleandorder> queryAll(Saleandorder saleandorder){
          return  this.saleandorderDao.queryAll(saleandorder);
    }

    /**
     * 新增数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    @Override
    public Saleandorder insert(Saleandorder saleandorder) {
        this.saleandorderDao.insert(saleandorder);
        return saleandorder;
    }

    /**
     * 修改数据
     *
     * @param saleandorder 实例对象
     * @return 实例对象
     */
    @Override
    public Saleandorder update(Saleandorder saleandorder) {
        this.saleandorderDao.update(saleandorder);
        return this.queryById(saleandorder.getSid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sid) {
        return this.saleandorderDao.deleteById(sid) > 0;
    }
}
