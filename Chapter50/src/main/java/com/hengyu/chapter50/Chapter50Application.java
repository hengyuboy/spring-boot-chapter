package com.hengyu.chapter50;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 项目启动类入口
 *
 * @author yuqiyu
 * @EnableCaching 注解配置启用缓存，自动配置配置文件的配置信息进行条件注入缓存所需实例
 */
@SpringBootApplication
@EnableCaching
public class Chapter50Application {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(Chapter50Application.class);

    /**
     * 启动方法
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Chapter50Application.class, args);
        logger.info("【【【【【spring-boot-redis启动成功】】】】】");
    }
}
