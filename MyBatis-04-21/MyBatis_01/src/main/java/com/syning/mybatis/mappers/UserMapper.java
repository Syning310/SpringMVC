package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    // 查询所有用户
    List<User> getList();


    // 根据用户名查询用户信息
    User getUserByName(String name);


    // 验证登录
    User checkLogin(String name, String pwd);


    // 验证登录，参数为 Map
    User checkLoginByMap(Map<String, Object> map);


    // 验证登录，参数为 User
    User checkLoginByUser(User user);


    // 添加用户信息
    int addUser(User user);


    // 验证登录 使用 @param 注解
    User checkLoginByParam(@Param(value = "name") String name, @Param(value = "pwd") String pwd);


}


