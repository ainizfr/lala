package com.zfr.course.c10.user.service;

import com.zfr.course.c10.user.model.User;

import java.util.List;

public interface UserService {
    public void editUser(com.zfr.course.c10.user.model.User user);
    public void  deletUser(int id);

    public com.zfr.course.c10.user.model.User findUserById(int id);
    public void addUser(com.zfr.course.c10.user.model.User user);
    public List<com.zfr.course.c10.user.model.User> findAllUser();
}
