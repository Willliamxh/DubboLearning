package com.itheima.service;

/**
 * @Author Willam_xh
 * @Date 2022-05-12 10:59
 */

import com.itheima.pojo.User;

/**
 * 被依赖的项目要打包
 */
public interface UserService {
    public String sayHello();

    /**
     * 查询用户
     */
    public User findUserById(Integer id);
}
