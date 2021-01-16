package pers.jin.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/15 9:35
 */
@Repository
public class UserDaoJdbcImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户......");
    }
}
