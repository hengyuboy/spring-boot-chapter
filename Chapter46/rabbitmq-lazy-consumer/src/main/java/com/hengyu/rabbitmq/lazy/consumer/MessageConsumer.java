package com.hengyu.rabbitmq.lazy.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息通知 - 消费者
 *
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/3
 * Time：下午5:00
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Component
@RabbitListener(queues = "message.center.create")
public class MessageConsumer {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @RabbitHandler
    public void handler(String content) {
        logger.info("消费内容：{}", content);
    }
}
