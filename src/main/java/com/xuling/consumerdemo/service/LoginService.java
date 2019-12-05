package com.xuling.consumerdemo.service;

import com.xuling.consumerdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoginService {
    @Value("${app.service-url}")
    private String appServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public User login(User user){
        ResponseEntity responseEntity = restTemplate.postForEntity(appServiceUrl+"login",user,User.class);
        return (User) responseEntity.getBody();
    }

}
