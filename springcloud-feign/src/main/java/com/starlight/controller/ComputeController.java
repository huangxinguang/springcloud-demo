package com.starlight.controller;

import com.starlight.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangxinguang on 2017/6/5 下午4:58.
 */

@RestController
public class ComputeController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name) {
        return computeService.hello(name);
    }

}
