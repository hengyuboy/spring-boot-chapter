package com.hengyu.chapter49;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/15
 * Time：下午10:34
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@RestController
public class TestController {
    /**
     * 测试拦截地址
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "Success";
    }
}
