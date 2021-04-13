package com.bvr.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bvr.domain.Employee;
import com.bvr.repository.EmployeeRepository;

@Controller
public class IndexController {

	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/home")
	public String home(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findAll();
		model.put("employees", employees);
		return "home";
	}
	
	
	@RequestMapping(value="addEmployee", method=RequestMethod.POST)
	public String addCar(@ModelAttribute Employee employee)
	{
		repository.save(employee);
		return "redirect:home";
	}
	
	
	@GetMapping("/employeeList")
	public String employeeList(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findAll();
		model.put("employees", employees);
		return "UpdateEmployeeRecord";
	}
	
	
	
	/*
	@GetMapping("/employeeSearch")
	public String employeeSearch(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findAll();
		model.put("employees", employees);
		return "EmployeeSearchListScreen";
	}
	
	
	@GetMapping("/employeeSearchList")
	public String employeeSearchList(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findById();
		model.put("employees", employees);
		return "EmployeeSearchListScreen";
	}
	*/
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="addEmployeeRec", method=RequestMethod.POST)
	public String addEmployeeRec(@ModelAttribute Employee employee)
	{
		repository.save(employee);
		return "redirect:displayEmployees";
	}
	
	@GetMapping("/displayEmployees")
	public String employeeList1(Map<String, Object> model)
	{
		List<Employee> employees= (ArrayList<Employee>)repository.findAll();
		model.put("employees", employees);
		return "DisplayEmployees";
	}
}
