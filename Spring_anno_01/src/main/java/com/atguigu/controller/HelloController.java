package com.atguigu.controller;

import com.atguigu.imports.MyException;
import com.atguigu.mapper.FileMapper;
import com.atguigu.pojo.User;
import com.atguigu.pojo.file;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:03
 */
@Transactional()
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello()throws MyException{
        int a=1/0;
        return "success";
    }

    @RequestMapping("/login")
    public String login(String username,String password){
        if ("root".equals(username)&&"root".equals(password)){

            return "redirect:/user";
        }
        return "redirect:/index.jsp";
    }

    @ResponseBody
    @RequestMapping("/date")
    public String date(Date birth){
        System.out.println(birth.toString());
        return birth.toString();
    }

    @RequestMapping("/forword")
    public String test2(){

        return "forward:/WEB-INF/views/for.jsp";
    }


    @RequestMapping(value = "/ajax",produces = "text/html; charset=utf-8")
    public @ResponseBody
    String ajax(@RequestBody User user){
        System.out.println(user.getName()+user.getAge());
        return "{\"success\":true,\"msg\":\"保存成功!\"}";
    }

    @Autowired
    private FileMapper mapper;
    @RequestMapping("/upload")
    public String upload( MultipartFile upload,Integer id) throws IOException {
        String path="D:\\images";
        System.out.println(path);
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
        String s= UUID.randomUUID().toString().replace("_","").toUpperCase();
        String filename=upload.getOriginalFilename();
        filename=s+filename;
        System.out.println(filename);
        upload.transferTo(new File(file,filename));
        com.atguigu.pojo.file f = new file();
        f.setId(id);
        f.setFilename(path+"\\"+filename);
        mapper.save(f);
        return "success";
    }
}
