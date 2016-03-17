package com.alphadon.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * @author alphadon
 * 
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/*@RequestMapping()
	public ModelAndView showLogin() {
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}*/
	@RequestMapping({"/","/index"})
	public ModelAndView showHomePage() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
}
