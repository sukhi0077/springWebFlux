package com.home.reactive.spring2hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring2helloApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2helloApplication.class, args);
		System.out.println("AppStarted");
	}

}
