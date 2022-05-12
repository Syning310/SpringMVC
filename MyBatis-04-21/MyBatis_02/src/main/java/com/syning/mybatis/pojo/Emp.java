package com.syning.mybatis.pojo;

public class Emp {

    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;

    // 多 : 一    直接创建当前员工所对应的部门对象
    private Dept dept;

    @Override
    public String toString() {
        return "{ 编号(eid) = " + eid + ", 姓名(empName) = " + empName
                + ", 年龄(age) = " + age + ", 性别(sex) = " + sex
                + ", 部门(dept) = " + dept + " }";
    }



    public Emp() {  }


    public Emp(Integer eid, String empName, Integer age, String sex) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
    }

    public Integer getEid() {
        return eid;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
