package com.t28.forest.shared.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XiangYuFeng
 * @description 简单Java工具类
 * @create 2019/10/22
 * @since 1.0.0
 */
public class SimpleUtils {

    /**
     * 时间日期格式化对象
     */
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 工具类不允许实例化
     */
    private SimpleUtils() {}

    /**
     * 字符串转时间类型工具
     * @deprecated 入参字符串格式 yyyy-mm-dd hh:mm:ss 小于某个时间 hh 为 24 ，大于 某个时间 hh 为 00
     * @param date
     * @return java.util.Date
     * @throws ParseException
     */
    public static Date strToDate(String date) throws ParseException {
        // 避免高并发带来的问题
        synchronized (sdf) {
            return sdf.parse(date);
        }
    }

    /**
     * 时间转字符串方法
     * @deprecated 入参日期格式必须为 yyyy-MM-dd HH:mm:ss
     * @param date
     * @return java.lang.String
     */
    public static String dateToStr(Date date) {
        synchronized (sdf) {
            return sdf.format(date);
        }
    }

}