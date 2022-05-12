package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping(value = "/testInterceptor")
    public String testIntegerceptor() {

        return "success";
    }



    @RequestMapping(value = "/testExceptionHandler")
    public String testExceptionHandler() {
        int i = 1 / 0;
        return "success";
    }



    @RequestMapping(value = "/testExceptionClassAnno")
    public String testExceptionClassAnno() {
        String name = null;
        name.equals("");
        return "success";
    }



}
