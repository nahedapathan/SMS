package com.tka.PMSMSUsingHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.PMSMSUsingHibernate.entity.Student;
import com.tka.PMSMSUsingHibernate.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("getStudent")
	public List<Student> getStudent()
	{
		return service.getStudent();
	}
	
	@PostMapping("insertStudent")
	public Student insertStudent(@RequestBody Student s)
	{
		return service.insertStudent(s);
	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return service.updateStudent(s);
	}
	
	
  
}
