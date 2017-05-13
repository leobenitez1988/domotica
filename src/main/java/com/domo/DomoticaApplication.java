package com.domo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.annotation.Resource;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebSecurity
@ComponentScan("com.domo")
public class DomoticaApplication {

	@Resource
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER");
	}

	public static void main(String[] args) {
		SpringApplication.run(DomoticaApplication.class, args);
	}
}
