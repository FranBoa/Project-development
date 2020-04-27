package com.code.controller;

import com.code.entity.Kehu;
import com.code.service.KehuService;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * (Kehu)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:39
 */
@RestController
@RequestMapping("kehu")
public class KehuController {
    /**
     * 服务对象
     */
    @Resource
    private KehuService kehuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public Kehu queryById(int id) {
    	//System.out.println(id);
    	Kehu kehu = this.kehuService.queryById(id);
        return kehu;
    }
    
    //修改客户
    @RequestMapping("/updateKehu")
	public @ResponseBody String updateKehu(HttpServletRequest request, Kehu kehu){
		int row = this.kehuService.update(kehu);
		return row>0?"修改成功":"修改失败";
	}
    
        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Kehu> selectAll(){
        return this.kehuService.selectAll();
    }
    
    
        /**
     * 通过实体作为筛选条件查询
     *
     * @param kehu 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String, Object> queryAll(Kehu kehu){
    	System.out.println(kehu);
    	List<Kehu> list=this.kehuService.queryAll(kehu);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
    //添加客户
    @RequestMapping(value="/insertKehu",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String insertKehu(HttpServletRequest request, Kehu kehu) {
    	System.out.println(kehu);
//    	System.out.println(request.getParameter("grade"));
//    	System.out.println(request.getParameter("name"));
//    	System.out.println(request.getParameter("cid"));
//    	System.out.println(request.getParameter("sell"));
//    	System.out.println(request.getParameter("contact"));
//    	System.out.println(request.getParameter("mobilePhone"));
//    	System.out.println(request.getParameter("address"));
		int row=this.kehuService.insert(kehu);
		return row>0?"添加成功":"添加失败";
	}
    
    //删除客户
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int id) {
  		int row=this.kehuService.deleteById(id);
  		return row>0?"删除成功":"删除失败";
  	}

}