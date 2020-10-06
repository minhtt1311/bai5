package com.example.webday5restmethods.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday5restmethods.rest.model.CreateStudentRequest;

@RestController
@RequestMapping("/post-endpoints")
public class PostController {

	@PostMapping("/string")
	public String string(@RequestBody String s) {
		return String.format("String body is: %s", s);
	}

	@PostMapping("/person")
	public String postPerson(@RequestBody CreateStudentRequest restPerson) {
		return String.format("Person name is: %s", restPerson.getName());
	}
}
