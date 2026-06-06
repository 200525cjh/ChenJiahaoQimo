package com.chenjiahao.qimo.service;

import com.chenjiahao.qimo.entity.User;

import java.util.List;

public interface UserService {
    User login(String account, String password);
    boolean register(User user);
    void updateProfile(User user);
    void changePassword(Long id, String password);
    List<User> findAll();
    void updateStatus(Long id, Integer status);
}
