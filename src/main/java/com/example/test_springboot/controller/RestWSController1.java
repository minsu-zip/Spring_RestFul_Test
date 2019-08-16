package com.example.test_springboot.controller;

import com.example.test_springboot.Service.conserive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestWSController1{
    @Autowired
    conserive con;
    @RequestMapping(value = "/ws/organizationList")
    public Object actionMethod(){
      Object resultObject = new Object();
      resultObject = con.actionMethod();
      return resultObject;
    }
}