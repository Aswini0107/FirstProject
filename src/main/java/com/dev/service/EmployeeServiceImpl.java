package com.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.dao.EmployeeDao;
import com.dev.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
 
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployee() {
		
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		 Employee status = employeeDao.findById(employee.getId()).orElse(null);
		 
		 if(status==null) {
			 return employeeDao.save(employee);
		 }
		 
		 else {
			 employee.setName(employee.getName());
			 employee.setAddress(employee.getAddress());
			 return employeeDao.save(employee);
		 }
	}

	@Override
	public String deleteEmployee(int id) {
		employeeDao.deleteById(id);
		
		return "Deleted Successfully";
	}

}
