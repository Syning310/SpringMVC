import com.syning.mybatis.mappers.DynamicSQLMapper;
import com.syning.mybatis.pojo.Dept;
import com.syning.mybatis.pojo.Emp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicSQLMapperTest {

    // 1、测试 <if>  <where>  <trim>
    // List<Emp> getEmpByCondition(@Param("emp") Emp emp);
    @Test
    public void testGetEmpByCondition() {
        DynamicSQLMapper mapper = SqlSessionUtils.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "宁", 4000, "男");
        List<Emp> emps = mapper.getEmpByCondition(emp);
        for (Emp e : emps) {
            System.out.println(e);
        }
    }


    // 2、测试 <choose>  <when>  <otherwise>
    // List<Emp> getEmpByChoose(Emp emp);
    @Test
    public void testGetEmpByChoose() {
        DynamicSQLMapper mapper = SqlSessionUtils.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "宁", 4000, "男");
        List<Emp> emps = mapper.getEmpByChoose(emp);
        for (Emp e : emps) {
            System.out.println(e);
        }
    }


    // 3、通过传入数组参数，实现批量删除
    // int deleteMoreByArrays(@Param("eids") Integer[] eids);
    @Test
    public void testDeleteMoreByArrays() {
        DynamicSQLMapper mapper = SqlSessionUtils.getMapper(DynamicSQLMapper.class);
        Integer[] ins = {-11, -12, -13, -14};
        int ret = mapper.deleteMoreByArrays(ins);
        System.out.println("ret = " + ret);
    }





    // 4、通过List集合实现批量添加的功能
    // int insertMoreByList(List<Emp> emps);
    @Test
    public void testInsertMoreByList() {
        DynamicSQLMapper mapper = SqlSessionUtils.getMapper(DynamicSQLMapper.class);
        Dept dept = new Dept(1, "大冥山");
        Emp e1 = new Emp(null, "曦", 5000, "女");
        e1.setDept(dept);
        Emp e2 = new Emp(null, "心", 4500, "女");
        e2.setDept(dept);
        List<Emp> emps = new ArrayList<>();
        emps.add(e1);
        emps.add(e2);
        int ret = mapper.insertMoreByList(emps);
        System.out.println("ret = " + ret);

        for (Emp emp : emps) {
            System.out.println(emp);
        }


    }



}
