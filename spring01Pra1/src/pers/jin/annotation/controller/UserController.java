package pers.jin.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.jin.annotation.service.UserService;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/26 20:24
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void regist(){
        userService.handleAddUser();
    }
}
