package com.xie.api.controller;

import com.xie.interfaces.IUserRpc;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @DubboReference
    private IUserRpc userRpc;

    @GetMapping(value = "/do-test")
    public String doTest(){
        userRpc.test();
        return "success";
    }
}

