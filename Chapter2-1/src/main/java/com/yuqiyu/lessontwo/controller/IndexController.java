package com.yuqiyu.lessontwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/3
 * Time：16:44
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Controller
public class IndexController {
    /**
     * 访问webapp/jsp/index.jsp文件
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
