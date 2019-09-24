package com.coinn.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;



@Log
@Controller
@RequestMapping("/coinn/main")
public class IndexController2 {

	
	
	@GetMapping("/index")
	public void index() {
		
	}
}
