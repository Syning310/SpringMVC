package test;

import com.syning.mybatis.mappers.SelectMapper;
import com.syning.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TestsSelectMapper {


    // 1、 User getUserById(@Param("id") Integer id);
    @Test
    public void test01() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        User user = mapper.getUserById(6);
        System.out.println("user = " + user);
    }


    // 2、List<User> getAllUser();
    @Test
    public void test02() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        List<User> lst = mapper.getAllUser();
        for (User u : lst) {
            System.out.println(u);
        }
    }



    // 3、Integer getCount();
    @Test
    public void test03() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println("count = " + count);
    }




    // 4、Map<String, Object> getUserByIdToMap(@Param("id") Integer id);
    @Test
    public void test04() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> map = mapper.getUserByIdToMap(7);
        System.out.println(map);
    }



    // 5、
    @Test
    public void test05() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        // 第一种方式
//        List<Map<String, Object>> lst = mapper.getAllUserToMap();
//        for (Map<String, Object> m : lst) {
//            System.out.println(m);
//        }
        
        
        // 第二种方式
        Map<String, Object> map = mapper.getAllUserToMap();

        System.out.println(map);
        
    }



}
