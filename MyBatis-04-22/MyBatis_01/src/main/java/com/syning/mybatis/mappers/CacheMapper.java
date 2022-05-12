package com.syning.mybatis.mappers;

import com.syning.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {



    Emp getEmpByEid(@Param("eid") Integer eid);













}
