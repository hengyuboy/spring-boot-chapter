package com.yuqiyu.chapter27.service;

import com.yuqiyu.chapter27.bean.UserBean;
import com.yuqiyu.chapter27.event.UserRegisterEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:11
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Service
public class UserService
{
    @Autowired
    ApplicationContext applicationContext;

    /**
     * 用户注册方法
     * @param user
     */
    public void register(UserBean user)
    {
        //../省略其他逻辑

        //发布UserRegisterEvent事件
        applicationContext.publishEvent(new UserRegisterEvent(this,user));
    }
}
