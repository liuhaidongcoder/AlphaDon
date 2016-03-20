package com.alphadon.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BasicContoller{
	@RequestMapping({"/home"})
	public ModelAndView showHomePage() {
		HttpSession session = getRequest().getSession();
		System.out.println(session.getAttribute("userName"));
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		return view;
	}
	@RequestMapping({"/blogEdit"})
	public ModelAndView showBlogEditPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("blogEdit");
		return view;
	}
}
