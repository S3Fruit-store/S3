package com.yc.fresh.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


public class LoginInterceptor implements HandlerInterceptor{

	/**
	 * 	返回 true 允许访问目标资源
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("loginedUser") == null) {
			String uri = request.getRequestURI();
			// 保存当前用户访问的地址和参数( GET )
			session.setAttribute("uri", uri);
			response.sendRedirect("http://127.0.0.1/tologin");
			return false;
		}
		return true;
	}
}
