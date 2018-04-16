package com.hengyu.chapter51;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * 程序入口类
 * @author yuqiyu
 */
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.hengyu.chapter51")
public class Chapter51Application implements CommandLineRunner {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(Chapter51Application.class);
    /**
     * 客户数据接口注入
     */
    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Chapter51Application.class, args);
        logger.info("【【【【【SpringBoot整合Mongodb启动完成.】】】】】");
    }

    @Override
    public void run(String... args) {
        // 删除全部
        repository.deleteAll();
        // 添加一条数据
        repository.save(new Customer("于", "起宇"));
        // 查询全部
        logger.info(JSON.toJSONString(repository.findAll()));
    }
}
