package com.store.startlight_store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class index1Controller {
	@GetMapping("/")
	public String homePage() {
		return "index1";
	}
//	@GetMapping("/store/thanhtoanvatienich"){
//		return 
//	}
}
