package com.hengyu.rabbitmq.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消息队列消息提供者启动入口
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：14:14
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@SpringBootApplication
public class RabbitmqProviderApplication
{
    static Logger logger = LoggerFactory.getLogger(RabbitmqProviderApplication.class);

    /**
     * 消息队列提供者启动入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitmqProviderApplication.class,args);

        logger.info("【【【【【消息队列-消息提供者启动成功.】】】】】");
    }
}
