package com.hengyu.chapter48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 程序入口
 *
 * @author yuqiyu
 */
@SpringBootApplication
@RequestMapping
public class Chapter48Application {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(Chapter48Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Chapter48Application.class, args);
        logger.debug("【【【【【Chapter48启动成功.】】】】】");
    }

}
