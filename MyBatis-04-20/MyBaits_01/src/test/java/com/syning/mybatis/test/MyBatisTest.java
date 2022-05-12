package com.syning.mybatis.test;

import com.syning.mybatis.mapper.UserMapper;
import com.syning.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    /**
     *  SqlSession 默认不自动提交事务，若需要自动提交事务
     *  可以使用 sqlSessionFactory.openSession(true);
     *
     */


    // 添加功能
    @Test
    public void test01() throws IOException {
        // 加载核心配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        // 获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取 Mapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 测试功能
        int ret = userMapper.insertUser();
        System.out.println("ret = " + ret);

        // 提交事务
        //sqlSession.commit();
    }


    @Test
    public void testUpdate() throws IOException {
        // 加载核心配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        // 获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取 Mapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 测试功能
        int ret = userMapper.updateUser();
        System.out.println("ret = " + ret);

    }


    @Test
    public void testDelete() throws IOException {
        // 加载核心配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        // 创建 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取 sqlSessionFacotry 对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        // 获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 获取 Mapper 接口的代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        // 使用功能
        int ret = mapper.deleteUser();

        System.out.println("ret = " + ret);
    }



    @Test
    public void testSelect() throws IOException {

        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUser();

        System.out.println("user = " + user);


    }


    @Test
    public void testSelectList() throws IOException {

        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> lst = mapper.getUserList();

        System.out.println(lst);

    }





}
