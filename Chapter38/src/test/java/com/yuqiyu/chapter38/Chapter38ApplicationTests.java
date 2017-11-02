package com.yuqiyu.chapter38;

import com.alibaba.fastjson.JSON;
import com.yuqiyu.chapter38.entity.SystemUserInfoEntity;
import com.yuqiyu.chapter38.jpa.SystemUserInfoJPA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter38ApplicationTests {

	@Autowired
	private SystemUserInfoJPA systemUserInfoJPA;

	@Test
	public void testDetail()
	{
		SystemUserInfoEntity infoEntity = systemUserInfoJPA.findOne(1);
		System.out.println(JSON.toJSONString(infoEntity));
	}

}
