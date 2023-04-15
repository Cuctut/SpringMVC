package com.lin.controller;

import com.lin.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * REST 风格简化开发
 *  1. 用 @RestController 替换 @Controller 和 @ResponseBody
 *  2. 用 @PostMapping 替换 @RequestMapping(method = RequestMethod.POST)，以此类推
 */

//@Controller
//@ResponseBody
@RestController
public class UserController {

//    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping(value = "/user")
    public String save(@RequestBody User user){
        System.out.println("[ user save ] - " + user);
        return "{'module':'[ user save ]'}";
    }

//    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(value = "/users/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("[ user delete ] - " + id);
        return "{'module':'[ user delete ]'}";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @PutMapping(value = "/users")
    public String update(@RequestBody User user){
        System.out.println("[ user update ] - " + user);
        return "{'module':'[ user update ]'}";
    }

//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/user/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("[ user get ] - " + id);
        return "{'module':'[ user get ]'}";
    }

//    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping(value = "/user")
    public String getAll(){
        System.out.println("[ user all ]");
        return "{'module':'[ user all ]'}";
    }
}
