package com.syning.mybatis.pojo;

import java.util.List;

public class Dept {

    private Integer did;
    private String deptName;

    // 1 : 多     创建人员的集合即可
    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    public Dept() {
    }

    public Dept(Integer did, String deptName) {
        this.did = did;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "{ 部门(did) = " + did + ", 部门名称(deptName) = " + deptName + " }";
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
