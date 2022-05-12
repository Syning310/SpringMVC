package com.syning.test;


import com.syning.mybatis.entity.Person;
import com.syning.mybatis.entity.PersonExample;
import com.syning.mybatis.mappers.PersonMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = {"classpath:spring-persist.xml"})
public class TestDataSource {

    @Autowired
    private DataSource dataSource;


    // 这个接口类型在 module02 中，而 idea 无法找到，所以报错，而运行时不会有错误
    @Autowired
    private PersonMapper personMapper;


    @Test
    public void testPersonMapper() {
        List<Person> personList = personMapper.selectByExample(new PersonExample());
        for (Person p : personList) {
            System.out.println(p);
        }
    }




    @Test
    public void testDataSource() throws Exception {
        Connection cons = dataSource.getConnection();

        System.out.println("cons = " + cons);


    }






}
