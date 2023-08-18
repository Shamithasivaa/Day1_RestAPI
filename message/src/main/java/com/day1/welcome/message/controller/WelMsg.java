package com.day1.welcome.message.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelMsg {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to Spring Boot.Have a nice day!";

	}

}