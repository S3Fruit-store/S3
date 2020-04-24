package com.yc.fresh.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yc.fresh.bean.AdvertisementExample;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.dao.AdvertisementMapper;
import com.yc.fresh.dao.ProductMapper;

@Controller
public class IndexAction {
	
	@Resource
	private ProductMapper pm;
	@Resource
	private AdvertisementMapper am;
	
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
		
		//获取最新的三个促销广告  广告的aid对应product的fid
		AdvertisementExample ae =new AdvertisementExample();	
		ae.setOrderByClause("atime DESC");
		ae.or().andAtypeEqualTo(1); 
		Page<Product> newadvertisement = PageHelper.startPage(1, 3);
		am.selectByExample(ae);
		m.addAttribute("atlist", newadvertisement);
		
		//获取最新的三个热销广告
		AdvertisementExample ah =new AdvertisementExample();
		ah.setOrderByClause("atime DESC");
		ah.or().andAtypeEqualTo(2); 
		Page<Product> hotadvertisement = PageHelper.startPage(1, 2);
		am.selectByExample(ah);
		m.addAttribute("ahlist", hotadvertisement);
		
		return "index";
	}
	
	
	
	
	
}
