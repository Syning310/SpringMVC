package com.syning.maven.service;


import com.syning.maven.mappers.PersonMapper;
import com.syning.maven.pojo.Person;
import com.syning.maven.sqlutils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service(value = "personService")
public class PersonService {


    public Person getPersonByNameAndPwd(Person p) {
        SqlSession sqlSession = SqlSessionUtils.getSQlSession();
        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
        Person person = personMapper.getPersonByPerson(p);
        return person;
    }





}
