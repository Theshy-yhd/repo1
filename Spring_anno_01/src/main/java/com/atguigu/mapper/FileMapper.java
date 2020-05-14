package com.atguigu.mapper;

import com.atguigu.pojo.file;
import org.apache.ibatis.annotations.Insert;

import java.io.File;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-18:15
 */
public interface FileMapper {

    @Insert("insert into file(id,filename) values(#{id},#{filename})")
    int save(file f);
}
