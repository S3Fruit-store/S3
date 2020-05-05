package com.yc.fresh.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.Cart;
import com.yc.fresh.bean.CartExample;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.bean.User;
import com.yc.fresh.bean.UserExample;
import com.yc.fresh.biz.BizException;
import com.yc.fresh.dao.CartMapper;
import com.yc.fresh.dao.ProductMapper;
import com.yc.fresh.dao.ProductdetailMapper;
import com.yc.fresh.vo.Result;


@Controller
public class produAction {
	
	@Resource
	private ProductMapper pm;
	@Resource
	private ProductdetailMapper pdm;
	@Resource
	private CartMapper cm;
	
	@GetMapping({ "produ" })
	public String produ(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "国产水果") String fparenttype, Model m) {
		Page<Product> pg = PageHelper.startPage(page,8,true);
		ProductExample pe = new ProductExample();
		pe.createCriteria().andFparenttypeEqualTo(fparenttype).andFtemp1EqualTo("1");
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
		
		m.addAttribute("plist", pd);
		m.addAttribute("fid",fid);
		
		return "orange";
	}
	

	@PostMapping("addcart")
	@ResponseBody
	public Result addcart(@SessionAttribute("loginedUser") User user,Cart cart,Integer fid,Integer ccount){
		System.out.println("count="+ccount);
		CartExample ce =new CartExample();
		List<Cart> cart2 =cm.selectByExample(ce);
		if (cart2.isEmpty()) {
			cart.setUid(user.getUid());
			cart.setFid(fid);
			cart.setCtime(new Date());
			cart.setCcount(ccount);
			int code=cm.insert(cart);
			System.out.println(code);
			if (code>0) {
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车成功");
			}else{
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车失败");
			}
		}
		int j = 0;
		for(Cart c :cart2){
			int i=c.getFid();
			System.out.println("i=" + i);
			if(i==fid){
				
				j =	c.getCcount()+ccount;
			}else{
				j =	ccount;
			}
		}
		System.out.println("j="+j);
		if(j!=ccount){
			cart.setCtime(new Date());
			
			cart.setCcount(j);
			System.out.println(fid);
			ce.createCriteria().andFidEqualTo(fid).andUidEqualTo(user.getUid());
			
			
			int code=cm.updateByExampleSelective(cart, ce);
			System.out.println(code);
			if (code>0) {
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车成功");
			}else{
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车失败");
			}
		}else{
			cart.setUid(user.getUid());
			cart.setFid(fid);
			cart.setCtime(new Date());
			cart.setCcount(ccount);
			int code=cm.insert(cart);
			System.out.println(code);
			if (code>0) {
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车成功");
			}else{
				Result result =new Result(code);
				return new Result(result.getCode(),"加入购物车失败");
			}
		}
		
	
	}
}
