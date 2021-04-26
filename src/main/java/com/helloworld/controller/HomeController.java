package com.helloworld.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// create a mapping for "/hello"
	
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
		
		// get time stamp
		String pattern = "MM/dd/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		String date = df.format(new java.util.Date());
		
		// welcome message
		String welcome = "Welcome to the machine.";
		
		// add message and time stamp to object
		theModel.addAttribute("welcome", welcome);
		theModel.addAttribute("theDate", date);
		
		// return hello world page 
		return "helloworld";
	}
}








