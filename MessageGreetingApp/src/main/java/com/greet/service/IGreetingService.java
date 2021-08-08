package com.greet.service;

import com.greet.model.Greeting;
import com.greet.model.User;

public interface IGreetingService {
	Greeting addGreeting(User user);
	Greeting getGreetingbyID(Long id);
}
