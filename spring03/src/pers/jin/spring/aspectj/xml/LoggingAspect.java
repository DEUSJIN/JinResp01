package pers.jin.spring.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 20:30
 */
public class LoggingAspect {
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("xml:"+name+"====>"+ Arrays.asList(args));
    }
    public void afterMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("xml"+name+"====>");
    }
}
