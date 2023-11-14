package com.habib.controllers;

import org.springframework.stereotype.Controller;

import com.habib.services.GreetingService;
import com.habib.services.impl.GreetingServiceImpl;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	public MyController() {
		greetingService = new GreetingServiceImpl();
	}
	
	public String hello() {
		System.out.println("Hello!!! ");
		
		return  greetingService.sayGreeting();
	}
}
