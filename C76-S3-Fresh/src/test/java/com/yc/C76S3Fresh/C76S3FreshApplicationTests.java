package com.yc.C76S3Fresh;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.yc.fresh.dao.UserMapper;

@SpringBootTest
class C76S3FreshApplicationTests {
	
	@Resource
	private UserMapper um;
	@Test 
	void contextLoads() {
		Assert.isTrue(um.selectByExample(null).size() > 0, "结果集数量不正确!");
	}

}
