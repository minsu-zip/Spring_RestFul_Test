package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RestAjaxController {
    @RequestMapping(value = "/api/ajaxll", method = RequestMethod.POST)
    public String getParmWithAjax() {
        return "Welcome to Hellow World !! ";
    }
}
