package com.toyota.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/")
	public String method1() {
		return("hi");
	}
	
	System.out.println("Hi");
	

}
