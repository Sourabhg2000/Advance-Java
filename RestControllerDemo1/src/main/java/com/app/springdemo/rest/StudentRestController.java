package com.app.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	List<Student> theStudents;
	
	public StudentRestController()
	{
		theStudents = new ArrayList<Student>(); 
	}
	
	
	/*
	 * @PostConstruct public void loadData() { theStudents = new
	 * ArrayList<Student>(); theStudents.add(new Student("rahul","pawar"));
	 * theStudents.add(new Student("aishwarya","patil")); theStudents.add(new
	 * Student("xyz","pqr")); }
	 */
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		
		theStudents.add(new Student("rahul","pawar"));
		theStudents.add(new Student("aishwarya","patil"));
		theStudents.add(new Student("xyz","pqr"));
		return theStudents;
	}
	
	@GetMapping("/students/{studentID}")
	public Student getStudent(@PathVariable int studentID)
	{
		return theStudents.get(studentID);
	}
	
	
	//http://localhost:8080/RestControllerDemo/api/students/1
}
