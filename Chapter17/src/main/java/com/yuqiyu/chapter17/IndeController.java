package com.yuqiyu.chapter17;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/18
 * Time：23:19
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class IndeController {
    @RequestMapping(value = "/index")
    public String index(){
        return "get index success";
    }
}
