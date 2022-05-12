package com.itheima.service.impl;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Service;


// @Service//spring框架注入的service 将该类的对象创建出来 放倒springIOC容器中
@Service //导入 dubbo的service
//将这个类提供的方法 对外发布 将访问的地址 ip 端口 路径 注册到注册中心中
public class UserServiceImpl implements UserService {

    public String sayHello() {
        return "hello dubbo 2!~";
    }

    public User findUserById(Integer id) {
        // System.out.println("version1.0");
        // System.out.println("服务被调用了："+ i++ +"次");
        // //查询User对象
        User user = new User(id, "zhangsan", "123");
        //数据库查询很慢
        // try {
        //     Thread.sleep(5000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        return user;
    }
}
