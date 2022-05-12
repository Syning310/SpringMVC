package com.syning.service;

import com.syning.mybatis.entity.Message;
import com.syning.mybatis.entity.MessageExample;
import com.syning.mybatis.mappers.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageService {


    @Autowired
    private MessageMapper messageMapper;


    public List<Message> getAllMessage() {

        List<Message> lst = messageMapper.selectByExample(new MessageExample());

        return lst;
    }


}
