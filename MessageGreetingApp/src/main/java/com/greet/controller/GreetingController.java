package com.greet.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greet.model.Greeting;
import com.greet.model.User;
import com.greet.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
	
	@Autowired
	IGreetingService greetingService;
	
	@GetMapping(value= {"","/","/home"})
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
	}
	
}
