package com.chenjiahao.qimo.mapper;

import com.chenjiahao.qimo.entity.Admin;
import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
    @Select("select * from sys_admin where username=#{username} and status=1 limit 1")
    Admin findByUsername(String username);
}
