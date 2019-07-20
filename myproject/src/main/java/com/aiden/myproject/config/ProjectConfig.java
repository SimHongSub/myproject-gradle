package com.aiden.myproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.aiden.myproject.MainController;

@Configuration
public class ProjectConfig {

	@Bean
	public MainController mainController(){
		return new MainController();
	}
}
