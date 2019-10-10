package com.example.springboot.controller;

import com.example.springboot.entity.dto.User;
import com.example.springboot.entity.vo.Result;
import com.example.springboot.service.ActiveMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activemq")
public class ActiveMqController {
    @Autowired
    private ActiveMqService activeMqService;

    @GetMapping("/msg/{msg}")
    public Result sendMsg(@PathVariable String msg) {
        activeMqService.sendMsg(msg);
        return Result.ok("good");
    }

    @GetMapping("/user/{name}")
    public Result sendUser(@PathVariable String name) {
        User user = new User();
        user.setAge(10);
        user.setName(name);
        activeMqService.sendUser(user);
        return Result.ok(user);
    }

}
