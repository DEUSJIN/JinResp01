package pers.jin.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.jin.annotation.dao.UserDao;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/26 20:25
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void handleAddUser() {
        userDao.addUser();
    }
}
