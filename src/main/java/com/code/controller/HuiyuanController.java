package com.code.controller;

import com.code.entity.Huiyuan;
import com.code.service.HuiyuanService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping("loadupdatehy")
    public Huiyuan queryById(int hyid) {
    	Huiyuan huiyuan=this.huiyuanService.queryById(hyid);
        return huiyuan;
    }
    
   //修改后
    @RequestMapping("/updatehy")
	public @ResponseBody String updatehy(Huiyuan huiyuan){
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
    	List<Huiyuan> list=this.huiyuanService.queryAll(huiyuan);
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }
    
    //添加
    @RequestMapping("/inserthy")
	public  void inserthy(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	PrintWriter out=response.getWriter();
    	String pwd=request.getParameter("pwd");
    	String repass=request.getParameter("repass");
    	String hykh=request.getParameter("hykh");
    	String hyname=request.getParameter("hyname");
    	String hysex=request.getParameter("hysex");
    	int hyage=Integer.parseInt(request.getParameter("hyage"));
    	String hydanwei=request.getParameter("hydanwei");
    	String hylianxi=request.getParameter("hylianxi");
    	Huiyuan huiyuan=new Huiyuan();
    	huiyuan.setPwd(pwd);
    	huiyuan.setRepass(repass);
    	huiyuan.setHykh(hykh);
    	huiyuan.setHyname(hyname);
    	huiyuan.setHysex(hysex);
    	huiyuan.setHyage(hyage);
    	huiyuan.setHydanwei(hydanwei);
    	huiyuan.setHylianxi(hylianxi);
    	
    	System.out.println(huiyuan);
    	//添加
    	huiyuanService.insert(huiyuan);
    	out.print("1");
		out.flush();
		out.close();
	}
    
    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int hyid) {
  		int row=this.huiyuanService.deleteById(hyid);
  		return row>0?"删除成功":"删除失败";
  	}
  	
  	/**
     * 通过主键查询单条数据进行修改密码
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("loadpwdORrepass")
    public Huiyuan loadpwdORrepass(int hyid) {
    	Huiyuan huiyuan=this.huiyuanService.queryById(hyid);
        return huiyuan;
    }
  	
  	//修改密码
  	@RequestMapping("/pwdORrepass")
	public @ResponseBody String pwdORrepass(int hyid,String pwd,String repass) {
  		int row = this.huiyuanService.pwdORrepass(hyid,pwd, repass);
		return row>0?"修改成功":"修改失败";
	}
}