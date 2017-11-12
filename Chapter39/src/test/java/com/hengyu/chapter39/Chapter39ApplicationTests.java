package com.hengyu.chapter39;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
	@SpringBootTest
	public class Chapter39ApplicationTests {
		/**
		 * 模拟mvc测试对象
		 */
		private MockMvc mockMvc;

		/**
		 * web项目上下文
		 */
		@Autowired
		private WebApplicationContext webApplicationContext;

		/**
		 * 所有测试方法执行之前执行该方法
		 */
		@Before
		public void before() {
			//获取mockmvc对象实例
			mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		}

		/**
		 * 测试添加商品
		 * @throws Exception
		 */
		@Test
		public void addGood() throws Exception
		{
			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/good/save")
					.param("name","西红柿")
					.param("unit","斤")
					.param("price","12.88")
			)
					.andDo(MockMvcResultHandlers.print())
					.andExpect(MockMvcResultMatchers.status().is(200))
					.andReturn();
			result.getResponse().setCharacterEncoding("UTF-8");
			System.out.println(result.getResponse().getContentAsString());
		}
}
