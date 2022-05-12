package com.syning.maven.mappers;

import com.syning.maven.pojo.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {


    // 插入一个 Person
    int insertPerson(@Param("person") Person person);


    // 修改 Person
    int updatePerson(@Param("person") Person person);


    // 查询
    List<Person> getAllPerson();



    // 根据条件查询
    Person getPersonByPerson(@Param("p") Person p);


    // 根据 pid 获取对象
    Person getPersonByEid(@Param("pid") Integer pid);


}
