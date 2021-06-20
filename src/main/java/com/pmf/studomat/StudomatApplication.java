package com.pmf.studomat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

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
