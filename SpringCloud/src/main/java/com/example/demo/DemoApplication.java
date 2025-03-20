package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Alien obj = new Alien(); <- Here i am responsible to create object and i have to destroy it
		Alien obj = context.getBean(Alien.class);	// Now here spring will do this using getBean()
		obj.code();
	}

} 
