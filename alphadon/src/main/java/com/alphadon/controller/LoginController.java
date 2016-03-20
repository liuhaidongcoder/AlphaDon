package com.alphadon.controller;


import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.alphadon.service.UserValidateService;
import com.alphadon.service.impl.UserValidateServiceImpl;


/*
 * @author alphadon
 * 
 */
@Controller
public class LoginController extends BasicContoller{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	UserValidateService userValidate;

	@RequestMapping({"/","/login"})
	public ModelAndView showHomePage() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		logger.info("进入登录页面");
		return view;
	}
	@RequestMapping({"/loginHome"})
	public ModelAndView validateLogin(@RequestParam("userName") String userName,
			@RequestParam("userPass") String userPass) {
		
		ModelAndView view = new ModelAndView();
		//验证用户名是否合法
		//validateUser
		if(userValidate.isInvalidUser(userName,userPass)){//验证合法进入主页
			//设置session
			HttpSession session = getRequest().getSession();
			session.setAttribute("userName", userName);
			session.setMaxInactiveInterval(30*60);
			session.getAttribute(userName);
			view.setViewName("home");
			logger.info("进入主页面");
		}else{//验证不合法返回登录界面
			view.setViewName("login");
			logger.info("进入登录界面");
		};			
		return view;
	}
}
