package pers.jin.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jin.spring.dao.UserDao;
import pers.jin.spring.dao.UserDaoJdbcImpl;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/15 9:35
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void handleAddUser() {
        //处理业务
//        最后
        userDao.addUser();
    }
}
