package com.bvr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bvr.domain.Employee;
import com.bvr.repository.EmployeeRepository;
import com.bvr.services.AppServices;

@Controller
public class SearchController {

	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private AppServices appservice;


	
	@GetMapping("/employeeSearch")
	public String employeeSearch(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findAll();
		model.put("employees", employees);
		return "EmployeeSearchListScreen";
	}
	
	@RequestMapping("/employeeSearch/search_id")
	public String employee_byID(Model model,@RequestParam("emp_id") Integer emp_id ) {
		model.addAttribute("Employee", appservice.getDetailById(emp_id));
		if(appservice.findPKey(emp_id))
			return "EmployeeSearchListScreen";
		else
			return "error";
	}
	
	
	@RequestMapping("/employeeSearch/{employee_id}")
	public String employee_Details(@PathVariable Integer employee_id,Model model) {
		model.addAttribute("employee", appservice.getDetailById(employee_id));
		System.out.println("56");
		return "EmployeeSearchListScreen";
	}
	

}
