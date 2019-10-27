package com.t28.forest.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * @author XiangYuFeng
 * @description 日期转换器
 * @create 2019/10/24
 * @since 1.0.0
 */
@Component
public class DateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if (Objects.isNull(source) || "".equals(source)) {
            return null;
        }
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}