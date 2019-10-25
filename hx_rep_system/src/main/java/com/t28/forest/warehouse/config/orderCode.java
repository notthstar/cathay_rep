/**
 * @description
 * @author lcy
 * @create 2019/10/25
 * @since 1.0.0
 */
package com.t28.forest.warehouse.config;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class orderCode {
    //订单编号前缀
    public static final String PREFIX = "QTRK";
    //订单编号后缀（核心部分）
    private static long code;

    // 生成订单编号
    public   String getOrderCode() {
        code++;
        String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        long m = Long.parseLong((str)) * 10000;
        m += code;
        return PREFIX + m;
    }

}
