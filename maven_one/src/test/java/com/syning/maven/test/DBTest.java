package com.syning.maven.test;

import com.syning.maven.mappers.PersonMapper;
import com.syning.maven.pojo.Person;
import com.syning.maven.sqlutils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DBTest {


    @Test
    public void testInsert() {

        SqlSession sqlSession = SqlSessionUtils.getSQlSession();
        try {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

            personMapper.insertPerson(new Person(null, "霞", 8, "女", "syning"));

            sqlSession.commit();
        }
        catch (Exception e) {
            sqlSession.rollback();
            System.out.println("----------事务回滚----------");
        }
    }



    @Test
    public void testUpdata() {

        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        try {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

            personMapper.updatePerson(new Person(1, "宁", 2000, "男", "syning"));
            personMapper.updatePerson(new Person(2, "霞", 8, "女", "syning"));

            sqlSession.commit();
        }
        catch (Exception e) {
            sqlSession.rollback();
            System.out.println("----------事务回滚----------");
        }

    }


    @Test
    public void showPersonList() {

        SqlSession sqlSession = SqlSessionUtils.getSQlSession();

        PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);

        List<Person> lst = personMapper.getAllPerson();

        for (Person p : lst) {
            System.out.println(p);

        }




    }


}
