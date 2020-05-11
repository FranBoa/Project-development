package com.code.controller;

import com.code.entity.Warehouse;
import com.code.service.WarehouseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

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
    public List<Warehouse> selectAll(){
           return this.warehouseService.selectAll();
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

}