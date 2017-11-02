package com.yuqiyu.chapter27.controller;

import com.yuqiyu.chapter27.bean.UserBean;
import com.yuqiyu.chapter27.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:05
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class UserController
{
    //用户业务逻辑实现
    @Autowired
    private UserService userService;

    /**
     * 注册控制方法
     * @param user 用户对象
     * @return
     */
    @RequestMapping(value = "/register")
    public String register
            (
                    UserBean user
            )
    {
        //调用注册业务逻辑
        userService.register(user);
        return "注册成功.";
    }
}
