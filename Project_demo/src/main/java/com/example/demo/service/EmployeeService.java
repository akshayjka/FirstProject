package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void save(Employee employee) {
		if(employee!=null) {
		this.employeeRepository.save(employee);
		}
		else {
			System.out.println("invalid data");
		}
	}
	
}
