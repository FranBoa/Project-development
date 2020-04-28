package com.code.controller;

import com.code.entity.Producttype;
import com.code.service.ProducttypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Producttype)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
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
    @ResponseBody
    public List<Producttype> selectAll(){
           return this.producttypeService.selectAll();
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

}