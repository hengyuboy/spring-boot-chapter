package com.hengyu.chapter50;

import com.hengyu.chapter50.service.UserService;
import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter50ApplicationTests {

	@Rule
	public ContiPerfRule i = new ContiPerfRule();

	/**
	 * 用户业务逻辑注入
	 */
	@Autowired
	private UserService userService;

	/**
	 * 性能测试
	 * 10万次查询，100个线程同时操作findAll方法
	 */
	@Test
	@PerfTest(invocations = 100000, threads = 100)
	public void contextLoads() {
		userService.findAll();
	}

	/**
	 * 测试全部缓存
	 */
	@Test
	public void findAll() {
		userService.findAll();
	}

}
