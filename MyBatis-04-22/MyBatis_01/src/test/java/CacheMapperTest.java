import com.syning.mybatis.mappers.CacheMapper;
import com.syning.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class CacheMapperTest {


    @Test
    public void test01() {
        CacheMapper mapper = SqlSessionUtils.getMapper(CacheMapper.class);
        Emp emp = mapper.getEmpByEid(4);
        System.out.println(emp);
        System.out.println("===========================");
        Emp emp2 = mapper.getEmpByEid(4);  // 第二次调用方法没有执行 SQL 语句(日志没有输出)，说明是从缓存中取出数据的
        System.out.println(emp2);
        System.out.println("===========================");
        CacheMapper mapper2 = SqlSessionUtils.getMapper(CacheMapper.class);  // 这里又重新获取了SqlSession
        Emp emp3 = mapper2.getEmpByEid(4);      // 所以这里会执行 SQL 语句，因为缓存的范围是 SqlSession
        System.out.println(emp3);
    }




    @Test
    public void testCache() throws Exception {

        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

        SqlSession sqlSession1 = sqlSessionFactory.openSession();

        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);

        Emp e1 = mapper1.getEmpByEid(6);
        System.out.println(e1);

        sqlSession1.commit();  // 提交事务



        SqlSession sqlSession2 = sqlSessionFactory.openSession();

        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);

        Emp e2 = mapper2.getEmpByEid(6);
        System.out.println(e2);


    }









}
