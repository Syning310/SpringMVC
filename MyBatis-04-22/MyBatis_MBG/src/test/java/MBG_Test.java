import com.syning.mybatis.mappers.EmpMapper;
import com.syning.mybatis.pojo.Emp;
import com.syning.mybatis.pojo.EmpExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class MBG_Test {

    public static SqlSession getSqlSession() {
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);

            return sqlSessionFactory.openSession();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testMBG() {
        SqlSession sqlSession = getSqlSession();

        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        List<Emp> lst = empMapper.selectByExample(null);

        for (Emp e : lst) {
            System.out.println("姓名 = " + e.getEmpName() + ", 年龄 = " + e.getAge() + ", 性别 = " + e.getSex());
        }

    }



    @Test
    public void testMapper() {

        SqlSession sqlSession = getSqlSession();

        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);

        // 查询所有数据
//        List<Emp> lst = empMapper.selectByExample(null);
//        lst.forEach(emp -> System.out.println(emp));


        // 根据条件查询
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("霞");
        example.or().andDidIsNotNull();
        List<Emp> lst = empMapper.selectByExample(example);
        lst.forEach(emp -> System.out.println(emp));



    }



}
