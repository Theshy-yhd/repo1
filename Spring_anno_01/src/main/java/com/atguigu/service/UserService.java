package com.atguigu.service;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:25
 */
public interface UserService {

    List<User> list(int page,int size);

    int add(User user);

    User findUserById(Integer id);

    int update(User user);


    int del(Integer id);
}
