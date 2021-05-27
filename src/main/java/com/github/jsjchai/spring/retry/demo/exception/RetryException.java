package com.github.jsjchai.spring.retry.demo.exception;

/**
 * 重试异常
 * @author jsjchai
 */
public class RetryException extends RuntimeException {


    public RetryException(String message) {
        super(message);
    }
}
