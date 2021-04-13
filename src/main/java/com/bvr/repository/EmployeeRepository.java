package com.bvr.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bvr.domain.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	@Query("select u from Employee u where u.firstName = :firstname")
	List<Employee> findByFirstname(String firstname);
	
	
	
}