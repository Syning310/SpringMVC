package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    // 参数如果只传入一个实体类对象，那么在映射文件中可以直接用 属性名 访问 属性值
    // 当然最好是加上 @Param 注解
    // 1、测试 <if>  <where>  <trim>
    List<Emp> getEmpByCondition(@Param("emp") Emp emp);



    // 2、测试 <choose>  <when>  <otherwise>
    List<Emp> getEmpByChoose(@Param("emp") Emp emp);


    // 3、通过传入数组参数，实现批量删除
    int deleteMoreByArrays(@Param("eids") Integer[] eids);




    // 4、通过List集合实现批量添加的功能
    int insertMoreByList(@Param("emps") List<Emp> emps);










}
