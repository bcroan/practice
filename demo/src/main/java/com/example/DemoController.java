package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping(path="hello/{message}")
	public String hello(@PathVariable("message") String message) {
		return message + 1;
	}
}
