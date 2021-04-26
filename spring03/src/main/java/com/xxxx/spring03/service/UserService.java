package com.xxxx.spring03.service;


import com.xxxx.spring03.entity.User;
import com.xxxx.spring03.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public User[] SelectAll(){
        return userMapper.SelectAll();
    }


}