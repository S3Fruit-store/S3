package com.yc.C76S3Fresh;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.github.pagehelper.PageHelper;
import com.yc.fresh.bean.Product;
import com.yc.fresh.dao.ProductMapper;
import com.yc.fresh.dao.UserMapper;

import net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver;

@SpringBootTest
class C76S3FreshApplicationTests {
	
	@Resource
	private UserMapper um;
	@Resource
	private ProductMapper pm;
	@Test 
	void contextLoads() {
		Assert.isTrue(um.selectByExample(null).size() > 0, "结果集数量不正确!");
	}
	
	@Test
	void test1(){
		
		PageHelper.startPage(1, 15);
		
		List<Product> list =pm.selectByExample(null);
		
		for(Product product: list){
			System.out.println(product.getFname());
		}
		
	}

}
