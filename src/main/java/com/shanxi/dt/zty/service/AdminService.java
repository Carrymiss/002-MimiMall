package com.shanxi.dt.zty.service;

import com.shanxi.dt.zty.pojo.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Author: ZTY
 * @Date: 2022/3/13
 * @Time: 16:40
 * @Description:
 */
public interface AdminService {
    // 完成登录判断
    Admin login(String name, String pwd);
}
