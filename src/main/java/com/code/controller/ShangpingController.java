package com.code.controller;

import com.code.entity.Purchase;
import com.code.entity.Shangping;
import com.code.service.ShangpingService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;

/**
 * (Shangping)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("shangping")
public class ShangpingController {
    /**
     * 服务对象
     */
    @Resource
    private ShangpingService shangpingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Shangping selectOne(String id) {
        return this.shangpingService.queryById(id);
    }
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public HashMap<String, Object> selectAll(){
    	HashMap<String, Object> map = new HashMap<>();
    	List<Shangping> list = this.shangpingService.selectAll();
    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
        return map;
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param shangping 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public HashMap<String, Object>  queryAll(Shangping shangping){
    	HashMap<String, Object> map = new HashMap<>();
    	List<Shangping> list = this.shangpingService.queryAll(shangping);
    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
        return map;
    }

}