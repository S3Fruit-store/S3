package com.yc.fresh.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.yc.fresh.bean.Bill;
import com.yc.fresh.bean.BillExample;
import com.yc.fresh.bean.Cart;
import com.yc.fresh.bean.CartExample;

import com.yc.fresh.bean.User;

import com.yc.fresh.dao.BillMapper;
import com.yc.fresh.dao.CartMapper;

import com.yc.fresh.dao.UserMapper;


@Controller
public class UserAction {
	
	@Resource
	private BillMapper bm;
	
	@Resource
	private UserMapper um;
	
	@Resource
	private CartMapper cm;
	

	
	@GetMapping("tomember")
	public String tomember() {
		  return "member";
	}

	
	 @GetMapping("tocart")
	 public String tocart() {
		  return "cart";
	  
	 }
	 

	@GetMapping("cart")
	public String Cart(Model m,
			@SessionAttribute("loginedUser") User user) {
		CartExample ce = new CartExample();
		ce.createCriteria().andUidEqualTo(user.getUid());
		List<Cart> clist = cm.selectByExample(ce); 
		m.addAttribute("clist",clist);
		
		return "cart";
	}
	
	
	
	@GetMapping("member_order")
	public String memberOrder(Model m,
			@SessionAttribute("loginedUser")User user) {
		BillExample oe = new BillExample();
		oe.createCriteria().andUidEqualTo(user.getUid());
		List<Bill> olist = bm.selectByExample(oe);
		m.addAttribute("olist", olist);
		System.out.println(olist.size());
		return "member_order";
	}
}
