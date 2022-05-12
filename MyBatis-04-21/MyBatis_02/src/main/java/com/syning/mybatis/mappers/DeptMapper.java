package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    // 3、通过分布查询，查询员工及员工所对应的部门信息 -> 第二步
    // 通过 did 查询员工所对应的部门
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);



    // 4、获取部门以及部门中所有的员工信息
    Dept getDeptAndEmps(@Param("did") Integer did);




    // 5、通过分布查询查询部门，以及部门中所有的员工信息  ->  第一步
    Dept getDeptAndEmpsByStepOne(@Param("did") Integer did);




}
