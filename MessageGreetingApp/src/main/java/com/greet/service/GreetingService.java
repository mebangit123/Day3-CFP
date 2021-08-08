package com.greet.service;

import java.util.concurrent.atomic.AtomicLong;

import com.greet.model.Greeting;
import com.greet.model.User;
import com.greet.repository.GreetingRepository;

public class GreetingService implements IGreetingService {
	private static final String template = "Hello, %s";
	private final AtomicLong counter = new AtomicLong();
	
	private GreetingRepository greetingRepository;
	@Override
	public Greeting addGreeting(User user) {
		String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
		return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
	}

	@Override
	public Greeting getGreetingbyID(Long id) {
		return null;
	}

}
