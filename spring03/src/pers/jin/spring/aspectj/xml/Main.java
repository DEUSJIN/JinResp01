package pers.jin.spring.aspectj.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/28 20:34
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aspectj_xml.xml");
        ArithmeticCalculator ac = ctx.getBean("arithmeticCalculatorImpl", ArithmeticCalculator.class);
        ac.add(1, 2);
    }
}
