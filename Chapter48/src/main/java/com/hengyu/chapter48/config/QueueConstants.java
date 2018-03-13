package com.hengyu.chapter48.config;

/**
 * 队列常量配置
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/7
 * Time：下午10:10
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
public interface QueueConstants {
    /**
     * 消息交换
     */
    String MESSAGE_EXCHANGE = "message.direct.exchange";
    /**
     * 消息队列名称
     */
    String MESSAGE_QUEUE_NAME = "message.queue";
    /**
     * 消息路由键
     */
    String MESSAGE_ROUTE_KEY = "message.send";
}
