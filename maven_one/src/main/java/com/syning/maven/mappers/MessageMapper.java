package com.syning.maven.mappers;

import com.syning.maven.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {

    // 根据 Person中的mid 查询所有的 Message 对象
    List<Message> getAllMessageByMid(@Param("mid") Integer mid);


    // 查询所有的 Message 对象
    List<Message> getAllMessage();


    // 根据 mid 获取单条 Message 对象
    Message getMessageByMid(@Param("mid") Integer mid);


    // 给 Message 对象添加回复
    int updateReply(@Param("reply") String reply, @Param("mid") Integer mid);


    // 添加消息
    int insertMessage(@Param("pid") Integer pid, @Param("mes") Message mes);

    // 设置已读
    int setRead(@Param("mid") Integer mid);

    // 删除消息
    int deleteMessage(@Param("mid") Integer mid);

}
