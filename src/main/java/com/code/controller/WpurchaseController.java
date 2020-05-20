package com.code.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.code.entity.Category;
import com.code.entity.Product;
import com.code.entity.Relatedsaleandorder;
import com.code.entity.User;
import com.code.entity.Wpurchase;
import com.code.service.ProductService;
import com.code.service.UserService;
import com.code.service.WpurchaseService;
import com.github.pagehelper.PageInfo;


/**
 * (Purchase)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@RestController
@RequestMapping("Wpurchase")
public class WpurchaseController {
	/**
     * 服务对象
     */
    @Resource
    private WpurchaseService wpurchaseService;
    @Resource
    private ProductService pservice;
    @Resource
    private UserService uservice;
    @Resource
    private  HttpServletRequest res;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ModelAndView selectOne(Integer id) {
    	List<Wpurchase> list = this.wpurchaseService.selectAll();
    	ModelAndView mv = new ModelAndView();
    	mv.addObject(list);
    	mv.setViewName("/w-order-list.html");
        return mv;
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    @ResponseBody
    public HashMap<String, Object> selectAll(){

    	HashMap<String, Object> map = new HashMap<>();
    	List<Wpurchase> list = this.wpurchaseService.selectAll();

    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
        return map;
    }

        /**
         * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public HashMap<String, Object>  queryAll(Wpurchase wpurchase){

    	HashMap<String,Object> map = new HashMap<>();
    	if(wpurchase.getPurchaseStatus().equals(0)) {
    		wpurchase.setPurchaseStatus("未审核");
    	}
    	res.getSession().setAttribute("userid", "327d9");
    	wpurchase.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
        List<Wpurchase> list = this.wpurchaseService.queryAll(wpurchase);
        map.put("data",list);//pageInfo.getList()
        map.put("code",0);
        /*map.put("count",pageInfo.getTotal());*/
        return map;
    }

    @RequestMapping("queryAllForPage")
    public HashMap<String, Object>  queryAll(Wpurchase wpurchase, @RequestParam(value ="page" ,defaultValue = "1") int pageNum,@RequestParam(value = "limit",defaultValue = "10") int pageSize){

    	HashMap<String,Object> map = new HashMap<>();
    	/*res.getSession().setAttribute("userid", "002");*/
    	wpurchase.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
        PageInfo<Wpurchase> pageInfo = this.wpurchaseService.queryAllForPage(pageNum,pageSize,wpurchase);
        System.out.println(pageInfo);
        map.put("data",pageInfo.getList());
        map.put("code",0);
        map.put("count",pageInfo.getTotal());
        return map;

    }
	    /**
	     * 通过实体作为修改条件
	 *
	 * @param
	 * @return 对象列表
	 */
	@RequestMapping("updatetongyi")
	public int update(Wpurchase wpurchase){
		wpurchase.setPurchaseStatus("已审核");

    	Product p = new Product();
    	p.setPtype(3);
    	p.setPid(wpurchase.getPurchaseGoodsId());
    	p.setWarehouse(wpurchase.getWarehouse());

    	Product p2 = new Product();
    	p2 = this.pservice.queryById(p.getPid());
    	System.out.println(p2.getWarenum());
    	p.setWarenum(wpurchase.getPurchaseNum()+p2.getWarenum());
    	System.out.println(p.getWarenum());
    	int row=this.pservice.update(p);

		int num = this.wpurchaseService.update(wpurchase);
    	return num;
	}

	@RequestMapping("add")
	public int add(@RequestBody Wpurchase wpurchase){
		System.out.println("wpurchase:"+wpurchase);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String str=sdf.format(new Date());
		wpurchase.setPurchaseId("GH"+str);
		//获取userid查询bossid
		/*res.getSession().setAttribute("userid", "002");*/
		res.getSession().setAttribute("userid", "327d9");
		wpurchase.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
		User u = uservice.queryById(wpurchase.getUsersId());
		if(u.getBossid()!=null){
			wpurchase.setBossUsersId(u.getBossid());
		}


		double discountsSum = wpurchase.getPurchasePrice()*wpurchase.getPurchaseNum()*(Double.parseDouble(wpurchase.getDiscounts())/100);       //(Double.parseDouble(wpurchase.getDiscounts()/100));
		double discountsPrice = (wpurchase.getPurchasePrice()*wpurchase.getPurchaseNum())-discountsSum;

		wpurchase.setDiscountsSum(discountsSum);
		wpurchase.setDiscountsPrice(discountsPrice);
		wpurchase.setDiscounts(wpurchase.getDiscounts()+"%");
		return this.wpurchaseService.add(wpurchase);
	}

	@RequestMapping("addList")
	public int addList(@RequestBody List<Wpurchase> wpurchase){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String str=sdf.format(new Date());
		for (Wpurchase w : wpurchase) {
			w.setPurchaseId("GH"+str);
			//获取userid查询bossid
			/*res.getSession().setAttribute("userid", "002");*/
			w.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
			User u = uservice.queryById(w.getUsersId());

			w.setBossUsersId(u.getBossid());

			double discountsSum = w.getPurchasePrice()*w.getPurchaseNum()*(Double.parseDouble(w.getDiscounts())/100);       //(Double.parseDouble(wpurchase.getDiscounts()/100));
			double discountsPrice = (w.getPurchasePrice()*w.getPurchaseNum())-discountsSum;

			w.setDiscountsSum(discountsSum);
			w.setDiscountsPrice(discountsPrice);
			w.setDiscounts(w.getDiscounts()+"%");
			int num = this.wpurchaseService.add(w);
		}
		return 1;
	}


	@RequestMapping("queryBy")
	public HashMap<String,Object>  queryBy(Wpurchase wpurchase,int pageNum, int pageSize){
		HashMap<String,Object> map = new HashMap<>();
        PageInfo<Wpurchase> pageInfo = this.wpurchaseService.queryByForPage(pageNum,pageSize,wpurchase);
        System.out.println(pageInfo);
        map.put("data",pageInfo.getList());
        map.put("code",0);
        /*map.put("count",pageInfo.getTotal());*/
        return map;
	}
}
