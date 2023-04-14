package com.lin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc 控制类，实现等同 servlet 的表现层业务
 */

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 保存操作，'/save' 作为访问路径
     * @return String
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public String save(String name, int age){
        System.out.println("[ name ] = " + name);
        System.out.println("[ age  ] = " + age);
        return "{'module':'UserController'}";
    }
}
