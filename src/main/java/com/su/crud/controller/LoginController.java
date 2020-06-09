package com.su.crud.controller;


import com.su.crud.pojo.User;
import com.su.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {


    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show() {
        return "login";
    }

    /*
     * 登录
     * */
    @PostMapping("/loginIn")
    public String login(String name, String password) {
        User user = userService.loginIn(name, password);

        if (user != null) {
            return "success";
        } else {
            return "error";
        }
    }

}
