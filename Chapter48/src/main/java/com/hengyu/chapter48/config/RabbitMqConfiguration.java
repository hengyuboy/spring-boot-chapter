package com.hengyu.chapter48.config;

import com.hengyu.chapter48.RabbitMqFastJsonConverter;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitmq 相关配置
 * @author：于起宇 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/11
 * Time：下午5:42
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@Configuration
public class RabbitMqConfiguration {


    /**
     * 配置消息队列模版
     * 并且设置MessageConverter为自定义FastJson转换器
     * @param connectionFactory
     * @return
     */
    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(new RabbitMqFastJsonConverter());
        return template;
    }

    /**
     * 自定义队列容器工厂
     * 并且设置MessageConverter为自定义FastJson转换器
     * @param connectionFactory
     * @return
     */
    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setMessageConverter(new RabbitMqFastJsonConverter());
        factory.setDefaultRequeueRejected(false);
        return factory;
    }

}
