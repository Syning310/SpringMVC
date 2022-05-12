package com.syning.controller;

import com.syning.mybatis.entity.Person;
import com.syning.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = "/person")
    public String doLogin(Person person, HttpSession session) {

        if (person == null || "".equals(person.getpName()) || "".equals(person.getPwd())) {
            return null;
        }

        Person retPerson = personService.getPersonByLogin(person.getpName(), person.getPwd());

        if (retPerson == null) {
            return null;
        }

        session.setAttribute("current", retPerson);

        return "forward:/message";
    }



}
