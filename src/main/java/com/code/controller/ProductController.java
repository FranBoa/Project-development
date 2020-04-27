package com.code.controller;

import com.code.entity.Product;
import com.code.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    public List<Product> selectAll(){
           return this.productService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param product 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Product>  queryAll(Product product){
           return this.productService.queryAll(product);
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