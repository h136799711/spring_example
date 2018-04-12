package com.hebidu.example.test1;


import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Test1Main {


    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Test1Main.class);
        app.run(args);

        System.out.println("Web Application Type " + app.getWebApplicationType().name());
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

}
