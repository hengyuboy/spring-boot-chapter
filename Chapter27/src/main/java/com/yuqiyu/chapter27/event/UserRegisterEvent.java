package com.yuqiyu.chapter27.event;

import com.yuqiyu.chapter27.bean.UserBean;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：恒宇少年
 * Date：2017/7/21
 * Time：10:08
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Getter
public class UserRegisterEvent extends ApplicationEvent
{
    //注册用户对象
    private UserBean user;

    /**
     * 重写构造函数
     * @param source 发生事件的对象
     * @param user 注册用户对象
     */
    public UserRegisterEvent(Object source,UserBean user) {
        super(source);
        this.user = user;
    }
}
