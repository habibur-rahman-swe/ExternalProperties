package com.habib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.habib.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController myController = new MyController();
		System.out.println(myController.hello());
	}

}
