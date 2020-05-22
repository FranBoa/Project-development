package com.code.controller;

import com.alibaba.fastjson.JSONArray;
import com.code.entity.Category;
import com.code.service.CategoryService;
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
 * 客户类别(Category)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:40
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("lodaupdateSort")
    public ModelAndView lodaupdate(String cid) {
    	Category category = this.categoryService.queryById(cid);
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("category", category);
		mv.setViewName("clientele-sort-edit");
        return mv;
    }

    //修改客户类别
    @RequestMapping("/updateKehuSort")
    public @ResponseBody String updateKehuSort(Category category) {
    	int row=this.categoryService.update(category);
		return row>0?"修改成功":"修改失败";
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Category> selectAll(){
           return this.categoryService.selectAll();
    }

	@RequestMapping("selectAllWithKehu")
	public List<Category> selectAllWithKehu(){
		return  this.categoryService.selectAllWithKehu();
	}

        /**
     * 通过实体作为筛选条件查询
     *
     * @param category 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public Map<String, Object> queryAll(Category category){
    	List<Category> list=this.categoryService.queryAll(category);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }

   //菜单下拉框绑定
  	@RequestMapping("/Menubangding")
  	@ResponseBody
  	public void Menubangding(HttpServletResponse response) throws IOException {
  		response.setContentType("text/html;charset=utf-8");
  		List<Category> list = categoryService.selectAll();
  		String str = JSONArray.toJSONString(list);
  		PrintWriter out = response.getWriter();
  		out.print(str);
  		out.flush();
  		out.close();
  	}

    //添加客户类别
    @RequestMapping("/insertKehuType")
    public void insertKehuType(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	System.out.println("进了");
    	PrintWriter out=response.getWriter();
    	String cType=request.getParameter("cType");
    	Category category=new Category();
    	category.setcType(cType);
    	//添加操作
    	categoryService.insert(category);
    	out.print("1");
		out.flush();
		out.close();
    }

    //删除客户
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int cid) {
  		int row=this.categoryService.deleteById(cid);
  		return row>0?"删除成功":"删除失败";
  	}

}
