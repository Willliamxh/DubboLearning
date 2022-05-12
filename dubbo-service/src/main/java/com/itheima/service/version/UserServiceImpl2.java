package com.itheima.service.version;// package com.itheima.service.impl;
//
// import com.itheima.pojo.User;
// import com.itheima.service.UserService;
// import org.apache.dubbo.config.annotation.Service;
//
// /**
//  * @Author Willam_xh
//  * @Date 2022-05-06 15:31
//  */
// // @Service//将该类的对象创建出来 放倒springIOC容器中
// // @Service(timeout = 3000,retries = 2) //将这个类提供的方法 对外发布 将访问的地址 ip 端口 路径 注册到注册中心中
// //timeout建议配置在服务提供方，因为服务提供方比较了解业务需要多久时间
// //当前服务3秒超市，并且重试两次，一共试三次
// @Service(version = "v2.0")
// public class UserServiceImpl2 implements UserService {
//     public String sayHello() {
//         return "hello dubbo~";
//     }
//
//     // int i=1;
//     public User findUserById(Integer id) {
//         System.out.println("version 2.0");
//         // System.out.println("服务被调用了："+ i++ +"次");
//         //查询User对象
//         User user = new User(id, "zhangsan", "123");
//         // //数据库查询很慢
//         // try {
//         //     Thread.sleep(5000);
//         // } catch (InterruptedException e) {
//         //     e.printStackTrace();
//         // }
//         return user;
//     }
// }
