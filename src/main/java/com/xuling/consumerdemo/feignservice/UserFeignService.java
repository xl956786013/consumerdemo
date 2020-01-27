package com.xuling.consumerdemo.feignservice;

import com.xuling.consumerdemo.model.Result;
import com.xuling.consumerdemo.model.User;
import com.xuling.consumerdemo.model.dto.UserDto;
import com.xuling.consumerdemo.model.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider-service")
public interface UserFeignService {
    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @RequestMapping("/getUserById")
    public User getUserById(Integer id);

    /**
     * 根据用户名查询用户
     * @param userName
     * @param delFlg
     * @return
     */
    @RequestMapping("/getUserByUserName")
    public User getUserByUserName(@RequestParam("userName")String userName, @RequestParam("delFlg")Integer delFlg);

    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping("/registerUser")
    public Result<String> registerUser(UserDto user);

    /**
     * 查询用户列表
     * @param user
     * @return
     */
    @RequestMapping("/queryUserPage")
    Result<List<UserVo>> queryUserPage(UserDto user);

    /**
     * 根据用户id删除用户
     * @param userDto
     * @return
     */
    @RequestMapping("/deleteUserByIdList")
    Result<String> deleteUserByIdList(UserDto userDto);
}
