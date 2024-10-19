package com.dev.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee , Integer> {

}
