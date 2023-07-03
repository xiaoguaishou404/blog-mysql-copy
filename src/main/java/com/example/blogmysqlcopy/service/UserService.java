package com.example.blogmysqlcopy.service;

import com.example.blogmysqlcopy.entities.User;
import com.example.blogmysqlcopy.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public User getUserById(int id) {
       return userMapper.findUserById(id);
    }
}
