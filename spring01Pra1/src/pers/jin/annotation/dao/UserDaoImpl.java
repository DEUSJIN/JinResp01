package pers.jin.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/26 20:26
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户。。。");
    }
}
