package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //注入service
    //@Autowired//本地的注入
    // 在本地spring容器里面找有没有对应的bean，现在不需要了，因为我们是spring里面就没有这个bean
    /*
        1. 从zookeeper注册中心获取userService的访问路径
        2. 进行远程调用RPC
        3. 将结果封装为一个代理对象。给变量赋值

        其实就是把service容器中的对象序列化，然后传给web容器反序列化后自动注入
     */
    @Reference//远程注入
    private UserService userService;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return userService.sayHello();
    }


    /**
     *根据id 查询用户信息
     */
    int i=1;
    @RequestMapping("/find")
    public User find(Integer id){
        // // int i=1;
        // new Thread(new Runnable() {
        //     public void run() {
        //         while (true) {
        //             System.out.println(i++);
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // }).start();

        return userService.findUserById(id);
    }




}

