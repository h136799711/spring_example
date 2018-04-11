package com.hebidu.example.app.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAutoConfiguration
public class TestCfg {


    public static void main(String[] args) {
        ApplicationContext $context = new ClassPathXmlApplicationContext("application-spring.xml");
        Config1 $cfg = (Config1) $context.getBean("Config1");

        System.out.println($cfg);
    }


}
