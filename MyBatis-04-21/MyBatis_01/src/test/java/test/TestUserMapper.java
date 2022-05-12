package test;

import com.syning.mybatis.mappers.UserMapper;
import com.syning.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserMapper {

    public static SqlSession getSqlSession(boolean bool){
        try {
            // 加载核心配置文件
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            // 创建 SqlSessionFactoryBuilder 对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            // 获取 SqlSessionFactory 对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

            return sqlSessionFactory.openSession(bool);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testQueryList() {

        SqlSession sqlSession = getSqlSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> lst = mapper.getList();

        for (User user : lst) {
            System.out.println(user);
        }
    }


    /**
     *  MyBatis 获取参数的两种方式  ${} - 字符串拼接        #{} - 占位符赋值  ?
     *
     */

    // 情况1(单个字面量类型的参数)：Mapper接口中方法参数为单个字面量类型：
    @Test
    public void testGetUserByName() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByName("霞");
        System.out.println(user);
    }


    // 情况2(多个字面量类型的参数)：Mapper接口中方法参数为多个时：
    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("霞", "0918");
        System.out.println(user);
    }


    // 情况3(Map集合类型的参数)：若Mapper接口中的方法需要的参数为多个时，此时可以手动创建Map集合，将这些数据放入Map中
    @Test public void testMap() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();

        map.put("name", "瑶");
        map.put("pwd", "0119");

        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }



    // 情况4(实体类类型的参数)：
    @Test
    public void testUser() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(2, "宁", "0310", 21, "男");

        User after = mapper.checkLoginByUser(user);
        System.out.println("查找user = " + after);
    }

    @Test
    public void testAddUser() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(0, "月", "0216", 18, "女");
        int ret = mapper.addUser(user);
        System.out.println("受影响行数 ret = " + ret);
    }



    // 情况5：使用@Param命名参数
    @Test
    public void testUserParam() {
        SqlSession sqlSession = getSqlSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.checkLoginByParam("曦", "0000");
        System.out.println("查找user = " + user);
    }




}
