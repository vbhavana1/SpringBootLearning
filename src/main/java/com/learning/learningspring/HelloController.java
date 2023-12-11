package com.learning.learningspring;

import java.util.HashSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/sayhello")
	public String sayHello() {
		return "Hello Friends";
		
	}
	
	
	@RequestMapping("/sayHelloTo")
	public HashSet<String> sayHelloTo(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("meena");
		hs.add("teena");
		hs.add("meena");
		hs.add("Reena");
		hs.add("meena");

		
			
		return  hs;
		
		
	}
	
	
}
