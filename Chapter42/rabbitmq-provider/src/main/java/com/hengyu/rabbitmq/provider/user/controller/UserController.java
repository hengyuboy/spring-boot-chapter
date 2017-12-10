package com.hengyu.rabbitmq.provider.user.controller;

import com.hengyu.rabbitmq.provider.user.entity.UserEntity;
import com.hengyu.rabbitmq.provider.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:41
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@RestController
@RequestMapping(value = "/user")
public class UserController
{
    /**
     * 用户业务逻辑
     */
    @Autowired
    private UserService userService;

    /**
     * 保存用户基本信息
     * @param userEntity
     * @return
     */
    @RequestMapping(value = "/save")
    public UserEntity save(UserEntity userEntity) throws Exception
    {
        userService.save(userEntity);
        return userEntity;
    }
}
