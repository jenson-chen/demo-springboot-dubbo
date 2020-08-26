package com.lsnu.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lsnu.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author Jenson
 * @since 2020/8/26 16:32
 **/
@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService{

    @Override
    public String select(String username) {
        System.out.println("===========数据库中查询========");
        System.out.println("=============查询成功==========");
        return username;
    }

}
