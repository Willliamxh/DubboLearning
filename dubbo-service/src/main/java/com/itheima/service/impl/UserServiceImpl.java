package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;


@Service//spring框架注入的service 将该类的对象创建出来 放倒springIOC容器中
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello dubbo!~";
    }
}
