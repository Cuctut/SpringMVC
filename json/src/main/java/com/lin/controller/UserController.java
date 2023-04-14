package com.lin.controller;

import com.lin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * springmvc 控制类，实现等同 servlet 的表现层业务
 */

@Controller
public class UserController {

//    简单类型的List集合
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println(likes);
        return "{'module':'list param for json'}";
    }

//    POJO类型
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println(user);
        return "{'module':'pojo param for json'}";
    }

//    POJO类型的List集合
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users){
        System.out.println(users);
        return "{'module':'list Pojo param for json'}";
    }
}
