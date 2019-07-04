package com.sxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	/**
	 * �趨��¼ʧ����ת����Դ�Լ���ȡʧ�ܵ���Ϣ
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/login.do")
	public String login(Model model, HttpServletRequest request) {
		Object ex = request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		if (ex != null) {
			System.out.println(ex.toString() + "----------");
		}
		if (UnknownAccountException.class.getName().equals(ex)) {
			System.out.println("----�˺Ų���ȷ----->");
			model.addAttribute("msg", "�˺Ų���ȷ");
		} else if (IncorrectCredentialsException.class.getName().equals(ex)) {
			System.out.println("----���벻��ȷ----->");
			model.addAttribute("msg", "���벻��ȷ");
		} else {
			System.out.println("----��������----->");
			model.addAttribute("msg", "��������");
		}
		return "/login.jsp";
	}

}
