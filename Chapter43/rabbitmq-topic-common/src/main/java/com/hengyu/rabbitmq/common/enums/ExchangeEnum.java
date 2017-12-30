package com.hengyu.rabbitmq.common.enums;

import lombok.Getter;

/**
 * rabbitmq交换配置枚举
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：13:56
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Getter
public enum ExchangeEnum
{
    /**
     * 用户注册交换配置枚举
     */
    USER_REGISTER_TOPIC_EXCHANGE("register.topic.exchange")
    ;
    private String name;

    ExchangeEnum(String name) {
        this.name = name;
    }
}
