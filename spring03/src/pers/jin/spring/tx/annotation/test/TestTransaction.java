package pers.jin.spring.tx.annotation.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.jin.spring.tx.annotation.dao.BookShopDao;
import pers.jin.spring.tx.annotation.service.BookShopService;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 19:39
 */
public class TestTransaction {
    private BookShopDao bookShopDao;
    private BookShopService bookShopService;
    @Before
    public void init(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc2.xml");
        bookShopDao = ctx.getBean("bookShopDaoImpl",BookShopDao.class);
        bookShopService = ctx.getBean("bookShopServiceImpl",BookShopService.class);
    }
    @Test
    public void testTransaction(){
        bookShopService.buyBook("Tom", "1001");
    }
}
