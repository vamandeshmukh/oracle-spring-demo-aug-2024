package com.oracle.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Department department() {
		return new Department();
	}

	@Bean
	public Employee employee() {
		return new Employee();
	}

}
