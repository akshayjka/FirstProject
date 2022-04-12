package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController("/")
public class EmpComtroller {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	public String saveEmp(@RequestBody Employee employee) {
		employeeService.save(employee);
		return " employee data saved";
		
	}
}
