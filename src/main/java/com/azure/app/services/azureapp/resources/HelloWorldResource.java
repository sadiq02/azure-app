package com.azure.app.services.azureapp.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

	@Value("${environment}")
	private String environment;

	@GetMapping("/{name}")
	public String getHello(@PathVariable("name") String name) {
		return "Hello " + name + " " + environment;

	}

}
