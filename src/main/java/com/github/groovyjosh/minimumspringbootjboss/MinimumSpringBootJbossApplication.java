package com.github.groovyjosh.minimumspringbootjboss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MinimumSpringBootJbossApplication {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot and JBoss!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MinimumSpringBootJbossApplication.class, args);
	}

}
