package com.hengyu.consumer.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 用户注册消息消费者
 * 分布式节点2
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/11/26
 * Time：15:20
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Component
@RabbitListener(queues = "user.register.queue")
public class UserConsumer {

    /**
     * logback
     */
    private Logger logger = LoggerFactory.getLogger(UserConsumer.class);

    @RabbitHandler
    public void execute(Long userId)
    {
        logger.info("用户注册消费者【节点2】获取消息，用户编号：{}",userId);

        //...//自行业务逻辑处理
    }
}
