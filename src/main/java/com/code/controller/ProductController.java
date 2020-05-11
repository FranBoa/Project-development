package com.code.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code.entity.Product;
import com.code.entity.Producttype;
import com.code.service.ProductService;
import com.github.pagehelper.PageInfo;

/**
 * (Product)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("product")
public class ProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProductService productService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Product selectOne(Integer id) {
        return this.productService.queryById(id);
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
           PageInfo<Product> pageInfo = this.productService.selectAllforPage(pageNum,pageSize);
           map.put("code",0);
           map.put("data",pageInfo.getList());
           map.put("count",pageInfo.getTotal());
        return map;
    }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public  Map<String,Object>   queryAll(@RequestParam(value = "page",defaultValue = "1") Integer pageNum,@RequestParam(value = "limit",defaultValue = "10") Integer pageSize,Product product) {
        Map<String,Object> map=new HashMap<>();
        PageInfo<Product> pageInfo=this.productService.queryAllforPage(pageNum,pageSize,product);
        System.out.println(product);
        map.put("code",0);
        map.put("data",pageInfo.getList());
        map.put("count",pageInfo.getTotal());
        return  map;
    }


    @RequestMapping("add")
    public String add(@RequestBody Product product) {
    	System.out.println(1234);
    	int result=this.productService.insert(product);
    	if (result>0) {
			return "<script> alert('添加成功') </script>";
		} else {
			return "<script> alert('添加失败') </script>";
		}
    }
    
   
    

}
