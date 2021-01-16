package pers.jin.helloword.beas;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jin.spring.controller.UserController;
import pers.jin.spring.dao.UserDaoJdbcImpl;
import pers.jin.spring.service.UserServiceImpl;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/14 16:49
 */
public class Test {
    @org.junit.Test
    public void test0(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
        UserController uc = ctx.getBean("userController", UserController.class);
        System.out.println(uc);
        UserServiceImpl usi = ctx.getBean("userServiceImpl", UserServiceImpl.class);
        System.out.println(usi);
        UserDaoJdbcImpl udi = ctx.getBean("userDaoJdbcImpl", UserDaoJdbcImpl.class);
        System.out.println(udi);
        uc.regisit();
    }
}
