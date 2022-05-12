package com.syning.maven.pojo;

import java.util.List;

public class Person {

    private Integer pid;
    private String pName;
    private Integer pAge;
    private String pSex;
    private String pwd;



    private List<Message> mes;   // 一对多，一个人可以有多条消息

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pName='" + pName + '\'' +
                ", pAge=" + pAge +
                ", pSex='" + pSex + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public List<Message> getMes() {
        return mes;
    }

    public void setMes(List<Message> mes) {
        this.mes = mes;
    }

    public Person() {}

    public Person(Integer pId, String pName, Integer pAge, String pSex, String pwd) {
        this.pid = pId;
        this.pName = pName;
        this.pAge = pAge;
        this.pSex = pSex;
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public Integer getpId() {
        return pid;
    }

    public void setpId(Integer pId) {
        this.pid = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpAge() {
        return pAge;
    }

    public void setpAge(Integer pAge) {
        this.pAge = pAge;
    }

    public String getpSex() {
        return pSex;
    }

    public void setpSex(String pSex) {
        this.pSex = pSex;
    }
}
