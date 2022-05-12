package com.syning.controller;

import com.syning.mybatis.entity.Message;
import com.syning.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/message")
    public ModelAndView showAllMessage() {

        ModelAndView mv = new ModelAndView();

        List<Message> lst = messageService.getAllMessage();

        mv.addObject("messageList", lst);

        mv.setViewName("messagePage");
        return mv;
    }


}
