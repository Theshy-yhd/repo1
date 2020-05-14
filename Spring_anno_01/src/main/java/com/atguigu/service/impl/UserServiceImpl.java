package com.atguigu.service.impl;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:26
 */
@Service
public class UserServiceImpl implements UserService {



    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> list(int page, int size) {
        PageHelper.startPage(page,size);
        return mapper.list();
    }

    @Override
    public int add(User user) {
        return mapper.add(user);
    }

    @Override
    public User findUserById(Integer id) {
        return mapper.findUserById(id);
    }

    @Override
    public int update(User user) {
        return mapper.update(user);
    }

    @Override
    public int del(Integer id) {
        return mapper.del(id);
    }
}
