package com.xuling.consumerdemo.controller;

import com.xuling.consumerdemo.model.User;
import com.xuling.consumerdemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    // http://localhost:8763/login
    @RequestMapping("/login")
    public User login(User user){
        user.setId(66L);
        return loginService.login(user);
    }
}
