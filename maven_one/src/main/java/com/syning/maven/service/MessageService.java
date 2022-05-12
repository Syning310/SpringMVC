package com.syning.maven.service;

import com.syning.maven.mappers.MessageMapper;
import com.syning.maven.pojo.Message;
import com.syning.maven.sqlutils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "messageService")
public class MessageService {


    public List<Message> getMessageList() {

        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);

        return mapper.getAllMessage();
    }


    public Message getMessageByMid(Integer mid) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);
        return mapper.getMessageByMid(mid);
    }


    public int updateRelpy(String reply, Integer mid) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);

        int ret = mapper.updateReply(reply, mid);

        sqlSession.commit();

        return ret;
    }


    public int addTitle(Integer pid, Message mes) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);

        int ret = mapper.insertMessage(pid, mes);

        sqlSession.commit();

        return ret;
    }

    public int setRead(Integer mid) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);

        int ret = mapper.setRead(mid);
        sqlSession.commit();
        return ret;
    }


    public int delMessage(Integer mid) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        MessageMapper mapper = sqlSession.getMapper(MessageMapper.class);

        int ret = mapper.deleteMessage(mid);
        sqlSession.commit();
        return ret;
    }


}
