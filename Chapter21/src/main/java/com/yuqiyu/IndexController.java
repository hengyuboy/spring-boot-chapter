package com.yuqiyu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/29
 * Time：10:37
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/index/{number}")
    public String index(@PathVariable int number){
        System.out.println(20 / number);
        return "get index page successfully.";
    }
}
