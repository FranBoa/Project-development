package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Producttype;
import com.code.service.ProducttypeService;

/**
 * (Producttype)表控制层
 *
 * @author yap
 * @since 2020-04-29 16:11:31
 */
@RestController
@RequestMapping("producttype")
public class ProducttypeController {
    /**
     * 服务对象
     */
    @Resource
    private ProducttypeService producttypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Producttype selectOne(Integer id) {
        return this.producttypeService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public Map<String,Object> selectAll(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("data",this.producttypeService.selectAll());
        return map;
    }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param producttype 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Producttype>  queryAll(Producttype producttype){
           return this.producttypeService.queryAll(producttype);
    }
    
    @RequestMapping("getAll")
    public List<Producttype> getAll(){
    	List<Producttype> list = this.producttypeService.selectAll();
    	return list;
    }

}
