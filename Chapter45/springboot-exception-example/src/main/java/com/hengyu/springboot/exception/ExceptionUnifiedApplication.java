package com.hengyu.springboot.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全局异常通知入口类
 * @author yuqiyu
 */
@SpringBootApplication
public class ExceptionUnifiedApplication {
	/**
	 * logger new instance
	 */
	static Logger logger = LoggerFactory.getLogger(ExceptionUnifiedApplication.class);

	/**
	 * 程序入口方法
	 * @param args 参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(ExceptionUnifiedApplication.class, args);
		logger.info("【【【【【业务异常统一处理-启动完成】】】】】");
	}
}
