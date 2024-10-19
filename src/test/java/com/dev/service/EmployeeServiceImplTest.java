package com.dev.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.dao.EmployeeDao;

@SpringBootTest
public class EmployeeServiceImplTest {
	
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;
	
	@Mock
	private EmployeeDao employeeDao;
	
	@BeforeEach
	public void setUp(){
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void getEmployeeTest() {
		employeeServiceImpl.getEmployee();
	}
	


}
