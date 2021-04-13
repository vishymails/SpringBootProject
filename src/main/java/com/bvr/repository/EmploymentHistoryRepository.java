package com.bvr.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bvr.domain.EmploymentHistory;

public interface EmploymentHistoryRepository extends CrudRepository<EmploymentHistory, Integer> {

	//List<EmployeeRepository> findByName(String name);
	
	@Query("select u from EmploymentHistory u where u.empId = :empId")
	List<EmploymentHistory> findByEmpId(int empId);
	
}
