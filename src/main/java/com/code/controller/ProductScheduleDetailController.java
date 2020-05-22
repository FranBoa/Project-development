package com.code.controller;

import com.code.entity.ProductSchedule;
import com.code.entity.ProductScheduleDetail;
import com.code.service.ProductScheduleDetailService;
import com.code.service.ProductScheduleService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (Productscheduledetail)表控制层
 *
 * @author makejava
 * @since 2020-05-22 08:45:33
 */
@RestController
@RequestMapping("productscheduledetail")
public class ProductScheduleDetailController {

    @Resource
    private ProductScheduleDetailService psdService;
    /**
     * 服务对象
     */
    @Resource
    private ProductScheduleDetailService productscheduledetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ProductScheduleDetail selectOne(Integer id) {
        return this.productscheduledetailService.queryById(id);
    }

    @RequestMapping("selectAll")
    public HashMap<String,Object> selectAll(@RequestParam(value ="page" ,defaultValue = "1") int pageNum, @RequestParam(value = "limit",defaultValue = "10") int pageSize, ProductScheduleDetail ps) {

        HashMap<String,Object> map = new HashMap<>();
        PageInfo<ProductScheduleDetail> pageInfo = this.psdService.queryAllByLimit(pageSize,pageNum,ps);
        System.out.println(pageInfo);
        map.put("data",pageInfo.getList());
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        return map;
    }
}