package com.yuqiyu.lessonOne.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/3
 * Time：11:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping
public class HelloWordController {
    /**
     * 测试输出HelloWord
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "HelloWord";
    }
}
