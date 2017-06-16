package com.starlight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by huangxinguang on 2017/6/16 下午2:39.
 */
@Component
public class Sender {

    private static Logger logger = LoggerFactory.getLogger(Sender.class);
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String message = "hello "+new Date();
        logger.info("sender:"+message);
        rabbitTemplate.convertAndSend("hello",message);
    }
}
