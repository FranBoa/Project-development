package com.code.controller;

import com.alibaba.fastjson.JSONArray;
import com.code.entity.Huiyuankai;
import com.code.service.HuiyuankaiService;

import org.apache.log4j.lf5.util.DateFormatManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping("loadupdatehyk")
    public ModelAndView loadupdate(int hid) {
    	Huiyuankai huiyuankai=this.huiyuankaiService.queryById(hid);
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("huiyuankai", huiyuankai);
		mv.setViewName("member-card-edit");
        return mv;
    }

    //修改后
    @RequestMapping("/updatehyk")
	public @ResponseBody String updatehyk(Huiyuankai huiyuankai){
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
    	List<Huiyuankai> list=this.huiyuankaiService.selectAll();
    	Map<String, Object> map=new HashMap<>();
    	map.put("data", list);
    	System.out.println(list);
    	map.put("code", 0);
    	map.put("total", list.size());
        return map;
    }

    //添加
    @RequestMapping("/inserthyk")
	public @ResponseBody  void inserthyk(HttpServletRequest request,HttpServletResponse response) throws IOException, ParseException {
    	PrintWriter out=response.getWriter();
    	String hykkh=request.getParameter("hykkh");
    	int djid=Integer.parseInt(request.getParameter("djid"));
    	String hyktime=request.getParameter("hyktime");
    	System.out.println(hyktime);
    	Huiyuankai huiyuankai=new Huiyuankai();
    	huiyuankai.setHykkh(hykkh);
    	huiyuankai.setDjid(djid);
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟
    	Date date1=sdf.parse(hyktime);
    	huiyuankai.setHyktime(date1);
    	//添加
    	huiyuankaiService.insert(huiyuankai);
    	out.print("1");
		out.flush();
		out.close();
	}

    //删除
  	@RequestMapping("/deleteById")
  	public @ResponseBody String deleteById(int hid) {
  		int row=this.huiyuankaiService.deleteById(hid);
  		return row>0?"删除成功":"删除失败";
  	}

}
