package com.xuling.consumerdemo.controller;

import com.xuling.consumerdemo.feignservice.LoginFeignService;
import com.xuling.consumerdemo.model.User;
import com.xuling.consumerdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private LoginFeignService loginFeignService;

    // http://localhost:8763/test/getService?info=123
    @RequestMapping("/getService")
    public String callService(String info){
        return testService.callService(info);
    }

    // http://localhost:8763/test/feignLogin
    @RequestMapping("/feignLogin")
    public User getService(User user){
        user.setId(77L);
        return loginFeignService.feignLogin(user);
    }
}
