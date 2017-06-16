package com.starlight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangxinguang on 2017/6/15 下午3:29.
 */
@RefreshScope
@RestController
public class EnvController {

    @Autowired
    private Environment env;

    @RequestMapping(value = "/from2")
    public String from() {
        return env.getProperty("from","undefined");
    }
}
