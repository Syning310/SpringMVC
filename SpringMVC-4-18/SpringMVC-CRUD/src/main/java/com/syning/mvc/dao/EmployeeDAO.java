package com.syning.mvc.dao;


import com.syning.mvc.javabean.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository(value = "employeeDAO")
public class EmployeeDAO {

    private static Map<Integer, Employee> employees = null;

    static{
        employees = new HashMap<Integer, Employee>();

        employees.put(1001, new Employee(1001, "无霞", "女", "白衣谷"));
        employees.put(1002, new Employee(1002, "无月", "女", "无间岭"));
        employees.put(1003, new Employee(1003, "无心", "女", "不夜天"));
        employees.put(1004, new Employee(1004, "月兮", "女", "凤凰谷"));
        employees.put(1005, new Employee(1005, "极望", "男", "不夜天"));
    }

    private static Integer initId = 1006;

    public void save(Employee employee){
        if(employee.getId() == null){
            employee.setId(initId++);
        }
        employees.put(employee.getId(), employee);
    }

    public Collection<Employee> getAll(){
        return employees.values();
    }

    public Employee get(Integer id){
        return employees.get(id);
    }

    public void delete(Integer id){
        employees.remove(id);
    }
}