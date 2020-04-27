package com.code.controller;

import com.code.entity.Category;
import com.code.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
    @GetMapping("selectOne")
    public Category selectOne(String id) {
    	Category category = this.categoryService.queryById(id);
        return category;
    }
    
    //修改客户
    @RequestMapping("/updateKehuSort")
	public @ResponseBody String updateKehuSort(HttpServletRequest request, Category category){
		int row = this.categoryService.update(category);
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
    
    //添加客户
    @RequestMapping(value="/insertKehu",produces ="html/text;charset=UTF-8")
	public @ResponseBody  String insertBrand(HttpServletRequest request, Category category) {
    	//System.out.println(request.getParameter("grade"));
		int row=this.categoryService.insert(category);
		return row>0?"添加成功":"添加失败";
	}
    
    //删除客户
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int cid) {
  		int row=this.categoryService.deleteById(cid);
  		return row>0?"删除成功":"删除失败";
  	}

}