package com.starlight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by huangxinguang on 2017/6/16 下午2:42.
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    private static Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String hello) {
        logger.info("received a message:"+hello);
    }
}
