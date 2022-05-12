package com.syning.mvc.controller;


import com.syning.mvc.javabean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class TestParamsController {
    // 跳转 index.html 页面
    @RequestMapping(value = {"/"})
    public String index() {
        return "index";
    }

    // 跳转 test_params.html 页面
    @RequestMapping(value = {"/params"})
    public String params() {
        return "test_params";
    }


    // 使用 ServletAPI 获取请求参数
    @RequestMapping(value = "/testServletAPI")
    // 形参位置的 request 表示当前请求
    public String testServletAPI(HttpServletRequest request) {
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        System.out.println("name = " + name + "    pwd = " + pwd);
        return "success";
    }


    // 使用控制器方法的形参获取请求参数
    @RequestMapping(value = "/testParam")
    public String testParam(String name, String password, String[] hobby) {
        System.out.println("name = " + name + ", pwd = " + password);
        if (hobby != null) {
            for (String h : hobby) {
                System.out.println("h = " + h);
            }
        }
        return "success";
    }


    // 使用@RequestParam注解方式
    @RequestMapping(value = "/testAnno")
    public String testAnno(@RequestParam("user_name") String name, @RequestParam("password") String pwd, String[] hobby) {
        System.out.println("name = " + name + ", pwd = " + pwd + ", hobby = " + Arrays.toString(hobby));
        return "success";
    }


    // 使用注解 @RequestHeader
    @RequestMapping(value = "/testAnno2")
    public String testAnno2(
            @RequestParam(name = "user_name") String name,
            @RequestParam(name = "password") String pwd,
            String[] hobby,
            @RequestHeader("Host") String host) {
        System.out.println("name = " + name);
        System.out.println("pwd = " + pwd);
        System.out.println("hoby = " + Arrays.toString(hobby));
        System.out.println("host = " + host);

        return "success";
    }


    // 使用注解@CookieValue
    @RequestMapping(value = "/testAnno3")
    public String testAnno2(String name, @CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println("JSESSIONID = " + JSESSIONID);
        return "success";
    }



    // 使用 POJO 形参
    @RequestMapping("/testPOJO")
    public String testPOJO(User user) {
        System.out.println(user);
        return "success";
    }



}
