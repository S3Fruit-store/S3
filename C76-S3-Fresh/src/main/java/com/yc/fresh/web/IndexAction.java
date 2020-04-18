package com.yc.fresh.web;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.yc.fresh.bean.CartExample;
import com.yc.fresh.bean.User;
import com.yc.fresh.biz.BizException;
import com.yc.fresh.biz.UserBiz;
import com.yc.fresh.dao.CartMapper;
import com.yc.fresh.vo.Result;



@Controller
public class IndexAction {
	
	@Resource
	private UserBiz ubiz;
	
	
	
	@GetMapping("tologin")
	public String tologin() {
		return "login";
	}
	@PostMapping("login")
	@ResponseBody
	public ModelAndView login(@Valid User user,Errors errors,HttpSession session,
			ModelAndView mav,@SessionAttribute(name="uri",required=false)String uri) {
		
		try {
			User dbuser = ubiz.login(user);
			session.setAttribute("loginedUser", dbuser);
			if(uri != null) {
				// 这是拦截登录的情况
				mav.setViewName("redirect:http://127.0.0.1" + uri);
			} else {
				// 这是用户的主动登录
				mav.setViewName("index");
			}
		} catch (BizException e) {
			e.printStackTrace();
			mav.addObject("msg", e.getMessage());
			mav.setViewName("login");
		}
		return mav;
		
	}
	@GetMapping("toreg")
	public String toreg() {
		return "reg";
	}
	
	 @Value(value = "${myUploadPath}")
	 private String myUploadPath;
	
	@PostMapping("reg")
	@ResponseBody
	public Result reg(@Valid User user,Errors errors,@RequestParam("file")MultipartFile file) throws IllegalStateException, IOException {
		System.out.println(user);
		if(errors.hasFieldErrors()) {
	 		return new Result(0,"用户注册失败",errors.getFieldErrors());
	 	}
		file.transferTo(new File(myUploadPath +file.getOriginalFilename()));
		
		try {
			String ufilename = "/" + file.getOriginalFilename();
	 		user.setUfilename(ufilename);
			ubiz.reg(user);
			return new Result(1, "用户注册成功");
		} catch (BizException e) {
			e.printStackTrace();
			errors.rejectValue(e.getName(), "" + e.getCode(),e.getMessage());
			return new Result(e.getCode(),"用户注册失败",errors.getFieldErrors());
		}
		
	}
	@GetMapping("tologinout")
	public String loginout(HttpSession session) {
		
		try {
            session .removeAttribute("loginedUser");
        }catch (Exception e){
        	e.printStackTrace();
        }
        
        return "index";
    }
	
	@GetMapping("toforget")
	public String toforget() {
		return "forget";
	}

	@PostMapping("sendVcode")
	@ResponseBody
	public Result sendVcode(String uaccount, HttpSession session) {
		try {
			String vcode = ubiz.forget(uaccount);
			session.setAttribute("vcode", vcode);
			return new Result(0, "验证码发送成功!");
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(1, e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
			return new Result(1, "邮件发送失败,请联系客服!");
		}
	}
	
	
	
	@PostMapping("changePwd")
	@ResponseBody
	public Result changePwd(User user,String uaccount,String upwd, String vcode,
			@SessionAttribute("vcode") String sessionVcode) {
		System.out.println(vcode + "====" + sessionVcode);
		System.out.println(user.toString());
		if(sessionVcode.equals(vcode) == false) {
			return new Result(0, "验证码输入错误!");
		} else {
			
			ubiz.changpwd(user,uaccount, upwd);
			
			return new Result(0, "密码修改成功");
			
		}
	}
	
	
	
	
}
