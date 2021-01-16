package pers.jin.annotation;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jin.annotation.controller.UserController;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/26 20:36
 */
public class AnnotationTest {
    @Test
    public void testAnnotation(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController uc = ctx.getBean("userController", UserController.class);
        uc.regist();
    }
}
