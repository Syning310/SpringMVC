package com.syning.maven.controller;


import com.syning.maven.pojo.Message;
import com.syning.maven.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    // 回到登录页面
    @RequestMapping(value = "/exit", method = RequestMethod.GET)
    public String exitLogin(HttpSession session) {
        // 将当前登录的对象置为空
        session.setAttribute("current", null);

        return "index";
    }


    // 展示话题列表
    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public ModelAndView getAllList() {

        ModelAndView mv = new ModelAndView();

        List<Message> mesList = messageService.getMessageList();

        // 保存到请求作用域中
        mv.addObject("messageList", mesList);

        mv.setViewName("messagePage");
        return mv;
    }



    // 进入消息详细内容页面
    @RequestMapping(value = "/message/{mid}", method = RequestMethod.GET)
    public ModelAndView replyMessage(@PathVariable("mid") Integer mid) {

        ModelAndView mv = new ModelAndView();

        // 通过 mid 获取 Message
        Message message = messageService.getMessageByMid(mid);

        // 将 mid 的 Message 设置为已读
        messageService.setRead(mid);

        mv.addObject("message", message);

        mv.setViewName("messageDetail");
        return mv;
    }


    // 添加回复
    @RequestMapping(value = "/message/{mid}", method = RequestMethod.PUT)
    public String updateMessage(String reply, @PathVariable("mid") Integer mid) {

        messageService.updateRelpy(reply, mid);

        return "redirect:/message/" + mid;
    }

    // 添加消息
    @RequestMapping(value = "/message/{pid}", method = RequestMethod.POST)
    public String insertMessage(@PathVariable("pid") Integer pid, Message mes) {
        messageService.addTitle(pid, mes);
        return "redirect:/message";
    }


    // 删除消息
    @RequestMapping(value = "/message/{mid}", method = RequestMethod.DELETE)
    public String deleteMes(@PathVariable("mid") Integer mid) {
        messageService.delMessage(mid);
        return "redirect:/message";
    }

}
