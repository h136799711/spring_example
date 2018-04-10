package com.hebidu.example.test1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Rest {

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


}
