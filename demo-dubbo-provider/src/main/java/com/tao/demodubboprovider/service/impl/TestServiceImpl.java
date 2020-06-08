package com.tao.demodubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tao.service.TestService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {
    public String test() {
        return "Hello world";
    }
}
