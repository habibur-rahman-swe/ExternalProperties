package com.habib.services.impl;

import org.springframework.stereotype.Service;

import com.habib.services.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO_GURUS = "Hello  Gurus!!!";

	@Override
	public String sayGreeting() {

		return HELLO_GURUS;

	}

}
