package com.example.testspringboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestspringbootApplication.class, args);
		/*
		 * ApplicationContext applicationContext =
		 * SpringApplication.run(TestspringbootApplication.class, args);
		 * 
		 * 
		 * Arrays.stream(applicationContext.getBeanDefinitionNames()). forEach(name ->
		 * System.out.println(name));
		 */

	}

}
