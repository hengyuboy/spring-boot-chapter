package com.hengyu.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 发送用户注册成功邮件消费者
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：22:07
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
@RabbitListener(queues = "register.mail")
public class SendMailConsumer
{

    /**
     * logback
     */
    Logger logger = LoggerFactory.getLogger(SendMailConsumer.class);

    /**
     * 处理消息
     * 发送用户注册成功邮件
     * @param userId 用户编号
     */
    @RabbitHandler
    public void handler(String userId)
    {

        logger.info("用户：{}，注册成功，自动发送注册成功邮件.",userId);

        //... 发送注册成功邮件逻辑
    }
}
