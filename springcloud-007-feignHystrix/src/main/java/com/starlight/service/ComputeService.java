package com.starlight.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangxinguang on 2017/6/5 下午4:56.
 */
@FeignClient(value = "hello-service",fallback = ComputeService.ComputeServiceHystrix.class)
public interface ComputeService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello(@RequestParam("name") String name);

    @Component
    static class ComputeServiceHystrix implements ComputeService {
        @Override
        public String hello(String name) {
            return "-999";
        }
    }
}