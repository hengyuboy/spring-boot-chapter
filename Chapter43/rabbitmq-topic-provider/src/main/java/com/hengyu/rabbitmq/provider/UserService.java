package com.hengyu.rabbitmq.provider;

import com.hengyu.rabbitmq.common.enums.ExchangeEnum;
import com.hengyu.rabbitmq.common.enums.TopicEnum;
import com.hengyu.rabbitmq.provider.rabbitmq.QueueMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 用户业务逻辑
 * ========================
 *
 * @author 恒宇少年
 * Created with IntelliJ IDEA.
 * Date：2017/12/11
 * Time：22:10
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Service
public class UserService
{
    /**
     * 消息队列发送业务逻辑
     */
    @Autowired
    private QueueMessageService queueMessageService;

    /**
     * 随机创建用户
     * 随机生成用户uuid编号，发送到消息队列服务端
     * @return
     * @throws Exception
     */
    public String randomCreateUser() throws Exception
    {
        //用户编号
        String userId = UUID.randomUUID().toString();
        //发送消息到rabbitmq服务端
        queueMessageService.send(userId, ExchangeEnum.USER_REGISTER_TOPIC_EXCHANGE, TopicEnum.USER_REGISTER.getTopicRouteKey());
        return userId;
    }
}
