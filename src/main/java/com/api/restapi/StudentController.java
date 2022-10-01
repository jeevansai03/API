package com.api.restapi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.entity.StudentDetails;
import com.api.restapi.entity.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/studentdetails")
	public List<StudentDetails> getAllStudent(){
	
		List<StudentDetails> studentList = studentRepository.findAll();
		
//		StudentDetails s1 = new StudentDetails(1, "Jeevan", "Sai", "Tirupati", "CS");
//		StudentDetails s2 = new StudentDetails(2, "Sai", "V", "Banglore", "IT");

//		studentList.add(s1);
//		studentList.add(s2);

		return studentList;
	}
}
