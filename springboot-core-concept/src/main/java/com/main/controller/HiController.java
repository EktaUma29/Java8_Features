package com.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@RequestMapping("/hi")
	public String hiMethod() {
		return "Hi! Ekta \n Welcome in this world";
	}
}
