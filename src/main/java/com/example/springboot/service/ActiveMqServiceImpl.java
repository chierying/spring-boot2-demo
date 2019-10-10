package com.example.springboot.service;

import com.example.springboot.entity.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ActiveMqServiceImpl implements ActiveMqService {
    @Autowired
    private JmsTemplate jmsTemplate;

    public static final String TOPIC_STRING_NAME = "topic-hello-world";
    public static final String TOPIC_USER_NAME = "topic-user";

    /**
     * 发送消息
     *
     * @param msg
     */
    @Override
    public void sendMsg(String msg) {
        log.info("发送消息:{}", msg);
        // 发送消息
        jmsTemplate.convertAndSend(TOPIC_STRING_NAME, msg);

    }

    /**
     * 接受消息
     *
     * @param msg
     */
    @Override
    // 使用注解，监听地址发来的消息。
    @JmsListener(destination = TOPIC_STRING_NAME)
    public void receiveMsg(String msg) {
        log.info("收到消息:{}", msg);


    }

    /**
     * 发送用户对象
     *
     * @param user
     */
    @Override
    public void sendUser(User user) {
        log.info("发送user: {}", user);
        jmsTemplate.convertAndSend(TOPIC_USER_NAME, user);

    }

    /**
     * 接受用户对象
     *
     * @param user
     */
    @JmsListener(destination = TOPIC_USER_NAME)
    @Override
    public void receiveUser(User user) {
        log.info("收到user: {}", user);
    }
}
