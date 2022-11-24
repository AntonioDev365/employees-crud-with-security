package com.antonio.springsecurity.demo.dao;

import java.util.List;

import com.antonio.springsecurity.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Using Spring Data JPA that gives me some crud methods, help to minimize boilerplateCode
//findAll(), findById(), save(),deleteById()
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsAllIgnoreCase(String name, String lName);

}
