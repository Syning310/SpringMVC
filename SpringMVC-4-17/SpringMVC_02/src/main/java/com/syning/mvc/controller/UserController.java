package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    /**
     *   使用 RESTFul 模拟用户资源的 增删改查
     *   请求路径：  /user       GET         查询所有用户信息
     *   请求路径：  /user/1     GET         根据用户id查询用户信息
     *   请求路径：  /user       POST        添加用户信息
     *   请求路径：  /user/1     DELETE      根据用户id删除用户信息
     *   请求路径：  /user       PUT         修改用户信息
     */

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }


    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable("id") Integer id) {
        System.out.println("根据id查询用户信息，id = " + id);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser(String username, String password) {
        System.out.println("添加用户信息 name = " + username + ", pwd = " + password);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password) {
        System.out.println("修改用户信息 name = " + username + ", pwd = " + password);
        return "success";
    }



}
