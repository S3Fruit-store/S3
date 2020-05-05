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
import com.yc.fresh.bean.OrderdetailExample;
import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.bean.User;

import com.yc.fresh.dao.BillMapper;
import com.yc.fresh.dao.CartMapper;
import com.yc.fresh.dao.OrderdetailMapper;
import com.yc.fresh.dao.UserMapper;


@Controller
public class UserAction {
	
	@Resource
	private BillMapper bm;
	
	@Resource
	private UserMapper um;
	
	@Resource
	private CartMapper cm;
	
	@Resource
	private OrderdetailMapper odm;
	
	@GetMapping("tomember")
	public String tomember() {
		  return "member";
	}

	
	 @GetMapping("tocart")
	 public String tocart() {
		 
		  return "redirect:cart";
	 }
	 
	 //购物车
	@GetMapping("cart")
	public String Cart(Model m,
			@SessionAttribute("loginedUser") User user) {
		CartExample ce = new CartExample();
		ce.createCriteria().andUidEqualTo(user.getUid());
		List<Cart> clist = cm.selectByExample(ce); 
		m.addAttribute("clist",clist);
		
		return "cart";
	}
	//购物车商品删除
	@GetMapping("cart_delete")
	public String cart_delete(Integer fid) {
		CartExample ce = new CartExample();
		ce.createCriteria().andFidEqualTo(fid);
		cm.deleteByExample(ce);
		
		return "redirect:cart";
	}
	
	//用户订单
	@GetMapping("member_order")
	public String memberOrder(Model m,
			@SessionAttribute("loginedUser")User user) {
		BillExample oe = new BillExample();
		oe.createCriteria().andUidEqualTo(user.getUid());
		oe.setOrderByClause("otime DESC");
		
		List<Bill> olist = bm.selectByExample(oe);
		m.addAttribute("olist", olist);
		
		return "member_order";
	}
	//商品详情
	@GetMapping("bill_detail")
	public String bill_detail(Model m,Integer oid) {
		//订单信息查询
		m.addAttribute("bill", bm.selectByPrimaryKey(oid));
		//订单中包含 的商品查询
		OrderdetailExample oe =new OrderdetailExample();
		oe.createCriteria().andOidEqualTo(oid);
		m.addAttribute("odlist",odm.selectByExample(oe));
		
		return "member_order_detail";
	}
	//取消订单
	@GetMapping("order_cancel")
	public String order_cancel(Integer oid) {
		Bill bill = new Bill();
		bill.setOid(oid);
		bill.setOtype(2);
		bm.updateByPrimaryKeySelective(bill);
		
		return "redirect:member_order";
		
	}
	//删除订单
	@GetMapping("order_delete")
	public String order_delete(Integer oid) {
		bm.deleteByPrimaryKey(oid);
		return "redirect:member_order";
	}
}
