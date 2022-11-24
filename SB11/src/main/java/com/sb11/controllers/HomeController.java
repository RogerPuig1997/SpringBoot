package com.sb11.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping(path = "/")
	public TextToJSON test() {
		return new TextToJSON("index.html");
	}
}
