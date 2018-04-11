package com.hebidu.example.test1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value = 1)
@Component
public class Runner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner1 is running ");
    }
}
