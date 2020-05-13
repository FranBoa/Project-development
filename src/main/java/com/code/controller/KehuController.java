package com.code.controller;

import com.code.entity.Category;
import com.code.entity.Huiyuan;
import com.code.entity.Kehu;
import com.code.service.CategoryService;
import com.code.service.KehuService;

import org.springframework.ui.Model;
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
    @Resource
    private CategoryService categoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
 	@RequestMapping("/loadupdate")
 	public ModelAndView LoadupdateUname(int id) {
		Kehu kehu = kehuService.queryById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("kehu", kehu);
		mv.setViewName("clientele-edit");
		return mv;
	}

 	//修改后
    @RequestMapping("/updateKehu1")
	public @ResponseBody String updatehy(HttpServletRequest request, Kehu kehu){
		int row = this.kehuService.update(kehu);
		return row>0?"修改成功":"修改失败";
	}
    //修改客户
    @RequestMapping("/updateKehu")
    @ResponseBody
    public String updateKehu(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	System.out.println("进了");
    	PrintWriter out=response.getWriter();
    	String grade=request.getParameter("grade");
    	String name=request.getParameter("name");
    	int cid=Integer.parseInt(request.getParameter("cid"));
    	String sell=request.getParameter("sell");
    	String contact=request.getParameter("contact");
    	String mobilePhone=request.getParameter("mobilePhone");
    	String address=request.getParameter("address");
    	Kehu kehu=new Kehu();
    	kehu.setGrade(grade);
    	kehu.setName(name);
    	kehu.setCid(cid);
    	kehu.setSell(sell);
    	kehu.setContact(contact);
    	kehu.setMobilePhone(mobilePhone);
    	kehu.setAddress(address);
    	//修改操作
    	kehuService.update(kehu);
    	out.print("1");
		out.flush();
		out.close();
		return "1";
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
    	List<Kehu> list=this.kehuService.selectAll();
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }

    //添加客户
    @RequestMapping("/insertKehu")
	public void insertKehu(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	System.out.println("进了");
    	PrintWriter out=response.getWriter();
    	String grade=request.getParameter("grade");
    	String name=request.getParameter("name");
    	int cid=Integer.parseInt(request.getParameter("cid"));
    	String sell=request.getParameter("sell");
    	String contact=request.getParameter("contact");
    	String mobilePhone=request.getParameter("mobilePhone");
    	String address=request.getParameter("address");
    	Kehu kehu=new Kehu();
    	kehu.setGrade(grade);
    	kehu.setName(name);
    	kehu.setCid(cid);
    	kehu.setSell(sell);
    	kehu.setContact(contact);
    	kehu.setMobilePhone(mobilePhone);
    	kehu.setAddress(address);
    	//添加操作
    	kehuService.insert(kehu);
    	out.print("1");
		out.flush();
		out.close();
    }

    //删除客户
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int id) {
  		int row=this.kehuService.deleteById(id);
  		return row>0?"删除成功":"删除失败";
  	}

  	//查询单个 销售使用
	@RequestMapping("/queryBycid")
	public  List<Kehu> queryBycid(Integer cid){
		List<Kehu> list= this.kehuService.queryBycId(cid);
    	return list;
	}
}
