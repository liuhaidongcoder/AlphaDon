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
@Controller("indexController")
@RequestMapping(value = "/*")
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping()
	public ModelAndView index() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("/serviceManage/serviceManage");
		return view;
	}
}
