package com.syning.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//    @RequestMapping(value = "/")
//    public String index() {
//        return "index";
//    }


    @RequestMapping(value = "/test_view")
    public String testView() {
        return "test_view";
    }




}
