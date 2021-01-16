package pers.jin.spring.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 20:30
 */
@Component
@Aspect
public class LoggingAspect {
    @Pointcut("execution(public double pers.jin.spring.aspectj.annotation.ArithmeticCalculatorImpl.add(double,double))")
    public void pointcut(){}
    @Before("pointcut()")
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println(name+"====>"+ Arrays.asList(args));
    }
    @After("pointcut()")
    public void afterMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"====>");
    }
    @AfterReturning(value = "pointcut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        System.out.println(result);
    }
}
