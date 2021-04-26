package com.xxxx.spring03.controller;


import com.xxxx.spring03.entity.User;
import com.xxxx.spring03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userInfo/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }

    @RequestMapping(value = "users",method = RequestMethod.GET)
    public String userList(){
        String str = "";
        User[] users;
        users =  userService.SelectAll();
        for(User user : users){
            System.out.println("user = " + user);
            str += user.toString();
        }

        return str;
    }

}