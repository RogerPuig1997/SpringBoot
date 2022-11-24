package com.login.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test.html");
		return mav;
	}
}
