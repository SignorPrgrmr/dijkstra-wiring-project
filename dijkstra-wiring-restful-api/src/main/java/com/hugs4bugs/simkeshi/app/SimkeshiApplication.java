package com.hugs4bugs.simkeshi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hugs4bugs")
public class SimkeshiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimkeshiApplication.class, args);
    }

}
