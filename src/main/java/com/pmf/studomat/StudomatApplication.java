package com.pmf.studomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pmf.studomat")
@EnableAutoConfiguration
public class StudomatApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudomatApplication.class, args);
    }
}
