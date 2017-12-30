package com.hengyu.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：22:04
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
@RabbitListener(queues = "register.account")
public class CreateAccountConsumer {

    /**
     * logback
     */
    Logger logger = LoggerFactory.getLogger(CreateAccountConsumer.class);

    /**
     * 处理消息
     * 创建用户账户
     * @param userId 用户编号
     */
    @RabbitHandler
    public void handler(String userId)
    {
        logger.info("用户：{}，注册成功，自动创建账户信息.",userId);

        //... 创建账户逻辑
    }
}
