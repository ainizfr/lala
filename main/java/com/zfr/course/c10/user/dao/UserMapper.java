package com.zfr.course.c10.user.dao;

import com.zfr.course.c10.user.model.User;

import java.util.List;

public interface UserMapper {
    public void  editUser(User user);
    public void  deletUser(int id);

    public User findUserById(int id);
    public void addUser(User user);
    public List<User> findAllUser();
}
