package com.nentang.edu.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// Action sayHello
	@GetMapping("/hello")
	public String sayHello() {
		return "Xin chào Java Spring MVC";
	}

	// Action gioiThieu
	@GetMapping("/gioi-thieu")
	public String gioiThieu() {
		return "<h1 style=\"border: 1px solid red; padding: 10px; color: red;\">Giới thiệu</h1>";
	}
}
