package com.yuqiyu.chapter16.controller;

import com.yuqiyu.chapter16.entity.UserEntity;
import com.yuqiyu.chapter16.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/4/17
 * Time：22:56
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "/list")
    public List<UserEntity> list()
    {
        return userService.list();
    }
}
