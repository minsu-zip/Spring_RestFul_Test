package com.example.test_springboot.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    public Object actionMethod(){
        Map<String, Object> resultObject = new HashMap<String, Object>();
        resultObject.put("MEMBER_ID", "293029301202");
        resultObject.put("CELLPHONE", "001-3923-6940");
        resultObject.put("PASSWORD", "!@#ASD123");
        return resultObject;
    }
}