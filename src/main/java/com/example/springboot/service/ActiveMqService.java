package com.example.springboot.service;

import com.example.springboot.entity.dto.User;

public interface ActiveMqService {


    /**
     * 发送消息
     *
     * @param msg
     */
    public void sendMsg(String msg);

    /**
     * 接受消息
     *
     * @param msg
     */
    void receiveMsg(String msg);

    /**
     * 发送用户对象
     *
     * @param user
     */
    void sendUser(User user);

    /**
     * 接受用户对象
     *
     * @param user
     */
    void receiveUser(User user);
}
