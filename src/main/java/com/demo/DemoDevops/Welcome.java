package com.demo.DemoDevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")
public class Welcome {
	
	@GetMapping("/hello")
	public String hello() {
	 return "Welcome to the world !!!";	
	}

}
