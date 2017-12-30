package com.hengyu.rabbitmq.provider.rabbitmq.support;

import com.hengyu.rabbitmq.common.enums.ExchangeEnum;
import com.hengyu.rabbitmq.provider.rabbitmq.QueueMessageService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息队列业务逻辑实现
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:52
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
public class QueueMessageServiceSupport
    implements QueueMessageService
{
    /**
     * 消息队列模板
     */
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void send(Object message, ExchangeEnum exchangeEnum, String routingKey) throws Exception {
        //发送消息到消息队列
        rabbitTemplate.convertAndSend(exchangeEnum.getName(),routingKey,message);
    }
}
