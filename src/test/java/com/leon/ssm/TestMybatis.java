package com.leon.ssm;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.leon.ssm.bo.User;
import com.leon.ssm.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);

	@Autowired
	private IUserService userService = null;

	@Test
	public void getUserById() {
		User user = userService.getUserById(1);
		System.out.println(JSON.toJSONString(user));
		logger.info(JSON.toJSONString(user));
	}
}