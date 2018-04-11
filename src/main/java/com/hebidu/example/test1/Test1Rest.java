package com.hebidu.example.test1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Rest {

    @Autowired
    private Config1 cfg1;

    @RequestMapping("/")
    String index()
    {
        return "Hello index Update";
    }

    @RequestMapping("/test")
    String test()
    {
        return "Hello test";
    }

    @RequestMapping("/cfg1")
    String cfg1() {
        if (cfg1 == null) return "autowired failed!";
        return cfg1.toString();
    }
}
