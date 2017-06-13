package com.starlight.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huangxinguang on 2017/6/6 下午4:32.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloServiceFallback")
    public String helloService(String name) {
        return restTemplate.getForEntity("http://hello-service/hello?name="+name, String.class).getBody();
    }

    public String helloServiceFallback(String name) {
        return "error";
    }
}
