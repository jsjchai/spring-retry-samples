package com.github.jsjchai.spring.retry.demo.service;

import com.github.jsjchai.spring.retry.demo.SpringRetrySamplesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.retry.RetryException;
import org.springframework.retry.support.RetryTemplate;

@SpringBootTest(classes = SpringRetrySamplesApplication.class)
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void update() {
        userService.update();
    }

   private final RetryTemplate template = RetryTemplate.builder()
            .maxAttempts(3)
            .fixedBackoff(1000)
            .retryOn(RetryException.class)
            .build();

    @Test
    void insert() {
        template.execute(e->{
            userService.insert();
            return null;
        });

    }

}