package com.example.empmanage.controller;

import com.example.empmanage.entity.Person;
import com.example.empmanage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class Hello {
    /*@Autowired
    PersonService personService;

    @RequestMapping("/hello")
    public String hello(){
        return "<h1>Hello.</h1>";
    }*/
    @RequestMapping
    public String index(){ return "index";}


}
