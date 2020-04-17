package com.yc.fresh.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.dao.ProductMapper;

@Controller
public class fIndexAction {
	
	@Resource
	private ProductMapper pm;
	
	@GetMapping({ "/", "index", "index.html" })
	public String index(@RequestParam(defaultValue="1") Integer page,Model m) {
		
		ProductExample pe =new ProductExample();
		pe.setOrderByClause("fnumber DESC");//热销降序排列
		Page<Product> hotproduct = PageHelper.startPage(1, 6);
		pm.selectByExample(pe);
		m.addAttribute("fhlist", hotproduct);
		
		pe.setOrderByClause("ftime DESC");//时间降序排列
		Page<Product> newproduct = PageHelper.startPage(1, 4);
		pm.selectByExample(pe);
		m.addAttribute("ftlist", newproduct);
		
		return "index";
	}
	
	@GetMapping({ "orange" })
	public String orange(Integer id,Model m) {
		Product p=pm.selectByPrimaryKey(id);
		m.addAttribute(p);
		return "orange";
		}
	
	
	
}
