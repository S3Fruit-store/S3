package com.yc.fresh.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.fresh.bean.Bill;
import com.yc.fresh.bean.BillExample;
import com.yc.fresh.bean.Orderdetail;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import com.yc.fresh.bean.User;
import com.yc.fresh.dao.BillMapper;
import com.yc.fresh.dao.ProductMapper;

public class orderAction {
	
	@Resource
	private BillMapper bm;
	
	@GetMapping({ "order" })
	public String orange(@RequestParam(defaultValue = "1") Integer page,@SessionAttribute("loginedUser") User user, Model m) {
		Page<Bill> pb = PageHelper.startPage(page,4);
		BillExample be = new BillExample();
		be.createCriteria().andUidEqualTo(user.getUid());
		bm.selectByExample(be);
		m.addAttribute("plist", pb);
		
		return "order";

	}
}
