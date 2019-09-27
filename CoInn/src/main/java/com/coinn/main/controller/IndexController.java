package com.coinn.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;



@Log
@Controller
@RequestMapping("/coinn")
public class IndexController {

	
	
	@GetMapping("/index")
	public void index() {
		
	}
 
 
	
	@GetMapping("/listing")
	public void listing() {
		
	}
	
	
	
}
