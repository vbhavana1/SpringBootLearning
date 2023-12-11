package com.learning.learningspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/displayemp")
public class Employee {
	
//	@Autowired
//	EmployeeList el;
	
	List<EmployeeList> displayEmployee(){
		List<EmployeeList> el= new ArrayList<EmployeeList>();
		((EmployeeList) el).setId(1);
		((EmployeeList) el).setName("bhavana");
		((EmployeeList) el).setLocation("bangloe");
	
		return  el;
		
	}

}
