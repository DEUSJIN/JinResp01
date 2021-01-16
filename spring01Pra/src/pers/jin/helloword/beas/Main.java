package pers.jin.helloword.beas;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/12 9:22
 */
public class Main {
    @Test
    public void test1() throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("spring-datasource.xml");
        //获取配置
//        DataSource ds = ctx1.getBean("dataSource", DataSource.class);
//        System.out.println(ds);
//        Connection conn = ds.getConnection();
//        System.out.println(conn);
//        conn.close();

//        PreparedStatement ps = conn.prepareStatement("select *from ?");
//        ps.setString(1, "myfriend");
//        System.out.println(ctx.getBean("person1", Person.class));
//        Map carMap = ctx.getBean("carMap", Map.class);
//        System.out.println(carMap);
//        System.out.println(ctx.getBean("car4"));
        //自动装配
        System.out.println(ctx.getBean("person1"));
    }
}
