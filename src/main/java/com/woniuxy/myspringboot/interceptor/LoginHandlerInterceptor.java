package com.woniuxy.myspringboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginHandlerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object user = request.getSession().getAttribute("user");
		if(user==null) {
			request.setAttribute("msg", "先登录");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		}
		return true;
}
}