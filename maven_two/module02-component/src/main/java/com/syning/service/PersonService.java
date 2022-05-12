package com.syning.service;

import com.syning.mybatis.entity.Person;
import com.syning.mybatis.entity.PersonExample;
import com.syning.mybatis.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;


    public Person getPersonByLogin(String name, String pwd) {

        // 通过 QBC 查询方式 封装查询条件
        PersonExample example = new PersonExample();

        PersonExample.Criteria criteria = example.createCriteria();

        criteria.andPNameEqualTo(name).andPwdEqualTo(pwd);

        List<Person> lst = personMapper.selectByExample(example);

        if (lst != null && lst.size() > 0) {
            // 返回查询结果
            return lst.get(0);
        }

        return null;
    }




}
