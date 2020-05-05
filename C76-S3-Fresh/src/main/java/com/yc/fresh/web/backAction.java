package com.yc.fresh.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.ExpressExample;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.bean.Producttype;
import com.yc.fresh.bean.ProducttypeExample;
import com.yc.fresh.biz.BizException;
import com.yc.fresh.biz.ProductBiz;
import com.yc.fresh.dao.ExpressMapper;
import com.yc.fresh.dao.ProductMapper;
import com.yc.fresh.dao.ProductdetailMapper;
import com.yc.fresh.dao.ProducttypeMapper;
import com.yc.fresh.vo.Result;

@Controller
public class backAction {
	@Resource
	private ProductMapper pm;
	
	@Resource
	private ExpressMapper em;
	
	@Resource
	private ProducttypeMapper ptm;
	
	@Resource
	private ProductdetailMapper pdm;
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
		//商品信息
		Product product = pm.selectByPrimaryKey(fid);
		m.addAttribute("product", product);
		//商品类型
		ProducttypeExample pte = new ProducttypeExample();
		pte.createCriteria().andTidEqualTo(product.getTid());
		List<Producttype> tlist = ptm.selectByExample(pte);
		String type = tlist.get(0) .getTname();
		m.addAttribute("type", type);
		
		//详情图片查询
		ProductdetailExample pde = new ProductdetailExample();
		pde.createCriteria().andFidEqualTo(fid);
		m.addAttribute("pdlist",pdm.selectByExample(pde) );
		
		if(pdm.selectByExample(pde).size() ==0) {
			
		}
		return "back/product_detail";
	}
	
	//添加商品
	@GetMapping("product_add")
	public String addProduct(Model m) {
		
		m.addAttribute("tlist", ptm.selectByExample(null));
		
		return "back/product_add";
	}
	
	@Value(value = "${productUploadPath}")
	private String productUploadPath;
	
	@Resource
	private ProductBiz pbiz;
	
	@PostMapping("product_raise")
	@ResponseBody
	public Result product_raise(Product product,@RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(new File(productUploadPath +file.getOriginalFilename()));
		try {
			Date now = new Date();
			String filename = file.getOriginalFilename();
	 		product.setFfilename(filename);
			product.setFnumber(0);
			product.setFtemp1("1");
			product.setFtime(now);
			pbiz.product_add(product);
			return new Result(1,"商品添加成功");
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(e.getCode(), e.getName(),e.getMessage());
		}
		
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
