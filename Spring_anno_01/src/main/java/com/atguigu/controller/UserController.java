package com.atguigu.controller;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author yinhuidong
 * @createTime 2020-05-13-0:18
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/user")
    public String list(@RequestParam(name="page",required = false,defaultValue = "1") int page,@RequestParam(name="size",required = false,defaultValue = "5") int size, Model model){
        List<User> list = service.list(page,size);
        PageInfo<User> info=new PageInfo<>(list);
        model.addAttribute("info",info);
        return "list";
    }

    @GetMapping("/u")
    public String toAdd(){

        return "add";
    }

    @PostMapping("/u")
    public String add(User user){

        service.add(user);
        return "redirect:/user";
    }

    @GetMapping("/u/{id}")
    public String huixian(@PathVariable Integer id,Model model){

        User user = service.findUserById(id);
        model.addAttribute("user",user);
        return "update";
    }

    @PutMapping("/u")
    public String update(User user){

        service.update(user);
        return "redirect:/user";
    }

    @DeleteMapping("/u/{id}")
    public String delete(@PathVariable Integer id){
        service.del(id);
        return "redirect:/user";
    }
}
