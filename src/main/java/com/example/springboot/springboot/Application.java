package com.example.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.example.springboot.springboot")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
