package com.example.blogmysqlcopy.controller;

import com.example.blogmysqlcopy.entities.User;
import com.example.blogmysqlcopy.mapper.UserMapper;
import com.example.blogmysqlcopy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class UserController {
//    @Autowired
//    private UserMapper userMapper;

//    @GetMapping("/user/{id}")
//    public User getUserById(@PathVariable("id") int id) {
//        return userMapper.findUserById(id);
//    }
    @Autowired
    private UserService userSevice;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userSevice.getUserById(id);
    }

//    public UserController(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }
}
