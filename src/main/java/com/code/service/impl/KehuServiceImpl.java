package com.code.service.impl;

import com.code.entity.Kehu;
import com.code.entity.Saleandorder;
import com.code.dao.KehuDao;
import com.code.service.KehuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Kehu)表服务实现类
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@Service("kehuService")
public class KehuServiceImpl implements KehuService {
    @Resource
    private KehuDao kehuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Kehu queryById(int id) {
        return this.kehuDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param
     * @param
     * @return 对象列表
     */
    @Override
    public List<Kehu> selectAll(){
        return this.kehuDao.selectAll();
    }

    @Override
	public PageInfo<Kehu> selectAllForPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		  List<Kehu> list =this.kehuDao.selectAll();
	        PageInfo<Kehu> pageInfo = new PageInfo<>(list);
	        return pageInfo;
	}

    /**
     * 新增数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Kehu kehu) {
        return this.kehuDao.insert(kehu);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @Override
    public List<Kehu> queryAll(Kehu Kehu) {
        return  this.kehuDao.queryAll(Kehu);
    }


    /**
     * 修改数据
     *
     * @param kehu 实例对象
     * @return 实例对象
     */
    @Override
    public int update(Kehu kehu) {
        return this.kehuDao.update(kehu);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(int id) {
		return this.kehuDao.deleteById(id);
    }


}
