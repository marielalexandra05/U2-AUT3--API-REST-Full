package com.ista.backend.apirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition 
public class LeonSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeonSpringbootApplication.class, args);
	}

}
