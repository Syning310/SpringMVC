package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// 控制器，需要开启扫描组件
@Controller
public class HelloController {



    @RequestMapping(value = "/")  //
    public String index() {
        // 返回视图名称
        return "index";   // 请求路径应该是:  /WEB-INF/templates/index.html
    }


    @RequestMapping(value = "/target")
    public String toTarget() {
        return "target";
    }


}
