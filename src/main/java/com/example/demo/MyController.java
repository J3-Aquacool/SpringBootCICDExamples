package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {

	@GetMapping("/welcome")
	public String hello()
	{
		
		return "hi guys";
	}
}
