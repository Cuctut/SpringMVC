package com.lin.controller;

import com.lin.domain.User;
import com.sun.net.httpserver.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST 风格开发
 * 按请求类型调用不同方法
 */

@Controller
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("[ user save ] - " + user);
        return "{'module':'[ user save ]'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("[ user delete ] - " + id);
        return "{'module':'[ user delete ]'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("[ user update ] - " + user);
        return "{'module':'[ user update ]'}";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("[ user get ] - " + id);
        return "{'module':'[ user get ]'}";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("[ user all ]");
        return "{'module':'[ user all ]'}";
    }
}
