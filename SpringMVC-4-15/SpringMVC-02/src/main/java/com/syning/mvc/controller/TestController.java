package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping(value = "/")
    public String index() {
        // 返回视图名称
        return "index";
    }







}
