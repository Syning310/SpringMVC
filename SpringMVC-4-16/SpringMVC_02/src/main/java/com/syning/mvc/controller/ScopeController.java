package com.syning.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
public class ScopeController {

    // 使用 ServletAPI 向 request 域对象共享数据
    @RequestMapping(value = "/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testScope", "尚亦宁");
        return "success";
    }



    // 使用 ModelAndView 向 request 域对象共享数据
    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView() {

        // 创建实例对象
        ModelAndView mav = new ModelAndView();

        // 处理模型数据，即向请求域 request 共享数据
        mav.addObject("testScope", "红颜");

        // 设置视图名称
        mav.setViewName("success");   // 相当于在上面的方法中，返回的字符串

        return mav;
    }



    // 使用 Model 向 request 域对象共享数据
    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testScope", "瑶瑶");

        return "success";
    }



    // 使用map向request域对象共享数据
    @RequestMapping(value = "/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testScope", "龙");
        return "success";
    }



    // 使用 ModelMap 向request域对象共享数据
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testScope", "月");
        System.out.println(modelMap.getClass());
        return "success";
    }




    // 向 session 域共享数据
    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSession", "session_尚亦宁");
        return "success";
    }


    // 向 application 域共享数据
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("application", "瑶瑶ing");
        return "success";
    }




}
