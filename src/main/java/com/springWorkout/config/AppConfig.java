package com.springWorkout.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springWorkout.domain.Click;

@Configuration
public class AppConfig {
	@Bean
	@Scope("prototype")
	public Click clickPrototype() {
		return new Click();
	}

	@Bean
	@Scope("singleton")
	public Click clickSingleton() {
		return new Click();
	}
}
