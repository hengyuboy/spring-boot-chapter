package com.yuqiyu.chapter27.listener.annotation;

import com.yuqiyu.chapter27.bean.UserBean;
import com.yuqiyu.chapter27.event.UserRegisterEvent;
import org.springframework.stereotype.Component;

/**
 * 使用@EventListener方法实现注册事件监听
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:50
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
public class AnnotationRegisterListener {

    /**
     * 注册监听实现方法
     * @param userRegisterEvent 用户注册事件
     */
    //@EventListener
    public void register(UserRegisterEvent userRegisterEvent)
    {
        //获取注册用户对象
        UserBean user = userRegisterEvent.getUser();

        //../省略逻辑

        //输出注册用户信息
        System.out.println("@EventListener注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }
}
