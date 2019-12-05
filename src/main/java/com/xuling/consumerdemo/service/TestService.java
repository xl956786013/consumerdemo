package com.xuling.consumerdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {
    @Value("${app.service-url}")
    private String appServiceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public String callService(String info){
        ResponseEntity responseEntity = restTemplate.postForEntity(appServiceUrl+"getService/"+info,null,String.class);
        return responseEntity.getBody().toString();
    }
}
