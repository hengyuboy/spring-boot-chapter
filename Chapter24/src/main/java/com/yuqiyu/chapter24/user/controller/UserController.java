package com.yuqiyu.chapter24.user.controller;

import com.yuqiyu.chapter24.user.bean.UserBean;
import com.yuqiyu.chapter24.user.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/5/30
 * Time：14:23
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询所有用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserBean> list(){
        return userJPA.findAll();
    }
}
