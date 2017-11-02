package com.yuqiyu.chapter27.listener.disorder;

import com.yuqiyu.chapter27.bean.UserBean;
import com.yuqiyu.chapter27.event.UserRegisterEvent;
import org.springframework.context.ApplicationListener;

/**
 * 原始方式实现
 * 用户注册监听
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:24
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
//@Component
public class RegisterListener implements ApplicationListener<UserRegisterEvent>
{
    /**
     * 实现监听
     * @param userRegisterEvent
     */
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("注册信息，用户名："+user.getName()+"，密码："+user.getPassword());

    }
}
