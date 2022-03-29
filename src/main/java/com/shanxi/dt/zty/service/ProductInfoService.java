package com.shanxi.dt.zty.service;

import com.shanxi.dt.zty.pojo.ProductInfo;

import java.util.List;

/**
 * @Author: ZTY
 * @Date: 2022/3/20
 * @Time: 14:26
 * @Description:
 */
public interface ProductInfoService {
    // 显示全部商品(不分页)
    List<ProductInfo> getAll();
}
