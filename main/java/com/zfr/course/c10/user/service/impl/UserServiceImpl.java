package com.zfr.course.c10.user.service.impl;

import com.zfr.course.c10.user.dao.UserMapper;

import com.zfr.course.c10.user.model.User;
import com.zfr.course.c10.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void editUser(User user) {

    }

    @Override
    public void deletUser(int id) {

    }

    @Override
    public User findUserById(int id) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public List<User> findAllUser() {
        return null;
    }
}