package com.syning.mvc.controller;


import com.syning.mvc.dao.EmployeeDAO;
import com.syning.mvc.javabean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    @Qualifier(value = "employeeDAO")
    private EmployeeDAO employeeDAO;




    // 获取所有的人员信息，然后保存包域对象中
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView getAllEmployee() {
        Collection<Employee> employeeList = employeeDAO.getAll();

        ModelAndView mav = new ModelAndView();

        // 保存到 request 作用域中
        mav.addObject("employeeList", employeeList);

        mav.setViewName("employee_list");

        return mav;
    }


    // 根据id删除人员信息
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id") Integer id) {
        employeeDAO.delete(id);
        return "redirect:/employee";   // 相当于地址栏输入请求访问，而地址栏输入请求默认是 GET 请求，也就会找到上面的 getAllEmployee 方法
    }



    // 添加人员信息
    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String addEmployee(Employee emp) {
        employeeDAO.save(emp);

        // 相当于地址栏输入请求访问，而地址栏输入请求默认是 GET 请求，也就会找到上面的 getAllEmployee 方法
        return "redirect:/employee";
    }


    // 跳转修改页面，实现回显信息
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public ModelAndView getEmployeeById(@PathVariable("id") Integer id) {
        Employee emp = employeeDAO.get(id);

        ModelAndView mav = new ModelAndView();

        mav.addObject("employee", emp);

        mav.setViewName("employee_update");

        return mav;
    }


    // 实现修改功能
    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployeeById(Employee employee) {
        employeeDAO.save(employee);
        return "redirect:/employee";
    }



}
