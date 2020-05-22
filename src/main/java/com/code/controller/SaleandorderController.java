package com.code.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.code.TimeUtil.TimeUtil;
import com.code.entity.*;
import com.code.layuiUtil.SoulPage;
import com.code.service.KehuService;
import com.code.service.RelatedsaleandorderService;
import com.code.service.SaleandorderService;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
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
        public Object selectAll(SoulPage<Saleandorder> soulPage, SaleandorderSo saleandorderSo){
//            selectAll(@RequestParam(value = "filterSos",required = false) String filterSos, @RequestParam(value = "page",defaultValue = "1") int pageNum, @RequestParam(value = "limit",defaultValue = "2") int pageSize, @RequestParam(required = false) String field, @RequestParam(required = false) String order){
            soulPage.setObj(saleandorderSo);
            System.out.println(saleandorderSo);
//            List<filterSos> filterSosList = JSONArray.parseArray(filterSos,filterSos.class);
//            if(filterSosList!=null){
//              for (int i=0;i<filterSosList.size();i++){ System.out.println(filterSosList.get(i)); }
//             }
//            PageInfo<Saleandorder> pageInfo = this.saleandorderService.selectAllForPage(pageNum,pageSize,filterSosList);
//            Map<String,Object> map = new HashMap<>();
//            map.put("data",pageInfo.getList());
//            map.put("code",0);
//            map.put("count",pageInfo.getTotal());
            return saleandorderService.selectAll(soulPage);
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
        Integer x=sid.length;
        Integer b=sid.length;
        Integer c=0;
        Integer d=0;
        for (int i=0;i<sid.length;i++){
            System.out.println(ordernumber[i]);
            System.out.println(sid[i]);
            boolean flag=saleandorderService.deleteById(sid[i]);//删除主数据
            boolean flagson=relatedsaleandorderService.deleteByOrderNumber(ordernumber[i]);//删除子数据
            if(flag!=true){
                b=b-1;
            }
            if(flagson!=true){
                c++;
            }else{
                d++;
            }
        }
        Map<String,Object> map=new HashMap<>();
        map.put("result","执行"+x+"条"+",成功"+b+"条"+"失败"+(x-b)+"条,删除订单详细商品成功"+d+"条,"+"失败"+c+"条！" );
        map.put("code",x-b>0?1:0);
        if((x-b)>0||c>1){
            map.put("msg","isnotnull");
        }
        return map;
    }

    @ResponseBody
    @RequestMapping("addrel")
    public  String addrel(@RequestBody List<Relatedsaleandorder> relatedsaleandorder){
        Integer count=0;
        Double discount=0.00;
        Double tax=0.00;
        Double price=0.00;
        Double total=0.00;
        String OrderNumber=null;
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i <relatedsaleandorder.size() ; i++) {
            Relatedsaleandorder xx=relatedsaleandorder.get(i);
            OrderNumber=xx.getOrdernumber();
            if(xx.getScount()!=null){
                count=Integer.parseInt(xx.getScount());
            }
            if(xx.getSdiscount()!=null){
                discount= Double.valueOf(xx.getSdiscount())/100.00;
            }
            if(xx.getStax()!=null){
                tax= Double.valueOf(xx.getStax())/100.00;
            }
            if(xx.getSprice()!=null){
                price=Double.valueOf(xx.getSprice());
            }
            System.out.println(price);
            System.out.println(tax);
            System.out.println(discount);
            xx.setSunit("个");
            if(xx.getScount()==null&&xx.getSdiscount()==null&&xx.getStax()==null){
                xx.setScount("1");xx.setSdiscount("0");xx.setStax("0");
                xx.setStotal(df.format(price));
                total+=price;
                System.out.println(xx.getStotal()+"All为空");
            }else  if(xx.getScount()==null&&xx.getSdiscount()==null){
                xx.setScount("1");xx.setSdiscount("0");
                xx.setStotal(df.format((price+price*tax)));
                total+=price+price*tax;
                System.out.println(xx.getStotal()+"Discount和Count为空");
            }else  if(xx.getScount()==null&&xx.getStax()==null){
                xx.setScount("1");xx.setStax("0");
                xx.setStotal(df.format((price-price*discount)));
                total+=price-price*discount;
                System.out.println(xx.getStotal()+"Tax和Count为空");
            }else if (xx.getSdiscount()==null&&xx.getStax()==null){
                xx.setSdiscount("0");xx.setStax("0");
                xx.setStotal(df.format((price*count)));
                total+=price*count;
                System.out.println(xx.getStotal()+"Tax和Discount为空");
            }else if(xx.getScount()==null){
                xx.setScount("1");
                xx.setStotal(df.format((price+price*tax-price*discount)));
                total+=price+price*tax-price*discount;
                System.out.println(xx.getStotal()+"Count为空");
            }else if (xx.getSdiscount()==null){
                xx.setSdiscount("0");
                xx.setStotal(df.format(((price+price*tax)*count)));
                total+=(price+price*tax)*count;
                System.out.println(xx.getStotal()+"Dis为空");
            }else if (xx.getStax()==null){
                xx.setStax("0");
                xx.setStotal(df.format(((price-price*discount)*count)));
                total+=((price-price*discount)*count);
                System.out.println(xx.getStotal()+"Tax为空");
            }else{
                xx.setStotal(df.format(((price+price*tax-price*discount)*count)));
                total+=((price+price*tax-price*discount)*count);
                System.out.println(xx.getStotal()+"最后一次");
            }

            relatedsaleandorderService.insert(xx);
            System.out.println("最终输出"+xx);
        }
        System.out.println(total);
        List<Saleandorder> up=saleandorderService.queryAll(new Saleandorder(OrderNumber));
        for (int i=0;i<up.size();i++){
            Saleandorder saleandorder = up.get(i);
            System.out.println(saleandorder);
        }
        System.out.println(up);
        //up.setOrdernumber(OrderNumber);
        //up.setStotal(String.valueOf(total));
        //saleandorderService.update(up);
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
            saleandorder.setCustomerid(formdatas.getKehuid());
            saleandorder.setSalesman("wdnmd");
            saleandorder.setAuthor("wdnmd");
            saleandorder.setCustomername(formdatas.getCustomername());
            saleandorder.setOrdernumber(times);
            if(formdatas.getTitle()!=null){
                saleandorder.setRemarks(formdatas.getTitle());
            }else {
                saleandorder.setRemarks("无备注");
            }

            this.saleandorderService.insert(saleandorder);
        return times;
        }else{
            return   "error";
        }

    }

    @ResponseBody
    @RequestMapping("update")
    public  String update(Saleandorder saleandorder){
        this.saleandorderService.update(saleandorder);
        return "ok";
    }
}
