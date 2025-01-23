package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.demo")
@ComponentScan(basePackages ="com.demo")
public class DemoDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevopsApplication.class, args);
	}

}
