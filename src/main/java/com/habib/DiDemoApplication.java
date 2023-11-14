package com.habib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.habib.controllers.MyController;
import com.habib.examplebeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		
		MyController myController = new MyController();
		System.out.println(myController.hello());
		
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUser());
	}

}
