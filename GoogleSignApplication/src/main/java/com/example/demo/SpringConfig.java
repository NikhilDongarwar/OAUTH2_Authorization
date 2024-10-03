package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringConfig {

	
	@Bean
	public SecurityFilterChain securityfilterchain(HttpSecurity http) throws Exception{
		return http
				.authorizeHttpRequests(register->{
		register.requestMatchers("/").permitAll();
		register.anyRequest().authenticated();
		
		
		})
       // .oauth2Login(Customizer.withDefaults())  // this provide custom  output given by springboot after login 
				.oauth2Login(oauth2Login->{
					oauth2Login.successHandler((request,response,authentication)->response.sendRedirect("/profile"));
				})
        .formLogin(Customizer.withDefaults())
        
        		.build();
	}
}
