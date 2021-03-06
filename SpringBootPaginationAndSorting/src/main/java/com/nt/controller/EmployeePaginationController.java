package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeePaginationController {

	@Autowired
	EmployeeService service;
	@GetMapping("/v1")
	public List<Employee> getAllemployeeList(@RequestParam(defaultValue = "0") Integer pageno,
			              @RequestParam(defaultValue = "10") Integer pageSize,
			              @RequestParam(defaultValue = "employeeid") String employeeid,
			              @RequestParam(defaultValue = "address") String address){
		
		List<Employee> emplist=service.getAllemployeeList(pageno,pageSize, employeeid,address);
		System.out.println("emplist-------*****---"+emplist.size());
							return emplist;
		
	}
}
