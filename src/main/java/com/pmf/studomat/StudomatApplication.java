package com.pmf.studomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.pmf.studomat.repository",
        "com.pmf.studomat.business.logic",
        "com.pmf.studomat.presentation"}
        /*,exclude = {DataSourceAutoConfiguration.class }*/)
public class StudomatApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudomatApplication.class, args);
    }
}
