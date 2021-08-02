package com.viru.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	/*
	@RequestMapping(path = "/hello-world", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hellow World";
	}
	*/
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hellow World";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hellow World");
	}
	
	@GetMapping("/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean( String.format("Hellow World, %s", name));
	}
}
