package com.code.service.impl;

import com.code.entity.Product;
import com.code.entity.Relatedsaleandorder;
import com.code.entity.Wpurchase;
import com.code.dao.ProductDao;
import com.code.dao.WpurchaseDao;
import com.code.service.WpurchaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * (Purchase)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Service("WpurchaseService")
public class WpurchaseServiceImpl implements WpurchaseService {
    @Resource
    private WpurchaseDao WpurchaseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param purchaseId 主键
     * @return 实例对象
     */
    @Override
    public Wpurchase queryById(Integer WpurchaseId) {
        return this.WpurchaseDao.queryById(WpurchaseId);
    }

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    @Override
    public List<Wpurchase> selectAll(){
        return this.WpurchaseDao.selectAll();
    }


    /**
     * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    @Override
   public List<Wpurchase> queryAll(Wpurchase purchase){
          return  this.WpurchaseDao.queryAll(purchase);
    }

	@Override
	public PageInfo<Wpurchase> queryAllForPage(int pageNum, int pageSize, Wpurchase wpurchase) {
        PageHelper.startPage(pageNum,pageSize);
		List<Wpurchase> list = this.WpurchaseDao.queryAll(wpurchase);
	    PageInfo<Wpurchase> pageinfo=new PageInfo<>(list);
	    return pageinfo;
	}
    /**
     * 新增数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Wpurchase Wpurchase) {
        return this.WpurchaseDao.insert(Wpurchase);
    }

    /**
     * 修改数据
     *
     * @param purchase 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Wpurchase Wpurchase) {
    	return this.WpurchaseDao.update(Wpurchase);
    }

    /**
     * 通过主键删除数据
     *
     * @param purchaseId 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer WpurchaseId) {
        return this.WpurchaseDao.deleteById(WpurchaseId);
    }

	@Override
	public int add(Wpurchase wpurchase) {
		//添加购货单
		int a = this.WpurchaseDao.addp(wpurchase);
		//添加购货详细单
		int b = this.WpurchaseDao.addpd(wpurchase);
		if(a==b) {
		return 1;
		}else {
		return 0;
		}
		}

	@Override
	public List<Wpurchase> queryBy(Wpurchase wpurchase) {
		return this.queryBy(wpurchase);
	}

	@Override
	public PageInfo<Wpurchase> queryByForPage(int pageNum, int pageSize, Wpurchase wpurchase) {
		List<Wpurchase> list = this.WpurchaseDao.queryBy(wpurchase);
	    PageInfo<Wpurchase> pageinfo=new PageInfo<>(list);
	    return pageinfo;
	}
}
