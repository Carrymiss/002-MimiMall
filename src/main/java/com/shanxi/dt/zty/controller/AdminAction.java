package com.shanxi.dt.zty.controller;

import com.shanxi.dt.zty.pojo.Admin;
import com.shanxi.dt.zty.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/admin")
public class AdminAction {
    // 切记：在所有的界面层，一定会有业务逻辑层的对象
    @Autowired
    private AdminService adminService;

    // 实现登录判断并进行相应的跳转
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request) {
        Admin admin = adminService.login(name, pwd);
        if (admin != null) {
            // 登录成功
            request.setAttribute("admin",admin);
            return "main";
        } else {
            // 登录失败
            request.setAttribute("errmsg","用户名或密码不正确！");
            return "login";
        }

    }

}
