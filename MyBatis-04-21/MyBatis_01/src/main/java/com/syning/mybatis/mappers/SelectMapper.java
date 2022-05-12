package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     *  MyBatis的各种查询功能
     *      1、若查询出来的数据只有一条，可以通过实体类对象 或者 集合 接收
     *      2、若查询出的数据有多条，一定不能通过实体类对象接收，此时会抛出异常 TooManyResultsException
     */


    // 1、根据 id 查询用户信息
    User getUserById(@Param("id") Integer id);



    // 2、查询所有的用户信息
    List<User> getAllUser();



    // 3、查询用户信息的总记录数
    Integer getCount();



    // 4、根据 id 查询用户信息为一个 map 集合
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);



    // 5、查询所有用户信息为map集合
    //List<Map<String, Object>> getAllUserToMap();   // 第一种方式

    @MapKey("id")
    Map<String, Object> getAllUserToMap();   // 第二种方式






}
