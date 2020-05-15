package com.code.controller;

import com.code.entity.User;
import com.code.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author yap
 * @since 2020-04-19 02:16:42
 */
@Controller
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(String id) {
        return this.userService.queryById(id);
    }


        /**
     * 查询某张表所有数据，搭配PageHelper使用更佳！
     *
     * @param
     * @return 对象列表
     */
    @RequestMapping("selectAll")
    public List<User> selectAll(){
           return this.userService.selectAll();
    }


        /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
      //@ResponseBody
    @RequestMapping("login")
    public String  queryAll(User user){
        System.out.println("************");
        List<User> list =  this.userService.queryAll(user);
        return "index";
    }

}
