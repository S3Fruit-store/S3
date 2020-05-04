package com.yc.fresh.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.ExpressExample;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.dao.ExpressMapper;
import com.yc.fresh.dao.ProductMapper;

@Controller
public class backAction {
	@Resource
	private ProductMapper pm;
	
	@Resource
	private ExpressMapper em;
	//商品列表
	@GetMapping("product_list")
	public String product_list(Model m,@RequestParam(defaultValue = "1") Integer page) {
		Page<Product> pg = PageHelper.startPage(page,5,true);
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFtemp1EqualTo("1");
		m.addAttribute("plist", pm.selectByExample(pe));
		
		PageInfo <Product>  pageInfo = pg.toPageInfo();
		m.addAttribute("glist", pageInfo);
		return "back/product_list";
				
	}
	//商品详情
	@GetMapping("product_detail")
	public String product_detail(Integer fid,Model m) {
		
		m.addAttribute("product", pm.selectByPrimaryKey(fid));
		return "back/product_detail";
	}
	
	//添加商品
	@GetMapping("product_add")
	public String addProduct() {
		
		return "back/product_add";
	}
	
	//将商品放入回收站
	@GetMapping("product_recycle")
	public String product_recycle(Model m,Integer fid
			,@RequestParam(defaultValue = "1") Integer page) {
		Product product = new Product();
		product.setFid(fid);
		product.setFtemp1("0");
		pm.updateByPrimaryKeySelective(product);
		
		return product_list(m,page);
	}
	
	//商品回收站
	@GetMapping("recycle_bin")
	public String recycle_bin(Model m) {
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFtemp1EqualTo("0");
		m.addAttribute("pclist", pm.selectByExample(pe));
		return "back/recycle_bin";
	}
	//商品恢复
	@GetMapping("product_recover")
	public String product_recover(Integer fid,Model m) {
		Product product = new Product();
		product.setFid(fid);
		product.setFtemp1("1");
		pm.updateByPrimaryKeySelective(product);
		return recycle_bin(m);
	}
	//彻底删除
	@GetMapping("product_delete")
	public String  product_delete(Model m, Integer fid) {
		pm.deleteByPrimaryKey(fid);
		return recycle_bin(m);
	}
	//配送方式管理
	@GetMapping("express_list")
	public String express_list(Model m) {
		
		m.addAttribute("elist", em.selectByExample(null));
		return "express_list";
	}
	@GetMapping("express_add")
	public String express_add( Model m) {
		
		return "express_list";
				
	}
	
}