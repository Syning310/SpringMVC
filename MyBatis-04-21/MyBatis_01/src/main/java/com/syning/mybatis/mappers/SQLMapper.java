package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {


    // 1、根据用户名模糊查询用户信息
    List<User> getUserByLike(@Param("name") String name);



    // 2、批量删除
    int deleteMore(@Param("ids") String ids);



    // 3、查询指定表中的数据
    List<User> getUserByTableName(@Param("tableName") String tableName);



    // 4、添加用户信息
    int insertUser(User user);




}
