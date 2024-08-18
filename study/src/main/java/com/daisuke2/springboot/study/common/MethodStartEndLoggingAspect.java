package com.daisuke2.springboot.study.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class MethodStartEndLoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.daisuke2.springboot.study.controller.*.*(..))")
    public void startLog(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + "メソッドが開始しました");
    }

    @After("execution(* com.daisuke2.springboot.study.controller.*.*(..))")
    public void endLog(JoinPoint joinPoint) {
        logger.info(joinPoint.getSignature().getName() + "メソッドが終了しました");
    }
}
