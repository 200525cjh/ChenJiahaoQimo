package com.chenjiahao.qimo.service;

import com.chenjiahao.qimo.entity.Admin;

public interface AdminService {
    Admin login(String username, String password);
}
