package com.syning.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 注解必须要加，要不然这个类不会加入IOC容器，前端控制器也就不知道这个类
@Controller
public class ViewController {


    // 测试 ThymeleafView 视图
    @RequestMapping(value = "/testThymeleafView")
    public String testThtmeleafView() {
        return "success";
    }


    // 内部跳转是发送请求，不能直接跳转到页面中
    @RequestMapping(value = "/testForward")
    public String testForward() {
        return "forward:/testThymeleafView";
    }


    // 重定向
    @RequestMapping(value = "/testRedirect")
    public String testRedirect() {
        return "redirect:/";
    }



}
