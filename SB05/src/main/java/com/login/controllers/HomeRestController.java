package com.login.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	@RequestMapping(path = "/")
	public String index() {
		return "index.html";
	}
}
