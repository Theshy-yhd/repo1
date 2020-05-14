package com.atguigu.mapper;

import com.atguigu.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import sun.java2d.pipe.OutlineTextRenderer;

import java.util.List;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:26
 */
@Repository
public interface UserMapper {

    @Select("select * from user ")
    List<User> list();

    @Insert("insert into user (name,password,sex,age,phone)values(#{name},#{password},#{sex},#{age},#{phone})")
    int add(User user);

    @Select("select * from user where id=#{arg0};")
    User findUserById(Integer id);

    @Update("update user set name=#{name} ,password=#{password},sex=#{sex},age=#{age},phone=#{phone} where id=#{id}")
    int update(User user);

    @Delete("delete  from user where id=#{arg0}")
    int del(Integer id);
}
