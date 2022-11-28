package com.sb11.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sb11.pojos.TextToJSON;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping(path = "/", produces="application/json")
	public TextToJSON test1() {
		return new TextToJSON("index.html");
	}
	public String test2() {
		return "{\"page\": \"index.html\"}";
	}
	public ObjectNode index() {
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("key", "value");
		objectNode.put("foo", "bar");
		objectNode.put("number", 42);
		return objectNode;
	}
	public ResponseEntity<String> getGreetingWithResponseEntity(){
		final HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"test\": \"Hello with ResponseEntity\"}", httpHeaders, HttpStatus.OK);
	}
}
