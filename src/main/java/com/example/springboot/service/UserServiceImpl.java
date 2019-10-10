package com.example.springboot.service;

import com.example.springboot.entity.dto.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User user(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(18);
        return user;
    }
}
