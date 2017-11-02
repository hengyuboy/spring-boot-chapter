package com.yuqiyu.chapter19.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/22
 * Time：23:08
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/api")
public class IndexController{

    @RequestMapping(value = "/index")
    public String index(){
        return "success";
    }
}
