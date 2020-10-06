package com.example.webday5restmethods.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webday5restmethods.model.Student;
import com.example.webday5restmethods.rest.model.CreateStudentRequest;
import com.example.webday5restmethods.rest.model.UpdateStudentRequest;

@RestController
@RequestMapping("/students")
public class StudentController {

	@GetMapping
	public List<Student> findAll() {
		// do select all
		return new ArrayList<Student>();
	}

	@GetMapping("/{studentId}")
	public Student findById() {
		// do select with id
		return new Student();
	}

	@PostMapping
	public String insert(@RequestBody CreateStudentRequest restStudent) {
		// do insert
		return String.format("Save student with name: %s success", restStudent.getName());
	}

	@PutMapping("/{studentId}")
	public String update(@PathVariable Long studentId, @RequestBody UpdateStudentRequest restBody) {
		// do update
		return String.format("Update student has id: %s with new add: %s success", studentId, restBody.getAddress());
	}

	@DeleteMapping
	public String delete(@RequestBody List<Long> ids) {
		// do delete
		return String.format("Delete students with id in %s success", ids.toString());
	}
}
