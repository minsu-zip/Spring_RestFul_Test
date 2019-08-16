package com.example.test_springboot.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class conserive {
    public Object actionMethod() {
        ArrayList<Object> resultObject = new ArrayList<Object>();
        Map<String, Object> data01 = new HashMap<String, Object>();
        data01.put("AA","1030293012");
        data01.put("BB","2030293013");
        data01.put("CC","3030293014");
        data01.put("DD","4030293015");
        data01.put("EE","5030293016");
        resultObject.add(data01);
        return resultObject;
    }
}
