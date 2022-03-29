package com.shanxi.dt.zty.service.impl;

import com.shanxi.dt.zty.mapper.AdminMapper;
import com.shanxi.dt.zty.pojo.Admin;
import com.shanxi.dt.zty.pojo.AdminExample;
import com.shanxi.dt.zty.service.AdminService;
import com.shanxi.dt.zty.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZTY
 * @Date: 2022/3/13
 * @Time: 16:42
 * @Description:
 */
@Service
public class AdminServiceImpl implements AdminService {
    // 在业务逻辑层中，一定会有数据访问层的对象
    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {
        // 根据传入的用户或到DB中查询相应用户对象
        // 如果有条件，则一定要创建AdminExample的对象，用来封装条件
        AdminExample example = new AdminExample();
        // 添加用户名a_name条件
        example.createCriteria().andANameEqualTo(name);
        List<Admin> list = adminMapper.selectByExample(example);

        /**
         * 不用判断非空，因为创建之后就不为空
         * 长度大于0说明查到数据
         */
        if (list.size() > 0) {
            Admin admin=list.get(0);

            // 如果查询到用户对象，再进行密码的比对
            String mipwd= MD5Util.getMD5(pwd);
            if(mipwd.equals(admin.getaPass())){
                return admin;
            }
        }
        return null;
    }
}
