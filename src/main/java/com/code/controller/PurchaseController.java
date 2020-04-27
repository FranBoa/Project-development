package com.code.controller;

import org.springframework.web.bind.annotation.*;

import com.code.entity.Purchase;
import com.code.service.PurchaseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * (Purchase)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("purchase")
public class PurchaseController {
    /**
     * 服务对象
     */
    @Resource
    private PurchaseService purchaseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Purchase selectOne(Integer id) {
        return this.purchaseService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    @ResponseBody 
    public HashMap<String, Object> selectAll(){

    	HashMap<String, Object> map = new HashMap<>();
    	List<Purchase> list = this.purchaseService.selectAll();
    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
        return map;
    }
        /**
         * 通过实体作为筛选条件查询
     *
     * @param purchase 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public HashMap<String, Object>  queryAll(Purchase purchase){
    	HashMap<String, Object> map = new HashMap<>();
    	List<Purchase> list = this.purchaseService.queryAll(purchase);
    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
        return map;
    }
    
	    /**
	     * 通过实体作为修改条件
	 *
	 * @param purchase 实例对象
	 * @return 对象列表
	 */
	@RequestMapping("update")
	public int  update(Purchase purchase){
		int b = this.purchaseService.update(purchase);
	    return b;
	}
	
	}