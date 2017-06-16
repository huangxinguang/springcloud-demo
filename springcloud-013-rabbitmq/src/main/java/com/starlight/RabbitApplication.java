package com.starlight;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by huangxinguang on 2017/6/16 下午2:35.
 */
@SpringBootApplication
public class RabbitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(RabbitApplication.class).web(true).run(args);
    }
}
