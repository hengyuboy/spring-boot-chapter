package com.hengyu.rabbitmq.consumer.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 用户注册消息消费者
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

    @RabbitHandler
    public void execute(Long userId)
    {
        System.out.println("用户：" + userId+"，完成了注册");

        //...//自行业务逻辑处理
    }
}
