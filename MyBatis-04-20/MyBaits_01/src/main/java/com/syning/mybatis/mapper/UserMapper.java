package com.syning.mybatis.mapper;

import com.syning.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {


    /**
     *  MyBatis 面向接口编程的两个一致：
     *      1、映射文件的namespace要和Mapper接口的全类名保持一致
     *      2、映射文件中sql语句的id要和Mapper接口的方法名保持一致
     */



    /**
     *  添加用户信息
     */
    int insertUser();


    /**
     *  修改用户信息
     */
    int updateUser();


    /**
     *  删除用户信息
     */
    int deleteUser();


    /**
     *  根据 id 查询用户信息
     */
    User getUser();


    /**
     *  查询所有的用户信息
     */
    List<User> getUserList();




}
