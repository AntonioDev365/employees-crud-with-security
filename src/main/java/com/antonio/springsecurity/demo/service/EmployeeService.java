package com.antonio.springsecurity.demo.service;

import com.antonio.springsecurity.demo.entity.Employee;

import java.util.List;
public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

	public List<Employee> searchBy(String theName);
	
}
