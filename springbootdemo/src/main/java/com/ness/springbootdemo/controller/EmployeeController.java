package com.ness.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ness.springbootdemo.entity.Employee;

@RestController
public class EmployeeController {
	
	private static List<Employee> empList;
	
	static {
		empList = new ArrayList<>();
		empList.add(new Employee(1001, "John", "Manager", 150000));
		empList.add(new Employee(1002, "Ram", "Sr. Manager", 180000));
		empList.add(new Employee(1003, "Amar", "Architect", 200000));
		empList.add(new Employee(1004, "Raj", "Tech Lead", 250000));
		empList.add(new Employee(1005, "Jenny", "Senior Software Engineer", 80000));
	}
	// Get All employee data
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return empList;
	}
	
	// Get employee by id	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable int employeeId) {	
		for(Employee emp:empList) {
			if(emp.getEmployeeId()==employeeId)
				return emp;
		}
		return null;		
	}
	
	//Adding Employee Data
	@PostMapping("/employee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		empList.add(employee);
		return new ResponseEntity<String>("Employee added successfully.", HttpStatus.OK);
	}

}
