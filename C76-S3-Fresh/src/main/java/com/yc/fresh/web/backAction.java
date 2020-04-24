package com.yc.fresh.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.dao.ProductMapper;

@Controller
public class backAction {
	@Resource
	private ProductMapper pm;
	
	@GetMapping("product_list")
	public String product_list(Model m) {
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFtemp1EqualTo("1");
		m.addAttribute("plist", pm.selectByExample(pe));
		return "back/product_list";
				
	}
	
	@GetMapping("product_detail")
	public String product_detail() {
		
		return "product_detail";
	}
	
}
