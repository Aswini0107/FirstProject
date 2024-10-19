package com.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.Employee;
import com.dev.service.EmployeeService;


@RestController
public class TableController {
	
    @Autowired
	private EmployeeService employeeService;
	
    @GetMapping("/getEmployee")
    private List<Employee> getEmployee() {
		return employeeService.getEmployee();

	}
    
    @PostMapping("/addEmployee")
    private Employee addEmployee(@RequestBody Employee employee) {
		 return employeeService.addEmployee(employee);

	}
    
    @PutMapping("/updateEmployee")
    private Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
    
    @DeleteMapping("/deleteEmployee/{id}")
    private String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);

	}
    
    
}
