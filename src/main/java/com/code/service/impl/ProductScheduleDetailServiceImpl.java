package com.code.service.impl;

import com.code.dao.ProductScheduleDetailDao;
import com.code.entity.ProductSchedule;
import com.code.entity.ProductScheduleDetail;
import com.code.entity.Wpurchase;
import com.code.service.ProductScheduleDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Productscheduledetail)表服务实现类
 *
 * @author makejava
 * @since 2020-05-22 08:45:33
 */
@Service("productscheduledetailService")
public class ProductScheduleDetailServiceImpl implements ProductScheduleDetailService {
    @Resource
    private ProductScheduleDetailDao productscheduledetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ProductScheduleDetail queryById(Integer id) {
        return this.productscheduledetailDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public PageInfo<ProductScheduleDetail> queryAllByLimit(int pageSize, int pageNum, ProductScheduleDetail psd) {
        PageHelper.startPage(pageNum,pageSize);
        List<ProductScheduleDetail> list = this.productscheduledetailDao.queryAll(psd);
        PageInfo<ProductScheduleDetail> pageinfo=new PageInfo<>(list);
        return pageinfo;
    }

    @Override
    public List<ProductScheduleDetail> queryAll(ProductScheduleDetail psd) {
        List<ProductScheduleDetail> list = this.productscheduledetailDao.queryAll(psd);
        return list;
    }

    /**
     * 新增数据
     *
     * @param productscheduledetail 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(ProductScheduleDetail productscheduledetail) {
        return this.productscheduledetailDao.insert(productscheduledetail);
    }

    /**
     * 修改数据
     *
     * @param productscheduledetail 实例对象
     * @return 实例对象
     */
    @Override
    public int update(ProductScheduleDetail productscheduledetail) {
        return this.productscheduledetailDao.update(productscheduledetail);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.productscheduledetailDao.deleteById(id);
    }
}