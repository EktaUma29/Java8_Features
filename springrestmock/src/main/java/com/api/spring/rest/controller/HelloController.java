package com.api.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.spring.rest.hello.Hello;
import com.api.spring.rest.service.HelloService;

import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/hello")
public class HelloController {

	private HelloService helloService;

	public HelloController(HelloService helloService) {

		this.helloService = helloService;
	}

	@GetMapping
	public String helloMethod() {

		return helloService.HelloService();
	}

	@GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON)
	public Hello json() {
		return new Hello("Title", "Value");
	}
}
