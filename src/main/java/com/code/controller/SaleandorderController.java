package com.code.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.code.TimeUtil.TimeUtil;
import com.code.entity.Relatedsaleandorder;
import com.code.entity.Saleandorder;
import com.code.entity.formdata;
import com.code.service.RelatedsaleandorderService;
import com.code.service.SaleandorderService;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * (Saleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
@RestController
@RequestMapping("saleandorder")
@Transactional
public class SaleandorderController {
    /**
     * 服务对象
     */
    @Resource
    private SaleandorderService saleandorderService;

    @Resource
    private RelatedsaleandorderService relatedsaleandorderService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Saleandorder selectOne(Integer id) {
        return this.saleandorderService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
        @RequestMapping("selectAll")
        public Map<String,Object> selectAll(@RequestParam("page") int pageNum, @RequestParam("limit") int pageSize){
            PageInfo<Saleandorder> pageInfo = this.saleandorderService.selectAllForPage(pageNum,pageSize);
            Map<String,Object> map = new HashMap<>();
            map.put("data",pageInfo.getList());
            map.put("code",0);
            map.put("count",pageInfo.getTotal());
            return map;
        }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param saleandorder 实例对象
     * @return 对象列表
     */
    @RequestMapping("queryAll")
    public List<Saleandorder>  queryAll(Saleandorder saleandorder){
           return this.saleandorderService.queryAll(saleandorder);
    }

    @ResponseBody
    @RequestMapping("del")
    public  Map<String,Object> del( int [] sid,String [] ordernumber){
        int x=sid.length;
        int b=sid.length;
        for (int i=0;i<sid.length;i++){
            boolean flag=true;
            if(flag!=true){
                b=b-1;
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("result","执行"+x+"条"+",成功"+b+"条"+"失败"+(x-b)+"条!" );
        map.put("code",x-b>0?1:0);
        return map;
    }

    @ResponseBody
    @RequestMapping("addrel")
    public  String addrel(@RequestBody List<Relatedsaleandorder> relatedsaleandorder){
        Integer count=0;
        Integer discount=0;
        Integer tax=0;
        Integer price=0;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i <relatedsaleandorder.size() ; i++) {
            Relatedsaleandorder xx=relatedsaleandorder.get(i);
            System.out.println(xx);
            System.out.println(tax);
            System.out.println(discount);
            if(xx.getScount()!=null){
                count=Integer.parseInt(xx.getScount());
            }
            if(xx.getSdiscount()!=null){
                discount=Integer.parseInt(xx.getSdiscount());
                discount=discount/100;
            }
            if(xx.getStax()!=null){
                tax=Integer.parseInt(xx.getStax());
                tax=tax/100;
            }
            System.out.println(tax);
            System.out.println(discount);
            if(xx.getSprice()!=null){
                price=Integer.parseInt(xx.getSprice());
            }
            xx.setSunit("个");
            if(xx.getScount()==null&&xx.getSdiscount()==null&&xx.getStax()==null){
                xx.setScount("1");xx.setSdiscount("0");xx.setStax("0");
                xx.setStotal(String.valueOf(price));
                System.out.println(xx.getStotal());
            }else  if(xx.getScount()==null&&xx.getSdiscount()==null){
                xx.setScount("1");xx.setSdiscount("0");
                xx.setStotal(String.valueOf(Math.floor((price+price*tax)*100)/100));
                System.out.println(xx.getStotal());
            }else  if(xx.getScount()==null&&xx.getStax()==null){
                xx.setScount("1");xx.setStax("0");
                xx.setStotal(String.valueOf(Math.floor((price-price*discount)*100)/100));
                System.out.println(xx.getStotal());
            }else if (xx.getSdiscount()==null&&xx.getStax()==null){
                xx.setSdiscount("0");xx.setStax("0");
                xx.setStotal(String.valueOf(Math.floor((price*count)*100)/100));
                System.out.println(xx.getStotal());
            }else if(xx.getScount()==null){
                xx.setScount("1");
                xx.setStotal(String.valueOf(Math.floor((price+price*tax-price*discount)*100)/100));
                System.out.println(xx.getStotal());
            }else if (xx.getSdiscount()==null){
                xx.setSdiscount("0");
                xx.setStotal(String.valueOf(Math.floor(((price+price*tax)*count)*100)/100));
                System.out.println(xx.getStotal());
            }else if (xx.getStax()==null){
                xx.setStax("0");
                xx.setStotal(String.valueOf(Math.floor(((price-price*discount)*count)*100)/100));
                System.out.println(xx.getStotal());
            }else{
                xx.setStotal(df.format((price+price*tax-price*discount)*count));
                System.out.println(xx.getStotal());
            }
            System.out.println(xx);
        }

        return  "200";
    }

    @ResponseBody
    @RequestMapping("addsal")
    public  String add(formdata formdatas){
        if (formdatas!=null) {
            System.out.println(formdatas.getTitle());
            Saleandorder saleandoder1 = this.saleandorderService.queryLastOne();
            int NeedId = saleandoder1.getSid();
            String times = TimeUtil.order(NeedId, "JH");
            Saleandorder saleandorder = new Saleandorder();
            saleandorder.setSalesman("wdnmd");
            saleandorder.setAuthor("wdnmd");
            saleandorder.setCustomername(formdatas.getKehuid());
            saleandorder.setOrdernumber(times);
            if(formdatas.getTitle()!=null){
                saleandorder.setRemarks(formdatas.getTitle());
            }else {
                saleandorder.setRemarks("无备注");
            }

            System.out.println(saleandorder);
            this.saleandorderService.insert(saleandorder);
        return times;
        }else{
            return   "error";
        }

    }



}
