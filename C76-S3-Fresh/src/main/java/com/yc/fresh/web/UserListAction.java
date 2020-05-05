package com.yc.fresh.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.yc.fresh.bean.Bill;
import com.yc.fresh.bean.BillExample;
import com.yc.fresh.bean.Cart;
import com.yc.fresh.bean.CartExample;
import com.yc.fresh.bean.ProductExample;
import com.yc.fresh.bean.User;
import com.yc.fresh.bean.UserExample;
import com.yc.fresh.biz.BizException;
import com.yc.fresh.biz.UserBiz;
import com.yc.fresh.dao.BillMapper;
import com.yc.fresh.dao.CartMapper;

import com.yc.fresh.dao.UserMapper;
import com.yc.fresh.vo.Result;


@Controller
public class UserListAction {
	
	@Resource
	private BillMapper bm;
	
	@Resource
	private UserMapper um;
	
	@Resource
	private UserBiz ubiz;
	
	@Resource
	private CartMapper cm;
	
	@GetMapping("user_list")
	public String user_list(Model m) {
		UserExample ue = new UserExample();
		m.addAttribute("ulist", um.selectByExample(ue));
		return "back/user_list";
				
	}
	
	@GetMapping("user_detail")
	public String user_detail(Integer uid,Model m) {
		
		m.addAttribute("user", um.selectByPrimaryKey(uid));
		return "back/user_detail";
	}
	
	@GetMapping("userAdd_detail")
	public String userAdd_detail() {
		
		return "back/userAdd_detail";
	}
	
	@Value(value = "${myUploadPath}")
	 private String myUploadPath;
	
	@PostMapping("addnewuser")
	@ResponseBody
	public Result addnewuser(@Valid User user,Errors errors,@RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		
		if(errors.hasFieldErrors()) {
	 		return new Result(0,"添加失败",errors.getFieldErrors());
	 	}
		file.transferTo(new File(myUploadPath +file.getOriginalFilename()));
		
		try {
			String ufilename = "/" + file.getOriginalFilename();
	 		user.setUfilename(ufilename);
			ubiz.reg(user);
			return new Result(1, "添加成功");
		} catch (BizException e) {
			e.printStackTrace();
			errors.rejectValue(e.getName(), "" + e.getCode(),e.getMessage());
			return new Result(e.getCode(),"添加失败",errors.getFieldErrors());
		}
	}
		
	@GetMapping("user_delete")
	public String  user_delete(Model m, Integer uid) {
		um.deleteByPrimaryKey(uid);
		return user_list(m);
	}
	
	
}
