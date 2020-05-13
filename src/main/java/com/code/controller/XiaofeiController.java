package com.code.controller;

import com.code.entity.Xiaofei;
import com.code.service.XiaofeiService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 会员消费记录表(Xiaofei)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:41
 */
@RestController
@RequestMapping("xiaofei")
public class XiaofeiController {
    /**
     * 服务对象
     */
    @Resource
    private XiaofeiService xiaofeiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public Xiaofei queryById(int xid) {
    	Xiaofei xiaofei=this.xiaofeiService.queryById(xid);
        return xiaofei;
    }
    
    //修改后
    @RequestMapping("/updatexf")
	public @ResponseBody String updatexf(HttpServletRequest request, Xiaofei xiaofei){
		int row = this.xiaofeiService.update(xiaofei);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Xiaofei> selectAll(){
           return this.xiaofeiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param xiaofei 实例对象
         * @return 
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public  Map<String, Object> queryAll(Xiaofei xiaofei){
    	List<Xiaofei> list=this.xiaofeiService.queryAll(xiaofei);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
  //添加
    @RequestMapping(value="/insertxf",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String insertxf(HttpServletRequest request, Xiaofei xiaofei) {
		int row=this.xiaofeiService.insert(xiaofei);
		return row>0?"添加成功":"添加失败";
	}
   
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int xid) {
  		int row=this.xiaofeiService.deleteById(xid);
  		return row>0?"删除成功":"删除失败";
  	}


}