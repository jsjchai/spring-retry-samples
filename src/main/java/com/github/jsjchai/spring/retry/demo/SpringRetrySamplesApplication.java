package com.github.jsjchai.spring.retry.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringRetrySamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRetrySamplesApplication.class, args);
    }

}
