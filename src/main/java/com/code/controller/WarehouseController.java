package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Product;
import com.code.entity.Warehouse;
import com.code.service.WarehouseService;
import com.github.pagehelper.PageInfo;

/**
 * (Warehouse)表控制层
 *
 * @author yap
 * @since 2020-05-01 20:50:03
 */
@RestController
@RequestMapping("warehouse")
public class WarehouseController {
    /**
     * 服务对象
     */
    @Resource
    private WarehouseService warehouseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Warehouse selectOne(Integer id) {
        return this.warehouseService.queryById(id);
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
         PageInfo<Warehouse> pageInfo = this.warehouseService.selectAllforPage(pageNum,pageSize);
         map.put("code",0);
         map.put("data",pageInfo.getList());
         map.put("count",pageInfo.getTotal());
           return map;
    }
    
    @RequestMapping("selectBywname")
    public Map<String,Object> selectBypname(String wname, @RequestParam(value = "page",defaultValue = "1") Integer pageNum,@RequestParam(value = "limit",defaultValue = "10") Integer pageSize) {
    	System.out.println(wname);
    	Map<String,Object> map=new HashMap<>();
        PageInfo<Warehouse> pageInfo = this.warehouseService.selectBypname(wname,pageNum,pageSize);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return map;
    }
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouse 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Warehouse>  queryAll(Warehouse warehouse){
           return this.warehouseService.queryAll(warehouse);
    }
    
    @RequestMapping("add")
    public String add(Warehouse warehouse) {
    	int result=this.warehouseService.insert(warehouse);
    	if (result>0) {
			return "1";
		} else {
			return "0";
		}
    }
    
    @RequestMapping("delAll")
	public String delAll(@RequestParam(value = "wids") String[] wids) {
    	int count = 0;
    	for (int i = 0; i < wids.length; i++) {
    		int wid = Integer.parseInt(wids[i]);
    		boolean result = this.warehouseService.deleteById(wid);
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
    @RequestMapping("update")
    public String update(Warehouse warehouse) {
    	int result = this.warehouseService.update(warehouse);
    	if (result>0) {
			return "1";
		} else {
			return "0";
		}
    }

}	