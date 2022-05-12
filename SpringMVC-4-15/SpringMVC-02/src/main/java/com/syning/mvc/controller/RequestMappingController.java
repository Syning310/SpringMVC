package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class RequestMappingController {

    // 属性值与另一个控制器方法的属性值相同会发生二义性
//    @RequestMapping(value = "/")
//    public String index() {
//        // 返回视图名称
//        return "target";
//    }


    // 此时请求映射所映射的请求的请求路径为:
    //                                  /hello/testRequestMapping
    @RequestMapping(
            value = {"/testRequestMapping", "/test", "/like"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String toSuccess() {
        return "success";
    }

    @GetMapping(value = "/ning")
    public String testGetMapping() {
        return  "success";
    }



    @RequestMapping(
            value = {"/testPut"},
            method = {RequestMethod.PUT}
    )
    public String testPut() {
        return "success";
    }



    @RequestMapping(
            value = {"yue"},
            params = {"username"}
    )
    public String testParams(String username, String name) {
        System.out.println(username);
        System.out.println(name);
        return "success";
    }


    // 请求头匹配
    @RequestMapping(
            value = {"/xin"},
            headers = {"Host=localhost:8080"}
    )
    public String xin() {

        return "success";
    }


    // ant风格路径
    @RequestMapping(value = "/a?/testAnt")
    public String testAnt() {
        return "success";
    }



    //
    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }



}
