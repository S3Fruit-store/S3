package com.yc.C76S3Fresh;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yc.fresh.C76S3FreshApplication;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.ProductExample.Criteria;
import com.yc.fresh.dao.ProductMapper;
import com.yc.fresh.dao.UserMapper;

@SpringBootTest(classes=C76S3FreshApplication.class)
class C76S3FreshApplicationTests {
	

	@Resource
	private ProductMapper pm;
	@Resource
	private UserMapper um;
	
	@Test 
	void contextLoads() {
		Assert.isTrue(um.selectByExample(null).size() > 0, "结果集数量不正确!");
	}

	@Test
	void HotProduct(){
		Assert.isTrue(pm.selectByExample(null).size() > 0, "结果集数量不正确!");
		
		ProductExample pe =new ProductExample();
		pe.setOrderByClause("fnumber DESC");//降序排列
		
		Page<Product> page=PageHelper.startPage(1, 6);
		pm.selectByExample(pe);
		
		for (Product product : page) {
			System.out.println(product.getFname());
		}
	}
}
