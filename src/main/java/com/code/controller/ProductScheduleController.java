package com.code.controller;

import com.code.entity.ProductSchedule;
import com.code.entity.Wpurchase;
import com.code.service.ProductScheduleService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (Productschedule)表控制层
 *
 * @author makejava
 * @since 2020-05-22 08:35:08
 */
@RestController
@RequestMapping("productschedule")
public class ProductScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private ProductScheduleService psService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("selectOne")
    public ProductSchedule selectOne(String id) {
        return this.psService.queryById(id);
    }

    @RequestMapping("selectAll")
    public  HashMap<String,Object> selectAll(@RequestParam(value ="page" ,defaultValue = "1") int pageNum,@RequestParam(value = "limit",defaultValue = "10") int pageSize, ProductSchedule ps) {

        HashMap<String,Object> map = new HashMap<>();
        PageInfo<ProductSchedule> pageInfo = this.psService.queryAllByLimit(pageSize,pageNum,ps);
        System.out.println(pageInfo);
        map.put("data",pageInfo.getList());
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        return map;
    }

}