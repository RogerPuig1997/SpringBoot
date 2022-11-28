package com.sb12.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView test1() {
		ModelAndView mav = new ModelAndView();
		mav.setStatus(HttpStatus.OK);
		return mav;
	}
	public ModelAndView test2() {
		ModelAndView mav = new ModelAndView();
		mav.setStatus(HttpStatus.NOT_FOUND);
		return mav;
	}
}
