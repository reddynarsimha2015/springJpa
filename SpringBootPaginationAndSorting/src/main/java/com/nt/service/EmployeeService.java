package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository  employeeRepository;
	
	public List<Employee> getAllemployeeList(Integer pageNo,Integer pageSize,String name,String address){
		Sort sortname=Sort.by(name);
		Sort sortAddress=Sort.by(address);
		//Sort sort=sortAddress.and(sortname);
		Pageable  p = PageRequest.of(pageNo, pageSize, sortname);
		Page<Employee> empList = employeeRepository.findAll(p);
		return empList.getContent();
		
	}
}
