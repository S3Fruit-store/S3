package com.yc.fresh.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.yc.fresh.bean.CartExample;
import com.yc.fresh.bean.User;
import com.yc.fresh.bean.UserExample;
import com.yc.fresh.dao.CartMapper;
import com.yc.fresh.dao.UserMapper;

@Controller
public class UserAction {
	
	@GetMapping("tomember")
	public String toMember() {
		return "member";
	}
	@Resource
	private UserMapper um;
	
	@GetMapping("memeber")
	public ModelAndView Member(ModelAndView mav,
			@SessionAttribute("loginedUser") User user) {
		UserExample ue =  new UserExample();
		ue.createCriteria().andUidEqualTo(user.getUid());
		mav.addObject("ulist",um.selectByExample(ue) );
		mav.setViewName("member");
		return mav;
	}
	
	
	@GetMapping("tocart")
	public String toCart() {
		return "cart";
	}
	
	@Resource
	private CartMapper cm;
	
	@GetMapping("toCart")
	public ModelAndView toCart(ModelAndView mav,
			@SessionAttribute("loginedUser") User user) {
		CartExample ce = new CartExample();
		ce.createCriteria().andUidEqualTo(user.getUid());
		mav.addObject("clist",cm.selectByExample(ce));
		mav.setViewName("cart");
		return mav;
	}
	
}
