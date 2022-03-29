package com.shanxi.dt.zty.controller;

import com.shanxi.dt.zty.pojo.ProductInfo;
import com.shanxi.dt.zty.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: ZTY
 * @Date: 2022/3/20
 * @Time: 16:17
 * @Description:
 */
@Controller
@RequestMapping("/prod")
public class ProductInfoController {
    // 切记：在所有的界面层，一定会有业务逻辑层的对象
    @Autowired
    private ProductInfoService productInfoService;

    // 显示全部商品部分页
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request) {
        List<ProductInfo> list= productInfoService.getAll();
        request.setAttribute("list",list);
        return "product";
    }
}
