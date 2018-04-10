package com.hebidu.example.test1;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Main {



    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Test1Main.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);
    }

}
