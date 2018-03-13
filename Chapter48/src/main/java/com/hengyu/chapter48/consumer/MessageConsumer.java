package com.hengyu.chapter48.consumer;

import com.alibaba.fastjson.JSON;
import com.hengyu.chapter48.config.QueueConstants;
import com.hengyu.chapter48.entity.MessageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * 消息队列 - 消息消费者
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/11
 * Time：下午5:32
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Component
@RabbitListener(queues = QueueConstants.MESSAGE_QUEUE_NAME)
public class MessageConsumer {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @RabbitHandler
    public void handler(@Payload MessageEntity messageEntity) {
        logger.info("消费内容：{}", JSON.toJSONString(messageEntity));
    }
}
