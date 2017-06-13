package com.starlight.controller;

import com.netflix.appinfo.InstanceInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by huangxinguang on 2017/6/5 上午11:45.
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String add(@RequestParam String name) {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("STORES");
        for(ServiceInstance serviceInstance:instanceList) {
            logger.info("/hello, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", hello:" + name);
        }
        logger.info("hello:"+name);
        return "hello:"+name;
    }
}
