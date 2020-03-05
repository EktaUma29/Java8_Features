package com.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.entity.Student;

@RestController
@RequestMapping("/api") // base mapping is api
public class StudentRESTController {

	private List<Student> students;

	// define @PostConstruct to load the student data..... only once

	@PostConstruct
	public void loadData() {

		students = new ArrayList<Student>();
		students.add(new Student("Anurag", "Birthare"));
		students.add(new Student("Ekta", "Birthare"));
		students.add(new Student("Priya", "Sharma"));

	}

	// define endpoint for "/students" - return list of Students

	@GetMapping("/students")
	public List<Student> getStudents() {

		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if(studentId >= students.size() || studentId < 0) {
			
			throw new StudentNotFoundException("Student is not found - " + studentId);
			
		}
		
		return students.get(studentId);
	}
	
	// Add an exception handler using @ExceptionHandler
	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handlerException(StudentNotFoundException exception){
//		
//		StudentErrorResponse errorResponse = new StudentErrorResponse();
//		errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
//		errorResponse.setMessage(exception.getMessage());
//		errorResponse.setTimeStamp(System.currentTimeMillis());
//		
//		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
//	}
//	
//	// add another exception handler ... to catch any exception (catch all)
//	
//	@ExceptionHandler
//	public ResponseEntity<StudentErrorResponse> handlerException(Exception exception){
//		
//		StudentErrorResponse errorResponse = new StudentErrorResponse();
//		errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
//		errorResponse.setMessage("Student is not found - ");
//		errorResponse.setTimeStamp(System.currentTimeMillis());
//		
//		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//	}
	
	

}
