package com.yuqiyu.chapter25;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/6/6
 * Time：22:46
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class IndexController
{

    @RequestMapping(value = "/cors")
    public String corsIndex(){
        return "this is cors info.";
    }
}
