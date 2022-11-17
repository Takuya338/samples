package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@GetMapping("/hello") 
	public String getHello() { 
		// hello.htmlに画面遷移 
		return "hello";
	}	
	
	@PostMapping("/hello")
	public String postRequest(@RequestParam("tx")String str,Model model) {
		
	model.addAttribute("sample",str);	
		
	return "response";	
	
	}

	
	
}

 
