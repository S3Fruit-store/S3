package com.yc.fresh.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.dao.ProductMapper;
import com.yc.fresh.dao.ProductdetailMapper;


@Controller
public class produAction {
	@Resource
	private ProductMapper pm;
	@Resource
	private ProductdetailMapper pdm;
	
	@GetMapping({ "/", "index", "index.html" })
	public String index() {
		return "index";
	}
	
	@GetMapping({ "produ" })
	public String produ(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "国产水果") String fparenttype, Model m) {
		Page<Product> pg = PageHelper.startPage(page, 12,true);
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFparenttypeEqualTo(fparenttype);
		pm.selectByExample(pe);
		m.addAttribute("alist", pg);
		PageInfo <Product>  pageInfo = pg.toPageInfo();
		
		m.addAttribute("plist", pageInfo);
		return "produ";
	}
	@GetMapping({ "orange" })
	public String orange(Integer fid, Model m) {
		Product pg= pm.selectByPrimaryKey(fid);
		ProductdetailExample pde =new ProductdetailExample();
		pde.createCriteria().andFidEqualTo(fid);
		List<Productdetail> pd= pdm.selectByExample(pde);
		m.addAttribute("alist", pg);
		System.out.println(pd.toString());
		m.addAttribute("plist", pd);
		
		return "orange";
	}
	
}
