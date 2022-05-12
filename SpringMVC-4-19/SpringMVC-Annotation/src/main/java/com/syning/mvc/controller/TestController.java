package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        //int i = 1 / 0;   // 测试异常
        return "index";
    }


}
