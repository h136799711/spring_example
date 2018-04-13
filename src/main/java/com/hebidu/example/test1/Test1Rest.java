package com.hebidu.example.test1;


import com.hebidu.example.test1.db.TestMysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test_rest")
public class Test1Rest {

    @Value("${spring.application.name}")
    private String name;


    @Autowired
    private TestMysql testMysql;


    @Autowired
    private Config1 cfg1;

    @RequestMapping("/db")
    String db() {
        if (this.testMysql == null) {
            return "autowired failed";
        }
        this.testMysql.test();
        return "success";
    }

    @RequestMapping("/")
    String index()
    {
        return "Hello index Update";
    }

    @RequestMapping("/test")
    String test()
    {
        return "Hello test33";
    }

    @RequestMapping("/cfg1")
    Config1 cfg1() {
        return cfg1;
    }


// webflux 下无法使用
//    @RequestMapping("/req")
//    String req(HttpServletRequest request)
//    {
//        return request.getRemoteAddr();
//    }

}
