package com.yc.fresh.biz;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

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
		ue.or().andUaccountEqualTo(user.getUaccount()).andUpwdEqualTo(user.getUpwd());
		

		List<User> list = um.selectByExample(ue);

		if (list.size() == 0) {
			throw new BizException(103, "name", "用户名或密码错误!");
		} else if (list.size() > 1) {
			throw new BizException(104, "name", "存在多个相同的账号信息, 请更换其他登录字段!");
		} else {
			return list.get(0);
		}

	}

	
	
	
}
