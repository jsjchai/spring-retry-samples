## [重试框架 spring-retry](https://github.com/spring-projects/spring-retry)
* @Retryable
```java
   /**
     * 默认重试三次
     */
    @Retryable(RetryException.class)
    public void update() {
        log.info("update");
        throw new RetryException("更新失败");
    }
   
```
* RetryTemplate
```java
RetryTemplate template = RetryTemplate.builder()
            .maxAttempts(3)
            .fixedBackoff(1000)
            .retryOn(RetryException.class)
            .build();
```
