package com.code.controller;

import com.code.entity.Relatedsaleandorder;
import com.code.service.RelatedsaleandorderService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

/**
 * (Relatedsaleandorder)表控制层
 *
 * @author yap
 * @since 2020-04-26 16:29:19
 */
@RestController
@RequestMapping("relatedsaleandorder")
public class RelatedsaleandorderController {
    /**
     * 服务对象
     */
    @Resource
    private RelatedsaleandorderService relatedsaleandorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Relatedsaleandorder selectOne(Integer id) {
        return this.relatedsaleandorderService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<Relatedsaleandorder> selectAll(){
           return this.relatedsaleandorderService.selectAll();
    }


    /**
     * 通过实体作为筛选条件查询
     *
     * @param relatedsaleandorder 实例对象
     * @return 对象列表
     */
        @RequestMapping("queryAll")
        public Map<String,Object> queryAll(Relatedsaleandorder relatedsaleandorder, @RequestParam(value = "page",defaultValue= "1") int pageNum,@RequestParam(value = "limit",defaultValue = "10") int pageSize){
            System.out.println(relatedsaleandorder.getOrdernumber());
            Map<String,Object> map = new HashMap<>();
            PageInfo<Relatedsaleandorder> pageInfo = this.relatedsaleandorderService.queryAllforPage(pageNum,pageSize,relatedsaleandorder);
            System.out.println(pageInfo);
            map.put("data",pageInfo.getList());
            map.put("code",0);
            map.put("count",pageInfo.getTotal());
            return map;
        }


        @RequestMapping("del")
        public Map<String,Object> delAll(int [] sid,String [] ordernumber){
            int x=sid.length;
            int b=sid.length;
            for (int i=0;i<sid.length;i++){
                System.out.println(ordernumber[i]);
                System.out.println(sid[i]);
                boolean flag=this.relatedsaleandorderService.deleteById(sid[i]);
                if(flag!=true){
                    b=b-1;
                }
            }

            Map<String,Object> map=new HashMap<>();
            map.put("result","执行"+x+"条"+",成功"+b+"条"+"失败"+(x-b)+"条!" );
            map.put("code",x-b>0?1:0);
            return map;
        }
}
