package com.shanxi.dt.zty.test;

import com.shanxi.dt.zty.utils.MD5Util;
import org.junit.Test;

/**
 * @Author: ZTY
 * @Date: 2022/3/13
 * @Time: 16:30
 * @Description:
 */
public class MyTest {
    @Test
    public void testMD5(){
        String mi= MD5Util.getMD5("000000");
        System.out.println(mi);
    }
}
