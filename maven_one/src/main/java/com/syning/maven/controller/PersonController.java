package com.syning.maven.controller;

import com.syning.maven.pojo.Person;
import com.syning.maven.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class PersonController {

    @Autowired
    @Qualifier(value = "personService")
    private PersonService personService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String login(Person person, HttpSession session) {

        Person p = personService.getPersonByNameAndPwd(person);

        if (p == null) {
            return "fail";
        }

        session.setAttribute("current", p);

        return "forward:/message";
    }



}
