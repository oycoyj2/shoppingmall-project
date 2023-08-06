package com.example.climbing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClimbingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimbingApplication.class, args);
	}

	@GetMapping(value = "/")
	public String HelloWorld() {
		return "Hello World";
	}

}
