package com.yuqiyu.chapter6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/7
 * Time：21:41
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Controller
@RequestMapping("/user")
public class IndexController {

    /**
     * 初始化登录页面
     * @return
     */
    @RequestMapping(value = "/login_view",method = RequestMethod.GET)
    public String login_view(){
        return "login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
