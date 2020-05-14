package com.atguigu.imports;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-8:46
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if ("".equals(source)||source==null){
            throw new RuntimeException("输入不能为空！");
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return format.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("类型转换失败！");
        }
    }
}
