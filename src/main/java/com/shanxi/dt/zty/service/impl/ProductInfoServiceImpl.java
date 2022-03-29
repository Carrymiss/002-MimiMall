package com.shanxi.dt.zty.service.impl;

import com.shanxi.dt.zty.mapper.AdminMapper;
import com.shanxi.dt.zty.mapper.ProductInfoMapper;
import com.shanxi.dt.zty.pojo.ProductInfo;
import com.shanxi.dt.zty.pojo.ProductInfoExample;
import com.shanxi.dt.zty.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: ZTY
 * @Date: 2022/3/20
 * @Time: 14:30
 * @Description:
 */
public class ProductInfoServiceImpl implements ProductInfoService {
    // 在业务逻辑层中，一定会有数据访问层的对象
    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getAll() {
        return productInfoMapper.selectByExample(new ProductInfoExample());
    }
}
