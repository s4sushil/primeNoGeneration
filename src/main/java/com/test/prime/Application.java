package com.test.prime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.prime.service.PrimeNumberService;
import com.test.prime.service.PrimeNumberServiceImpl;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public PrimeNumberService createServiceInstance() {
		return new PrimeNumberServiceImpl();
	}
}
