package com.code.controller;

import com.code.entity.Huiyuankai;
import com.code.service.HuiyuankaiService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 会员卡信息表(Huiyuankai)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("huiyuankai")
public class HuiyuankaiController {
    /**
     * 服务对象
     */
    @Resource
    private HuiyuankaiService huiyuankaiService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public Huiyuankai queryById(int hid) {
    	Huiyuankai huiyuankai=this.huiyuankaiService.queryById(hid);
        return huiyuankai;
    }
    
   //修改后
    @RequestMapping("/updatehyk")
	public @ResponseBody String updatehyk(HttpServletRequest request, Huiyuankai huiyuankai){
		int row = this.huiyuankaiService.update(huiyuankai);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Huiyuankai> selectAll(){
           return this.huiyuankaiService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param huiyuankai 实例对象
         * @return 
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public  Map<String, Object> queryAll(Huiyuankai huiyuankai){
    	List<Huiyuankai> list=this.huiyuankaiService.queryAll(huiyuankai);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
  //添加
    @RequestMapping(value="/inserthyk",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String inserthyk(HttpServletRequest request, Huiyuankai huiyuankai) {
		int row=this.huiyuankaiService.insert(huiyuankai);
		return row>0?"添加成功":"添加失败";
	}
   
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int hid) {
  		int row=this.huiyuankaiService.deleteById(hid);
  		return row>0?"删除成功":"删除失败";
  	}

}