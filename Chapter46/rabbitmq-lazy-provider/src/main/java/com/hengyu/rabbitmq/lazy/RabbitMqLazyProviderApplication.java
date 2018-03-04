package com.hengyu.rabbitmq.lazy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 【第四十六章：SpringBoot & RabbitMQ完成消息延迟消费】
 * 队列提供者模块 - 入口程序类
 *
 * @author：恒宇少年 <br/>
 * ===============================
 * Created with IDEA.
 * Date：2018/3/3
 * Time：下午4:32
 * 简书：http://www.jianshu.com/u/092df3f77bca
 * ================================
 */
@SpringBootApplication
public class RabbitMqLazyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqLazyProviderApplication.class, args);
    }
}
