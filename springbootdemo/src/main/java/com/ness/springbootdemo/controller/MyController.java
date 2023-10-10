package com.ness.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	//@RequestMapping(value = "/greetings",method = {RequestMethod.GET})
	
	@GetMapping("/greetings")
	public String getGreetings() {
		return "Good Evening...";
	}
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return "Welcome to Springboot Application.";
	}

}
