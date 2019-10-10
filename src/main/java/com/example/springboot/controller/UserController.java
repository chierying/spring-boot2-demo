package com.example.springboot.controller;

import com.example.springboot.entity.dto.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/name/{name}", method = RequestMethod.GET)
    public User user(@PathVariable String name) {
        User user = userService.user(name);
        return user;
    }

}
