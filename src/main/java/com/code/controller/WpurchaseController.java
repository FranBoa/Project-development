package com.code.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.code.entity.Product;
import com.code.entity.User;
import com.code.entity.Wpurchase;
import com.code.service.ProductService;
import com.code.service.UserService;
import com.code.service.WpurchaseService;


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
    	/*for (Wpurchase w : list) {
			for (User u : w.getUserList()) {
				System.out.println(u);
			}
		}*/
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
    public HashMap<String, Object>  queryAll(Wpurchase wpurchase,HttpServletRequest res){
    	if(wpurchase.getPurchaseStatus().equals(0)) {
    		wpurchase.setPurchaseStatus("未审核");
    	}
    	res.getSession().setAttribute("userid", "002");
    	wpurchase.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
    	HashMap<String, Object> map = new HashMap<>();
    	List<Wpurchase> list = this.wpurchaseService.queryAll(wpurchase);
    	map.put("data", list);
    	map.put("code", 0);
    	/*map.put("count", pageInfo.getTotal());*/
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
    	p.setWarehouse(wpurchase.getWarehouse());
    	p.setWarenum(wpurchase.getPurchaseNum());

    	int row=this.pservice.insert(p);

		int num = this.wpurchaseService.update(wpurchase);
    	return num;
	}

	@RequestMapping("add")
	public int add(Wpurchase wpurchase,HttpServletRequest res){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String str=sdf.format(new Date());
		wpurchase.setPurchaseId("gh"+str);
		//获取userid查询bossid
		wpurchase.setUsersId(String.valueOf(res.getSession().getAttribute("userid")));
		User u = uservice.queryById(wpurchase.getUsersId());

		wpurchase.setBossUsersId(u.getBossid());
	    return this.wpurchaseService.add(wpurchase);
	}

	@RequestMapping("queryBy")
	public List<Wpurchase>  queryBy(Wpurchase wpurchase){
	    return this.wpurchaseService.queryBy(wpurchase);
	}
}
