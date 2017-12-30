package com.hengyu.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 消息消费者程序启动入口
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：21:48
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@SpringBootApplication
@ComponentScan(value = "com.hengyu.rabbitmq")
public class RabbitMqTopicConsumerApplication {

    /**
     * logback
     */
    private static Logger logger = LoggerFactory.getLogger(RabbitMqTopicConsumerApplication.class);

    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitMqTopicConsumerApplication.class,args);

        logger.info("【【【【【Topic队列消息Consumer启动成功】】】】】");
    }
}
