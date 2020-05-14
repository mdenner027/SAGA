package br.edu.ufersa.saga.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class Interceptador extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws Exception {
		String uri = request.getRequestURI();
		if (uri.contains("login") || uri.contains("assets") || request.getSession().getAttribute("usuarioLogado") != null) {
			return true;
		} else {
			response.sendRedirect("efetuar-login");
		}
		return false;
	}

}
