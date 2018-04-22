package com.hengyu.chapter52;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用rest获取MongoDB内的数据信息
 * 入口程序类
 *
 * @author yuqiyu
 */
@SpringBootApplication
public class Chapter52Application {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(Chapter52Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Chapter52Application.class, args);
        logger.info("【【【【【启动Rest读取MongoDB数据程序.】】】】】");
    }
}
