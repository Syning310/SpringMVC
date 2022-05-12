package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {



    // 1、查询 t_emp 表所有的人员信息
    List<Emp> getAllEmp();



    // 2、查询员工以及员工所对应的部门信息
    Emp getEmpAndDept(@Param("eid") Integer eid);



    // 3、通过分布查询，查询员工及员工所对应的部门信息 -> 第一步
    Emp getEmpAndDeptByStepOne(@Param("eid") Integer eid);



    // 5、通过分布查询查询部门，以及部门中所有的员工信息  ->  第二步
    List<Emp> getDeptAndEmpsByStepTwo(@Param("did") Integer did);



}
