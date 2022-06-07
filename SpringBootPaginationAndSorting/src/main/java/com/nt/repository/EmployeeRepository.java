package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
