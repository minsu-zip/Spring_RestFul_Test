package com.example.test_springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class twoproject2 {
    @RequestMapping(value = "/remote/twoproject2", method = RequestMethod.GET)
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object resultObject = new Object();
        String keyid = "bf33cd622a6f84f143c300c0757e43d3";
        String targeturi = "https://samples.openweathermap.org/data/2.5/forecast?q=London,us&appid=" + keyid;
        resultObject = restTemplate.getForObject(targeturi, Object.class);
        return resultObject;
    }
}
