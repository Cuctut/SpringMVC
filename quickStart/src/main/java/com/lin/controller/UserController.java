package com.lin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc 控制类，实现等同 servlet 的表现层业务
 */

@Controller
public class UserController {

    /**
     * 保存操作，'/save' 作为访问路径
     * @return String
     */
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'springmvc'}";
    }
}
