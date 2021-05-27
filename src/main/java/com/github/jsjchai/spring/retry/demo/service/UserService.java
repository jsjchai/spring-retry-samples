package com.github.jsjchai.spring.retry.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.RetryException;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @author jsjchai
 */
@Service
@Slf4j
public class UserService {

    /**
     * 默认重试三次
     */
    @Retryable(RetryException.class)
    public void update() {
        log.info("update");
        throw new RetryException("更新失败");
    }

    public void insert(){
        log.info("insert");
        throw new RetryException("新增失败");
    }


    @Recover
    public void recover(RemoteAccessException e) {
        // ... panic
    }
}
