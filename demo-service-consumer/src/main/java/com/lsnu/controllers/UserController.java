package com.lsnu.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lsnu.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jenson
 * @since 2020/8/26 17:01
 **/
@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("/dubbo-test")
    public String test(String username){
        System.out.println("===注入状态："+userService+"===");
        System.out.println("====前端传入数据："+username+"====");
        return userService.select(username);
    }

}
