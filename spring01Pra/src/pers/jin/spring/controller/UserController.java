package pers.jin.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.jin.spring.service.UserService;

/**
 * @Author: DEUSJIN
 * @Date: 2020/12/15 9:34
 */
@Controller
/**
 * 相当于在xml文件中
 * <beans id="userController" class="pers.jin.spring.handler.UserController">
 *     注解默认id值为类名首字母小写
 **/
public class UserController {
    @Autowired
    private UserService userService;
    public void regist(){
        userService.handleAddUser();
    }
}
