package com.example.webday5restmethods.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday5restmethods.rest.model.UpdateStudentRequest;

@RestController
@RequestMapping("put-endpoints")
public class PutController {

	@PutMapping("/{studentId}")
	public String update(@PathVariable Long studentId, @RequestBody UpdateStudentRequest restBody) {
		// do update
		return String.format("Update student has id: %s with new add: %s success", studentId, restBody.getAddress());
	}
}
