package com.chenjiahao.qimo.service.impl;

import com.chenjiahao.qimo.entity.Admin;
import com.chenjiahao.qimo.mapper.AdminMapper;
import com.chenjiahao.qimo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin login(String username, String password) {
        Admin admin = adminMapper.findByUsername(username);
        return admin != null && admin.getPassword().equals(password) ? admin : null;
    }
}
