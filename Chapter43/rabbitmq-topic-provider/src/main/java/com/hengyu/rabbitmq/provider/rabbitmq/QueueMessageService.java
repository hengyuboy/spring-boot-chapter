package com.hengyu.rabbitmq.provider.rabbitmq;

import com.hengyu.rabbitmq.common.enums.ExchangeEnum;

/**
 * 消息队列业务
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:50
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface QueueMessageService
{
    /**
     * 发送消息到rabbitmq消息队列
     * @param message 消息内容
     * @param exchangeEnum 交换配置枚举
     * @param routingKey 路由key
     * @throws Exception
     */
    public void send(Object message, ExchangeEnum exchangeEnum, String routingKey) throws Exception;
}
