package com.hengyu.chapter44;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 * @author yuqiyu
 */
@SpringBootApplication
public class Chapter44Application {
	static Logger logger = LoggerFactory.getLogger(Chapter44Application.class);
	public static void main(String[] args) {
		logger.info("启动...");
		SpringApplication.run(Chapter44Application.class, args);
	}
}
