package com.example.demo;



import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@RequestMapping("/")
	public String Home() {
		return "Welcome";
	}
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
	

}
