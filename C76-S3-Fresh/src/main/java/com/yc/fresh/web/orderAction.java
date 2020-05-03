package com.yc.fresh.web;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.swing.CellEditor;

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
import com.yc.fresh.bean.Bill;
import com.yc.fresh.bean.BillExample;
import com.yc.fresh.bean.Cart;
import com.yc.fresh.bean.Orderdetail;
import com.yc.fresh.bean.OrderdetailExample;
import com.yc.fresh.bean.Product;
import com.yc.fresh.bean.User;
import com.yc.fresh.dao.BillMapper;
import com.yc.fresh.dao.OrderdetailMapper;
import com.yc.fresh.vo.Result;

@Controller
public class orderAction {
	
	@Resource
	private BillMapper bm;
	@Resource
	private OrderdetailMapper om;
	
	@GetMapping("order_list")
	public String orderlist(@RequestParam(defaultValue = "1") Integer page, Model m) {
		Page<Bill> pb = PageHelper.startPage(page,4);
		BillExample be = new BillExample();
		bm.selectByExample(be);
		m.addAttribute("plist", pb);
		PageInfo <Bill>  pageInfo = pb.toPageInfo();
		m.addAttribute("pageinfolist", pageInfo);
		return "back/order_list";
	}
	@GetMapping("delectorder_list")
	public String  deleteorderlist(Model m, Integer oid) {
		bm.deleteByPrimaryKey(oid);
		return orderlist(1,m);
	}
	
	@GetMapping("order_detail")
	public String orderdetail(Integer oid, Model m) {
		bm.selectByPrimaryKey(oid);
		m.addAttribute("blist",bm.selectByPrimaryKey(oid));
		OrderdetailExample oe =new OrderdetailExample();
		oe.createCriteria().andOidEqualTo(oid);
		m.addAttribute("olist",om.selectByExample(oe));
		m.addAttribute("oid",oid);
		return "back/order_detail";
	}
	//发货
	@PostMapping("delivergoods")
	@ResponseBody
	public Result delivergoods(Integer oid, Model m,Bill bill,String onote) {
		System.out.println("+++++++++++++++++");
		int code=0;
		bill.setOtype(3);
		bill.setOnote(onote);
		Bill bill2 =bm.selectByPrimaryKey(oid);
		System.out.println("+++++++++++++++++");
		System.out.println(bill2.getOtype());
		if(bill2.getOtype()==2){
			BillExample be =new BillExample();
			be.createCriteria().andOidEqualTo(oid);
			code=bm.updateByExampleSelective(bill, be);
		}else {
			Result result =new Result(code);
			return new Result(result.getCode(),"发货失败");
		}
		
		if (code>0) {
			Result result =new Result(code);
			return new Result(result.getCode(),"发货成功");
		}else{
			Result result =new Result(code);
			return new Result(result.getCode(),"发货失败");
		}
	}
	
}
