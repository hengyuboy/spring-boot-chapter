package com.hengyu.chapter48.provider;

import com.alibaba.fastjson.JSON;
import com.hengyu.chapter48.config.QueueConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息队列 - 消息提供者
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/11
 * Time：下午6:16
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Component
public class MessageProvider {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(MessageProvider.class);
    /**
     * 消息队列模板
     */
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(Object object) {
        logger.info("写入消息队列内容：{}", JSON.toJSONString(object));
        amqpTemplate.convertAndSend(QueueConstants.MESSAGE_EXCHANGE, QueueConstants.MESSAGE_ROUTE_KEY, object);
    }
}
