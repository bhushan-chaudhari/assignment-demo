package com.bhushan.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhushan.demo.model.CustomResponse;
import com.bhushan.demo.model.Student;
import com.bhushan.demo.repository.StudentRepository;

@RestController
public class MyRestController {

	
	@Autowired
	StudentRepository studentRepository;
	
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	
	@PostMapping
	public ResponseEntity<CustomResponse> addStudent(@RequestBody Student s){
		 Student resp = studentRepository.insert(s);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
}
