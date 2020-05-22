package com.code.service.impl;

import com.code.dao.ProductScheduleDao;
import com.code.entity.ProductSchedule;
import com.code.entity.Wpurchase;
import com.code.service.ProductScheduleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (Productschedule)表服务实现类
 *
 * @author makejava
 * @since 2020-05-22 08:35:08
 */
@Service("ProductScheduleService")
public class ProductScheduleServiceImpl implements ProductScheduleService {
    @Resource
    private ProductScheduleDao productscheduleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param psid 主键
     * @return 实例对象
     */
    @Override
    public ProductSchedule queryById(String psid) {
        return this.productscheduleDao.queryById(psid);
    }

    @Override
    public List<ProductSchedule> queryAll(ProductSchedule ps) {
        return this.productscheduleDao.queryAll(ps);
    }

    /**
     * 查询多条数据
     *
     * @param pageSize 查询起始位置
     * @param pageNum 查询条数
     * @return 对象列表
     */
    @Override
    public PageInfo<ProductSchedule> queryAllByLimit(int pageSize,int pageNum, ProductSchedule ps) {
        HashMap<String,Object> hashMap = new HashMap<String, Object>();
        List<ProductSchedule> list = this.productscheduleDao.queryAll(ps);
        PageInfo<ProductSchedule> pageinfo=new PageInfo<>(list);
        return pageinfo;
    }
    /**
     * 新增数据
     *
     * @param productschedule 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(ProductSchedule productschedule) {

        return this.productscheduleDao.insert(productschedule);
    }

    /**
     * 修改数据
     *
     * @param productschedule 实例对象
     * @return 实例对象
     */
    @Override
    public int update(ProductSchedule productschedule) {
        return this.productscheduleDao.update(productschedule);
    }

    /**
     * 通过主键删除数据
     *
     * @param psid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String psid) {
        return this.productscheduleDao.deleteById(psid) > 0;
    }
}