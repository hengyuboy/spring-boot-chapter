package com.hengyu.rabbitmq.common.enums;

import lombok.Getter;

/**
 * 消息队列topic交换路由key配置枚举
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：21:58
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Getter
public enum TopicEnum {
    /**
     * 用户注册topic路由key配置
     */
    USER_REGISTER("register.user")
    ;

    private String topicRouteKey;

    TopicEnum(String topicRouteKey) {
        this.topicRouteKey = topicRouteKey;
    }
}
