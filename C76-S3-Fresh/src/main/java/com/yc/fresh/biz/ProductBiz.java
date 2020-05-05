package com.yc.fresh.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.dao.ProductMapper;
@Service
public class ProductBiz {
	
	@Resource
	private ProductMapper pm;
	
	public void product_add(Product product) throws BizException {
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFnameEqualTo(product.getFname());
		if(pm.countByExample(pe)>0) {
			throw new BizException(112, "name", "该商品名已存在");
		}
		pm.insert(product);
		
	}
}
