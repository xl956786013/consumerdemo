package com.xuling.consumerdemo.feignservice;

import com.xuling.consumerdemo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider-service")
public interface LoginFeignService {
    @RequestMapping("/login")
    User feignLogin(User user);
}
