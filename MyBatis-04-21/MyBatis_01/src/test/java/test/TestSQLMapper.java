package test;

import com.syning.mybatis.mappers.SQLMapper;
import com.syning.mybatis.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSQLMapper {

    // 1、List<User> getUserByLike(@Param("name") String name);
    @Test
    public void test01() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);

        List<User> lst = sqlMapper.getUserByLike("霞");
        for (User u : lst) {
            System.out.println(u);
        }

    }


    // 2、int deleteMore(@Param("id") String ids);
    @Test
    public void test02() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);

        int ret = sqlMapper.deleteMore("0, 1, 2");
        System.out.println("ret = " + ret);
    }



    // 3、List<User> getUserByTableName(@Param("tableName") String tableName);
    @Test
    public void test03() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);

        List<User> lst = sqlMapper.getUserByTableName("t_user");
        for (User u : lst) {
            System.out.println(u);
        }
    }



    // 4、int insertUser(User user);
    @Test
    public void test04() {
        SqlSession sqlSession = TestUserMapper.getSqlSession(true);
        SQLMapper sqlMapper = sqlSession.getMapper(SQLMapper.class);

        User user = new User(null, "极望", "0410", 19, "男");
        int update = sqlMapper.insertUser(user);
        System.out.println("受影响行数 = " + update);
        System.out.println("加入的用户 = " + user);
    }









}
