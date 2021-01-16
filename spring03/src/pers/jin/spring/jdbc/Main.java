package pers.jin.spring.jdbc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/29 16:19
 */
public class Main {
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testJdbcTemplate(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
        jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into user(username,password)values(?,?)";
        jdbcTemplate.update(sql,"小红","123456");
    }

}
