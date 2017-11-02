package com.yuqiyu.chapter27.listener.order;

import com.yuqiyu.chapter27.bean.UserBean;
import com.yuqiyu.chapter27.event.UserRegisterEvent;
import com.yuqiyu.chapter27.service.UserService;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 用户注册>>>保存用户信息监听
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:09
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
public class UserRegisterListener implements SmartApplicationListener
{
    /**
     *  该方法返回true&supportsSourceType同样返回true时，才会调用该监听内的onApplicationEvent方法
     * @param aClass 接收到的监听事件类型
     * @return
     */
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        //只有UserRegisterEvent监听类型才会执行下面逻辑
        return aClass == UserRegisterEvent.class;
    }

    /**
     *  该方法返回true&supportsEventType同样返回true时，才会调用该监听内的onApplicationEvent方法
     * @param aClass
     * @return
     */
    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        //只有在UserService内发布的UserRegisterEvent事件时才会执行下面逻辑
        return aClass == UserService.class;
    }

    /**
     *  supportsEventType & supportsSourceType 两个方法返回true时调用该方法执行业务逻辑
     * @param applicationEvent 具体监听实例，这里是UserRegisterEvent
     */
    @Override
    @Async
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        //转换事件类型
        UserRegisterEvent userRegisterEvent = (UserRegisterEvent) applicationEvent;
        //获取注册用户对象信息
        UserBean user = userRegisterEvent.getUser();
        //.../完成注册业务逻辑
        System.out.println("注册信息，用户名："+user.getName()+"，密码："+user.getPassword());
    }

    /**
     * 同步情况下监听执行的顺序
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
