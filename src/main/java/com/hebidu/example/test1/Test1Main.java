package com.hebidu.example.test1;


import org.springframework.boot.Banner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Test1Main {

//    @Bean
//    public Config1 config1() {
//        return new Config1();
//    }

    public static void main(String[] args)
    {
        SpringApplication app = new SpringApplication(Test1Main.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);

        System.out.println("Web Application Type " + app.getWebApplicationType().name());

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[] {"application-spring.xml"});
//        System.out.println(context.getApplicationName());

    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

}
