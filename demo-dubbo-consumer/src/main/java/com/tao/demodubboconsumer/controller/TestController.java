package com.tao.demodubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tao.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Reference
    public TestService testService;

    @ResponseBody
    @RequestMapping("/")
    public String test(){
        return testService.test();
    }
}
