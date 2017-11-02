package com.yuqiyu.chapter27.listener.annotation;

import com.yuqiyu.chapter27.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;

/**
 * 注册用户事件发送邮件监听
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：13:08
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
//@Component
public class AnnotationRegisterUserEmailListener
{
    /**
     * 发送邮件监听实现
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendMail(UserRegisterEvent userRegisterEvent)
    {
        System.out.println("用户注册成功，发送邮件。");
    }
}
