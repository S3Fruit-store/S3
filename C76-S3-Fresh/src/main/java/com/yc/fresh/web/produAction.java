package com.yc.fresh.web;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.Cart;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.bean.User;
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
		Page<Product> pg = PageHelper.startPage(page,6,true);
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
		m.addAttribute("fid",fid);
		
		return "orange";
	}
	
	@PostMapping("addcart")
	@ResponseBody
	public Result addcart(@SessionAttribute("loginedUser") User user,Cart cart,Integer fid,Integer ccount){
		cart.setUid(user.getUid());
		cart.setFid(fid);
		cart.setCcount(ccount);;
		cart.setCtime(new Date());
		
		int code=cm.insert(cart);
		if (code>0) {
			Result result =new Result(code); 
			return new Result(result.getCode(),"加入购物车成功");
		}else{
			Result result =new Result(code);
			return new Result(result.getCode(),"加入购物车失败");
		}
	
	}
}
