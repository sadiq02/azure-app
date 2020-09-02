package com.azure.app.services.azureapp.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@GetMapping("/{name}")
	public String getHello(@PathVariable("name") String name) {
		return "Hello " + name;

	}
	
}
