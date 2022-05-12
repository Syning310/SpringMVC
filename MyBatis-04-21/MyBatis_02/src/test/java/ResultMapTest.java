import com.syning.mybatis.mappers.DeptMapper;
import com.syning.mybatis.mappers.EmpMapper;
import com.syning.mybatis.pojo.Dept;
import com.syning.mybatis.pojo.Emp;
import org.junit.Test;

import java.util.List;

public class ResultMapTest {


    // 1、查询 t_emp 表所有的人员信息
    @Test
    public void testGetAllEmp() {
        EmpMapper empMapper = SqlSessionUtils.getMapper(EmpMapper.class);
        List<Emp> lst = empMapper.getAllEmp();
        for (Emp e : lst) {
            System.out.println(e);
        }
    }



    // 2、查询员工以及员工所对应的部门信息
    @Test
    public void testGetEmpAndDept() {
        EmpMapper empMapper = SqlSessionUtils.getMapper(EmpMapper.class);
        Emp e = empMapper.getEmpAndDept(6);
        System.out.println(e);
    }


    // 3、通过分布查询，查询员工及员工所对应的部门信息
    @Test
    public void testGetEmpAndDeptByStepOne() {
        EmpMapper empMapper = SqlSessionUtils.getMapper(EmpMapper.class);
        Emp e = empMapper.getEmpAndDeptByStepOne(7);
        System.out.println(e.getEmpName());
        System.out.println("==================================");
        System.out.println(e.getDept());
    }



    // 4、获取部门以及部门中所有的员工信息
    @Test
    public void testGetDeptAndEmps() {
        DeptMapper deptMapper = SqlSessionUtils.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDeptAndEmps(5);
        System.out.println(dept);
    }


    // 5、通过分布查询查询部门，以及部门中所有的员工信息
    @Test
    public void testGetDeptAndEmpsByStepOne() {
        DeptMapper deptMapper = SqlSessionUtils.getMapper(DeptMapper.class);
        Dept dept = deptMapper.getDeptAndEmpsByStepOne(1);
        System.out.println(dept.getDeptName());
        System.out.println("==============================");
        System.out.println(dept.getEmps());
    }


}
