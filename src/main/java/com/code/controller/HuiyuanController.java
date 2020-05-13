package com.code.controller;

import com.code.entity.Huiyuan;
import com.code.service.HuiyuanService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * (Huiyuan)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("huiyuan")
public class HuiyuanController {
    /**
     * 服务对象
     */
    @Resource
    private HuiyuanService huiyuanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public Huiyuan queryById(int hyid) {
    	Huiyuan huiyuan=this.huiyuanService.queryById(hyid);
        return huiyuan;
    }
    
   //修改后
    @RequestMapping("/updatehy")
	public @ResponseBody String updatehy(HttpServletRequest request, Huiyuan huiyuan){
		int row = this.huiyuanService.update(huiyuan);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Huiyuan> selectAll(){
           return this.huiyuanService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuan 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String, Object>  queryAll(Huiyuan huiyuan){
    	System.out.println(huiyuan);
    	List<Huiyuan> list=this.huiyuanService.queryAll(huiyuan);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
   //添加
    @RequestMapping(value="/inserthy",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String inserthy(HttpServletRequest request, Huiyuan huiyuan) {
		int row=this.huiyuanService.insert(huiyuan);
		return row>0?"添加成功":"添加失败";
	}
    
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int hyid) {
  		int row=this.huiyuanService.deleteById(hyid);
  		return row>0?"删除成功":"删除失败";
  	}

}