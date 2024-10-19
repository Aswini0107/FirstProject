package com.dev.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EmployeeData")
public class Employee {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column(length=200,nullable=false)
	private int id;
	
	@Column(length=200,nullable=false)
	private String name;
	
	@Column(length=200,nullable=false)
	private String address;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
