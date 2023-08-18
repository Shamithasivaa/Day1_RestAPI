package com.day1.welcome.message.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Name {
	@Value("${var}")
	private String studentname;
	@GetMapping("/name")
	public String getName()
	{
		return "Welcome "+studentname+" !";
	}
}
