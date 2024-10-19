package com.dev.service;

import java.util.List;

import com.dev.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployee();
	
	Employee addEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	String deleteEmployee(int id);

}
