package com.starlight.service.impl;

import com.starlight.service.ComputeService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangxinguang on 2017/6/6 下午5:25.
 */
@Component
public class ComputeServiceImpl implements ComputeService {

    @Override
    public String hello(String name) {
        return "-9999";
    }
}
