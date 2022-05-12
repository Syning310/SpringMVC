package com.syning.mvc.controller;


import com.syning.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {


    // 形参列表使用注解接收请求体
    @RequestMapping(value = "/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody = " + requestBody);
        return "success";
    }


    // 利用 RequestEntity 类型获取请求报文
    @RequestMapping(value = "/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> entity) {
        System.out.println("请求头 = " + entity.getHeaders() + "\n   请求体" + entity.getBody());
        return "success";
    }


    // 原生ServletAPI 响应浏览器数据
    @RequestMapping(value = "/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello, response");
    }


    @RequestMapping(value = "/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @RequestMapping(value = "/testResponseBodyUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1001, "宁", "syning", 21);
    }


    // 处理ajax
    @RequestMapping(value = "/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + ", " + password);
        return "hello,axios";
    }



}
