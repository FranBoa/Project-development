package com.code.controller;

import com.code.entity.Supplier;
import com.code.service.SupplierService;
import com.github.pagehelper.PageInfo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * (Supplier)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("supplier")
public class SupplierController {
    /**
     * 服务对象
     */
    @Resource
    private SupplierService supplierService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Supplier selectOne(Integer id) {
        return this.supplierService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public Map<String,Object> selectAll(@RequestParam(value = "page",defaultValue = "1") Integer pageNum,@RequestParam(value = "limit",defaultValue = "10") Integer pageSize){
    	 Map<String,Object> map=new HashMap<>();
         PageInfo<Supplier> pageInfo = this.supplierService.selectAllforPage(pageNum,pageSize);
         map.put("code",0);
         map.put("data",pageInfo.getList());
         map.put("count",pageInfo.getTotal());
    	return map;
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param supplier 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Supplier>  queryAll(Supplier supplier){
           return this.supplierService.queryAll(supplier);
    }
    
    /*
     * 删除
     * */
    @RequestMapping("delbyID")
    public boolean delbyID(int sid) {
    	return this.supplierService.deleteById(sid);
    }
    
    @RequestMapping("delAll")
   	public String delAll(@RequestParam(value = "sids") String[] sids) {
       	int count = 0;
       	for (int i = 0; i < sids.length; i++) {
       		int sid = Integer.parseInt(sids[i]);
       		boolean result = this.supplierService.deleteById(sid);
       		if (result) {
       			count=1;
   			}else {
   				count=0;
   			}
   		}
       	if (count>0) {
       		return "1";
   		} else {
   			return "0";
   		}
   	    }
}