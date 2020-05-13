package com.code.controller;

import com.code.entity.Zhuxiao;
import com.code.service.ZhuxiaoService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 会员卡注销表(Zhuxiao)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("zhuxiao")
public class ZhuxiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ZhuxiaoService zhuxiaoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Zhuxiao selectOne(int zid) {
    	Zhuxiao zhuxiao=this.zhuxiaoService.queryById(zid);
        return zhuxiao;
    }
    
  //修改后
    @RequestMapping("/updatezx")
	public @ResponseBody String updatezx(HttpServletRequest request, Zhuxiao zhuxiao){
		int row = this.zhuxiaoService.update(zhuxiao);
		return row>0?"修改成功":"修改失败";
	}
    
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Zhuxiao> selectAll(){
    	
           return this.zhuxiaoService.selectAll();
    }
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param zhuxiao 实例对象
         * @return 
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public  Map<String, Object> queryAll(Zhuxiao zhuxiao){
    	List<Zhuxiao> list=this.zhuxiaoService.queryAll(zhuxiao);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
  //添加
    @RequestMapping(value="/insertzx",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String insertzx(HttpServletRequest request, Zhuxiao zhuxiao) {
		int row=this.zhuxiaoService.insert(zhuxiao);
		return row>0?"添加成功":"添加失败";
	}
   
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int zid) {
  		int row=this.zhuxiaoService.deleteById(zid);
  		return row>0?"删除成功":"删除失败";
  	}

}