package com.yuqiyu.chapter18.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secure")
public class SecureController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Secure Hello!";
    }

}
