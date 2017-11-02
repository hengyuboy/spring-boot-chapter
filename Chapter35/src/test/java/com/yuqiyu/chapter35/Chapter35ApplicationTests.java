package com.yuqiyu.chapter35;

import com.yuqiyu.chapter35.bean.GoodInfoEntity;
import com.yuqiyu.chapter35.jpa.GoodInfoJPA;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter35ApplicationTests {
	/**
	 * 模拟mvc测试对象
	 */
	private MockMvc mockMvc;// 2

	/**
	 * web项目上下文
	 */
	@Autowired
	private WebApplicationContext webApplicationContext; // 3

	/**
	 * 商品业务数据接口
	 */
	@Autowired
	private GoodInfoJPA goodInfoJPA;

	/**
	 * 所有测试方法执行之前执行该方法
	 */
	@Before
	public void before() {
		//获取mockmvc对象实例
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build(); // 4
	}

	/**
	 * 测试访问/index地址
	 * @throws Exception
	 */
	@Test
	public void testIndex() throws Exception {
		MvcResult mvcResult = mockMvc
				.perform(
						MockMvcRequestBuilders.get("/index")
						.param("name","admin")
				)
				.andReturn(); // 5
		int status = mvcResult.getResponse().getStatus(); // 6
		String responseString = mvcResult.getResponse().getContentAsString(); // 7

		Assert.assertEquals("请求错误", 200, status); // 8
		Assert.assertEquals("返回结果不一致", "this is index pageadmin", responseString); // 9
	}

	@Test
	public void testAll() throws Exception
	{
		MvcResult mvcResult = mockMvc
				.perform(
						MockMvcRequestBuilders.get("/all")
				)
				.andReturn(); // 5
		int status = mvcResult.getResponse().getStatus(); // 6
		String responseString = mvcResult.getResponse().getContentAsString(); // 7

		Assert.assertEquals("return status not equals 200", 200, status); // 8
		System.out.println(responseString);
	}

	/**
	 * 测试查询详情
	 * @throws Exception
	 */
	@Test
	public void testDetail() throws Exception
	{
		MvcResult mvcResult = mockMvc
				.perform(
						MockMvcRequestBuilders.get("/detail")
						.param("goodId","2")
				)
				.andReturn(); // 5

		//输出经历的拦截器
		HandlerInterceptor[] interceptors = mvcResult.getInterceptors();
		System.out.println(interceptors[0].getClass().getName());

		int status = mvcResult.getResponse().getStatus(); // 6
		String responseString = mvcResult.getResponse().getContentAsString(); // 7
		System.out.println("返回内容："+responseString);
		Assert.assertEquals("return status not equals 200", 200, status); // 8
	}

	/**
	 * 测试添加商品基本信息
	 */
	@Test
	public void testInsert()
	{
		/**
		 * 商品基本信息实体
		 */
		GoodInfoEntity goodInfoEntity = new GoodInfoEntity();
		goodInfoEntity.setTitle("西红柿");
		goodInfoEntity.setOrder(2);
		goodInfoEntity.setPrice(5.82);
		goodInfoEntity.setTypeId(1);
		goodInfoJPA.save(goodInfoEntity);
		/**
		 * 测试是否添加成功
		 * 验证主键是否存在
		 */
		Assert.assertNotNull(goodInfoEntity.getTgId());
	}

	/**
	 * 测试删除商品基本信息
	 */
	@Test
	public void testDelete()
	{
		//根据主键删除
		goodInfoJPA.delete(3);

		//验证数据库是否已经删除
		Assert.assertNull(goodInfoJPA.findOne(3));
	}
}
