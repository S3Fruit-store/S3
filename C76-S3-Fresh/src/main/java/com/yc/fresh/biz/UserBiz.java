package com.yc.fresh.biz;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


import com.yc.fresh.bean.User;
import com.yc.fresh.bean.UserExample;
import com.yc.fresh.dao.UserMapper;



@Service
public class UserBiz {
	@Resource
	private UserMapper um;
	
	public User login(@Valid User user) throws BizException {
		UserExample ue = new UserExample();
		ue.or().andUaccountEqualTo(user.getUaccount()).andUpwdEqualTo(user.getUpwd()).andUtypeEqualTo(1);
		ue.or().andUnameEqualTo(user.getUaccount()).andUpwdEqualTo(user.getUpwd());
		
		List<User> list = um.selectByExample(ue);

		if (list.size() == 0) {
			throw new BizException(103, "name", "用户名或密码错误!");
		} else {
			return list.get(0);
		}

	}
	
	public void reg(User user) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUaccountEqualTo(user.getUaccount());
		
		if( um.countByExample(ue) > 0) {
			throw new BizException(102,"name","该账户名已被注册");
		}
		um.insert(user);
	}

	@Resource
	private MailService ms;
	
	public String forget(String uaccount) throws BizException {
		UserExample ue = new UserExample();
		ue.createCriteria().andUaccountEqualTo(uaccount);
		List<User> list = um.selectByExample(ue);
		if(list.size() == 1) {
			User user = list.get(0);
			String vcode = System.currentTimeMillis() + "";
			vcode = vcode.substring(vcode.length()-4, vcode.length());
			String content = "您重置密码所需的验证码是: " + vcode;
			ms.sendSimpleMail(user.getUemail(), "重置密码", content);
			return vcode;
		} else {
			throw new BizException(1007, "name", "用户名错误!");
		}
	}
	
	public void changpwd(User user,String uaccount,String upwd) {
		System.out.println(user.toString());
		UserExample ue = new UserExample();
		
		ue.createCriteria().andUaccountEqualTo(uaccount);
		user.setUpwd(upwd);
		
		um.updateByExampleSelective(user, ue);
		
		System.out.println(user.toString());
		
		
	}
	
}
