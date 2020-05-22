package com.code.controller;

import com.alibaba.fastjson.JSONArray;
import com.code.entity.Dengji;
import com.code.service.DengjiService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (Dengji)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("dengji")
public class DengjiController {
    /**
     * 服务对象
     */
    @Resource
    private DengjiService dengjiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("loadupdatedj")
    public ModelAndView queryById(int djid) {
    	Dengji dengji=this.dengjiService.queryById(djid);
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("dengji", dengji);
		mv.setViewName("member-DengJi-edit");
        return mv;
    }
    
   //修改后
    @RequestMapping("/updatedj")
	public @ResponseBody String updatedj(Dengji dengji){
		int row = this.dengjiService.update(dengji);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Dengji> selectAll(){
           return this.dengjiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param dengji 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String, Object>  queryAll(Dengji dengji){
    	System.out.println(dengji);
    	List<Dengji> list=this.dengjiService.queryAll(dengji);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
    //下拉框绑定
  	@RequestMapping("/Menubangding")
  	@ResponseBody
  	public void Menubangding(HttpServletResponse response) throws IOException {
  		response.setContentType("text/html;charset=utf-8");
  		List<Dengji> list = dengjiService.selectAll();
  		String str = JSONArray.toJSONString(list);
  		PrintWriter out = response.getWriter();
  		out.print(str);
  		out.flush();
  		out.close();
  	}
    
    //添加
    @RequestMapping("/insertdj")
	public @ResponseBody  String insertdj(Dengji dengji) {
		int row=this.dengjiService.insert(dengji);
		return row>0?"添加成功":"添加失败";
	}
   
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int djid) {
  		int row=this.dengjiService.deleteById(djid);
  		return row>0?"删除成功":"删除失败";
  	}

}